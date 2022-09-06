package com.example.SistemaGestionIngresosEgresos.controllers;


import com.example.SistemaGestionIngresosEgresos.entities.Empresa;
import com.example.SistemaGestionIngresosEgresos.services.EmpresaService;
import com.example.SistemaGestionIngresosEgresos.services.Response;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmpresaController {


    //----------------- Definicion de dependencias ------------------------//

    //---- Se define la propiedad para uso del services------//
    private EmpresaService empresaService;

    //- Se define el constructor para la inyeccion de dependencias-//
    public EmpresaController(EmpresaService service){
        this.empresaService = service;
    }


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
}
