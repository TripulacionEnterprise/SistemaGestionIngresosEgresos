package com.example.SistemaGestionIngresosEgresos.controllers;

import com.example.SistemaGestionIngresosEgresos.entities.Usuario;
import com.example.SistemaGestionIngresosEgresos.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class BaseController {

    @Autowired
    protected UsuarioService usuarioService;


    protected Usuario seguridad(){
        Usuario usuario;

        //ingreso a la información de spring security
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        //Tomo el correo electronico que nos guardo spring securiy
        String currentPrincipalName = authentication.getName();
        usuario = this.usuarioService.selectByUserName(currentPrincipalName);
        return  usuario;
    }
}
