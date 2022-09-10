package com.example.SistemaGestionIngresosEgresos.controllers;

import com.example.SistemaGestionIngresosEgresos.entities.Usuario;
import com.example.SistemaGestionIngresosEgresos.services.Response;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class UsuarioController {
    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    // Método GET

    // Consultar Todos los Uduarios
    @RequestMapping("/users")
    public ArrayList<Usuario> getusuarios(){
        return (ArrayList<Usuario>) this.usuarioService.selectAll();
    }

    // Método POST

    @PostMapping("/users")
    public Response createUsuario(@RequestBody Usuario usuario) {
        return this.usuarioService.createUsuario(usuario);
    }

    // Método GET
    @GetMapping("/user/{id}")
    public Usuario getusuario(@PathVariable int id) {
        return (Usuario) this.usuarioService.selectById(id);
    }

    // Método PATCH
    @PatchMapping("/user/{id}")
    public Response updateUsuario(@PathVariable int id, @RequestBody Usuario usuario){
        return this.usuarioService.updateUsuario(id, usuario);
    }

    // Método DELETE
    @DeleteMapping("/user/{id}")
    public Response deleteUsuario(@PathVariable int id){
        return this.usuarioService.deleteUsuarioById(id);
    }

}
