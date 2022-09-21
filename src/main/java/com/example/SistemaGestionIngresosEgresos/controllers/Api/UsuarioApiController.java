package com.example.SistemaGestionIngresosEgresos.controllers.Api;

import com.example.SistemaGestionIngresosEgresos.entities.Empresa;
import com.example.SistemaGestionIngresosEgresos.services.Response;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioApiController {


    //----- Para las peticiones GET-------//
    @RequestMapping("users")
    public Response getEmpresas() {
        Response response =new Response();
        response.setMessage("satisfactorio");
        response.setCode(200);
        return response;
    }

    @RequestMapping("user/{id}")
    public Response getEmpresa(@PathVariable int id){
        Response response =new Response();
        response.setMessage("satisfactorio");
        response.setCode(200);
        return response;
    }

    //----- Para las peticiones POST-------//
    @PostMapping("user")
    public Response createEmpresa(@RequestBody Empresa request){
        Response response =new Response();
        response.setMessage("satisfactorio");
        response.setCode(200);
        return response;
    }

    //---- Para preticiones PATCH---------///
    @PatchMapping("user/{id}")
    public Response updateEmpresa(@PathVariable int id, @RequestBody Empresa request){
        Response response =new Response();
        response.setMessage("satisfactorio");
        response.setCode(200);
        return response;
    }


    //---- Para peticiones DELETE----------//
    @DeleteMapping("user/{id}")
    public Response deleteEmpresa(@PathVariable int id){
        Response response =new Response();
        response.setMessage("satisfactorio");
        response.setCode(200);
        return response;
    }





    /*
    private UsuarioService usuarioService;

    public UsuarioApiController(UsuarioService usuarioService) {
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
   */
}
