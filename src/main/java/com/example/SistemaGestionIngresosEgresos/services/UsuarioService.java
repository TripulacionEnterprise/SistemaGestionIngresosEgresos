package com.example.SistemaGestionIngresosEgresos.services;

import com.example.SistemaGestionIngresosEgresos.entities.Usuario;
import com.example.SistemaGestionIngresosEgresos.repositories.IUsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioService {

    private IUsuarioRepository usuarioRepository;

    public UsuarioService(IUsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public ArrayList<Usuario> getUsuarios(){
        return (ArrayList<Usuario>) this.usuarioRepository.findAll();
    }
    public Response createUsuario(Usuario data){
        Response response = new Response();
        try {
            this.usuarioRepository.save(data);
            response.setCode(200);
            response.setMessage("Usuario registrado exitosamente");
        }
        catch (Exception ex){
            response.setCode(500);
            response.setMessage("Error" + ex.getMessage());
        }
        finally {
            return response;
        }
    }
}