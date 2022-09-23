package com.example.SistemaGestionIngresosEgresos.controllers.Api;

import com.example.SistemaGestionIngresosEgresos.entities.Usuario;
import com.example.SistemaGestionIngresosEgresos.services.Response;
import com.example.SistemaGestionIngresosEgresos.services.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class UsuarioApiController {

    public UsuarioService usuarioService;

    public UsuarioApiController(UsuarioService service) {
        this.usuarioService = service;
    }

    //----- Para las peticiones GET-------//
    @RequestMapping("/api/users")
    public ArrayList<Usuario> apiGetUsuarios() {
        return this.usuarioService.getUsuarios();
    }

    @PostMapping("/api/users")
    public Response getEmpresa(@RequestBody Usuario newUsuario){
        return this.usuarioService.createUsuario(newUsuario);
    }
}
