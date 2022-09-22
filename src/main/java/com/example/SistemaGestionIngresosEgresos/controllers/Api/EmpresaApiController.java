package com.example.SistemaGestionIngresosEgresos.controllers.Api;


import com.example.SistemaGestionIngresosEgresos.entities.Empresa;
import com.example.SistemaGestionIngresosEgresos.services.EmpresaService;
import com.example.SistemaGestionIngresosEgresos.services.Response;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmpresaApiController {

    //----------------- Definicion de dependencias ------------------------//

    //---- Se define la propiedad para uso del services------//
    private EmpresaService empresaService;

    //- Se define el constructor para la inyeccion de dependencias-//
    public EmpresaApiController(EmpresaService service){
        this.empresaService = service;
    }

    //----- Para las peticiones GET-------//
    @RequestMapping("/api/enterprises")
    public ArrayList<Empresa> apiGetEmpresas() {
        return this.empresaService.getEmpresas();
    }
    @PostMapping("/api/enterprises")
    public Response apiCreateEmpresa(@RequestBody Empresa newEmpresa) {
        return this.empresaService.createEmpresa(newEmpresa);
    }

    /*
    @RequestMapping("enterprises/{id}")
    public Response getEmpresa(@PathVariable int id){
        Response response =new Response();
        response.setMessage("satisfactorio");
        response.setCode(200);
        return response;
    }

    //----- Para las peticiones POST-------//
    @PostMapping("enterprises")
    public Response createEmpresa(@RequestBody Empresa request){
        Response response =new Response();
        response.setMessage("satisfactorio");
        response.setCode(200);
        return response;
    }

    //---- Para preticiones PATCH---------///
    @PatchMapping("enterprises/{id}")
    public Response updateEmpresa(@PathVariable int id, @RequestBody Empresa request){
        Response response =new Response();
        response.setMessage("satisfactorio");
        response.setCode(200);
        return response;
    }


    //---- Para peticiones DELETE----------//
    @DeleteMapping("enterprises/{id}")
    public Response deleteEmpresa(@PathVariable int id){
        Response response =new Response();
        response.setMessage("satisfactorio");
        response.setCode(200);
        return response;
    }

    /*
    //------------------ Se define los accespoints -----------------//

        //----- Para las peticiones GET-------//
    @RequestMapping("enterprises")
    public ArrayList<Empresa> getEmpresas() {
        return this.empresaService.selectAll();
    }

    @RequestMapping("enterprises/{id}")
    public Empresa getEmpresa(@PathVariable int id){
        return this.empresaService.selectById(id);
    }


        //----- Para las peticiones POST-------//
    @PostMapping("enterprises")
    public Response createEmpresa(@RequestBody Empresa request){
        return this.empresaService.createEmpresa(request);
    }


        //---- Para preticiones PATCH---------///
    @PatchMapping("enterprises/{id}")
    public Response updateEmpresa(@PathVariable int id, @RequestBody Empresa request){
        return this.empresaService.updateEmpresa(id,request);
    }


        //---- Para peticiones DELETE----------//
    @DeleteMapping("enterprises/{id}")
    public Response deleteEmpresa(@PathVariable int id){
        return this.empresaService.deleteEmpresaById(id);
    }

     */
}
