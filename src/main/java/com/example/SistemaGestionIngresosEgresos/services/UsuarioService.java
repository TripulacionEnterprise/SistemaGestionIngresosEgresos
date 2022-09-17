package com.example.SistemaGestionIngresosEgresos.services;

import com.example.SistemaGestionIngresosEgresos.entities.Usuario;
import com.example.SistemaGestionIngresosEgresos.repositories.IUsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioService {

    /*
    //Definiendo propiedades

    private IUsuarioRepository usuarioRepository;


    //Definiendo constructor para la inyeccion de dependencias

    public UsuarioService(IUsuarioRepository repo) {
        this.usuarioRepository = repo;
    }


    // Definiendo metodos

    //Metodo para consultar todos los usuarios
    public ArrayList<Usuario> selectAll() {
        return (ArrayList<Usuario>) this.usuarioRepository.findAll();
    }


    //Metodo para consultar un solo usuario
    public Usuario selectById(int Id) {
        Optional<Usuario> existe = this.usuarioRepository.findById(Id);

        if (existe.isPresent()) {
            return existe.get();
        } else {
            return null;
        }

    }

    //Metodo  para crear un usuario
    public Response createUsuario(Usuario data) {
        Response response = new Response();
        this.usuarioRepository.save(data);
        response.setCode(200);
        response.setMessage("Usuario registrado exitosamente");
        return response;
    }

    //Metodo para editar un usuario
    public Response updateUsuario(int Id, Usuario data) {
        Response response = new Response();

        if (Id == 0) {
            response.setCode(500);
            response.setMessage("Error, el Id del usuario no es válido.");
            return response;
        }

        //Validando usuario
        Usuario existe = selectById(Id);

        if (existe == null) {
            response.setCode(500);
            response.setMessage("Error, el usuario no existe en la base de datos.");
            return response;
        }

        //Actualizacion de datos
        if (data.getNombre() != null) {
            existe.setNombre(data.getNombre());
        }

        if (data.getDireccion() != null) {
            existe.setDireccion(data.getDireccion());
        }

        if (data.getTelefono() != null) {
            existe.setTelefono(data.getTelefono());
        }

        if (data.getNit() != null) {
            existe.setNit(data.getNit());
        }

        this.usuarioRepository.save(existe);
        response.setCode(200);
        response.setMessage("Usurio actualizado exitosamente");

        return response;

    }

    //Metodo para eliminar un usuario
    public Response deleteUsuarioById(int Id) {
        Response response = new Response();
        try {
            this.usuarioRepository.deleteById(Id);
            response.setCode(200);
            response.setMessage("Usuario eliminado exitosamente");
            return response;
        } catch (Exception ex) {
            response.setCode(500);
            response.setMessage("Error" + ex.getMessage());
            return response;
        }
    }


     */
}