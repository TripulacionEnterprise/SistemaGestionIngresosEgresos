package com.example.SistemaGestionIngresosEgresos.controllers.Web;

import com.example.SistemaGestionIngresosEgresos.entities.Usuario;
import com.example.SistemaGestionIngresosEgresos.services.Response;
import com.example.SistemaGestionIngresosEgresos.services.UsuarioService;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
@Controller
public class UsuarioWebController {
    public UsuarioService usuarioService;

    public UsuarioWebController(UsuarioService service) {
        this.usuarioService = service;
    }

    @RequestMapping("web/users")
    public String webGetUsuarios(@NotNull Model modelo){
        ArrayList<Usuario> usuarios = this.usuarioService.getUsuarios();
        modelo.addAttribute("usuarios", usuarios);
        return "usuario/index";
    }
    @GetMapping("web/users/create")
    public String webCreateUsuario(){
        return "usuario/create";
    }

    @PostMapping("web/users/store")
    public RedirectView webStoreUsuario(Usuario newUsuario){

        //---- Verifico si todos los campos estan llenos --------///
        if(newUsuario.getNombre().equals(null) || newUsuario.getNombre().equals("")){
            return new RedirectView("web/users/error");
        }
        if(newUsuario.getTelefono().equals(null) || newUsuario.getTelefono().equals("")){
            return new RedirectView("web/users/error");
        }

        if(newUsuario.getRol().equals(null) || newUsuario.getRol().equals("")){
            return new RedirectView("web/users/error");
        }

        if(newUsuario.getCorreo().equals(null) || newUsuario.getCorreo().equals("")){
            return new RedirectView("web/users/error");
        }

        Usuario usuario = newUsuario;
        Response response = this.usuarioService.createUsuario(usuario);

        if(response.getCode() == 200){
            return new RedirectView("web/users/success");
        }
        else{
            return new RedirectView("web/users/error");
        }
    }

    @GetMapping("web/users/error")
    public String error(){
        return "usuario/error";
    }

    @GetMapping("web/users/success")
    public String success(){
        return "usuario/success";
    }

}
