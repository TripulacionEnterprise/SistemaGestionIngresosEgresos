package com.example.SistemaGestionIngresosEgresos.controllers.Web;

import com.example.SistemaGestionIngresosEgresos.entities.Empresa;
import com.example.SistemaGestionIngresosEgresos.services.EmpresaService;
import com.example.SistemaGestionIngresosEgresos.services.Response;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;


@Controller
public class EnterpriseController {

    //----------------- Definicion de dependencias ------------------------//

    //---- Se define la propiedad para uso del services------//
    private EmpresaService empresaService;

    //- Se define el constructor para la inyeccion de dependencias-//
    public EnterpriseController(EmpresaService service){
        this.empresaService = service;
    }

    //--------- Metodo para mostrar la lista de empresas-----///////
    @GetMapping("enterprises")
    public String index(Model enterprises){
        ArrayList<Empresa>  Empresas = empresaService.selectAll();
        enterprises.addAttribute("enterprises",Empresas);
        return "Empresa/index";
    }



    //-------Creacion de registros de empresa ------------//

        //------- Metodo para crear una empresa--Retorna vista---------//
    @GetMapping("enterprises/create")
    public String create(){
        return "Empresa/create";
    }

        //------ Metodo para guardar una empresa---Retorna una Respuesta------///
    @PostMapping ("enterprises/store")
    public RedirectView store(Empresa newEmpresa){

        //---- Verifico si todos los campos estan llenos --------///
        if(newEmpresa.getNombre().equals(null) || newEmpresa.getNombre().equals("")){
            return new RedirectView("/enterprises/error");
        }
        if(newEmpresa.getTelefono().equals(null) || newEmpresa.getTelefono().equals("")){
            return new RedirectView("/enterprises/error");
        }
        if(newEmpresa.getNit().equals(null) || newEmpresa.getNit().equals("")){
            return new RedirectView("/enterprises/error");
        }
        if(newEmpresa.getDireccion().equals(null) || newEmpresa.getDireccion().equals("")){
            return new RedirectView("/enterprises/error");
        }

        Empresa empresa = newEmpresa;
        Response response = this.empresaService.createEmpresa(empresa);

        if(response.getCode() == 200){
            return new RedirectView("/enterprises/success");
        }
        else{
            return new RedirectView("/enterprises/error");
        }
    }

    @GetMapping("enterprises/error")
    public String error(){
        return "Empresa/error";
    }


    @GetMapping("enterprises/success")
    public String success(){
        return "Empresa/success";
    }

}
