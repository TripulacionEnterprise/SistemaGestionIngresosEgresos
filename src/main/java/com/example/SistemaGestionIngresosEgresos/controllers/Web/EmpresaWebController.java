package com.example.SistemaGestionIngresosEgresos.controllers.Web;

import com.example.SistemaGestionIngresosEgresos.entities.Empresa;
import com.example.SistemaGestionIngresosEgresos.services.EmpresaService;
import com.example.SistemaGestionIngresosEgresos.services.Response;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;


@Controller
public class EmpresaWebController {

    //----------------- Definicion de dependencias ------------------------//

    //---- Se define la propiedad para uso del services------//
    private EmpresaService empresaService;

    //- Se define el constructor para la inyeccion de dependencias-//
    public EmpresaWebController(EmpresaService service){
        this.empresaService = service;
    }

    //--------- Metodo para mostrar la lista de empresas-----///////

    @RequestMapping("/web/enterprises")
    public String webGetEmpresas(Model modelo){
        ArrayList<Empresa> empresas = this.empresaService.getEmpresas();
        modelo.addAttribute("empresas", empresas);
        return "empresa/index";
    }
    //-------Creacion de registros de empresa ------------//

    //------- Metodo para crear una empresa--Retorna vista---------//
    @GetMapping("/web/enterprises/create")
    public String webCreateEmpresa(){
        return "empresa/create";
    }
    //------ Metodo para guardar una empresa---Retorna una Respuesta------///
    @PostMapping("/web/enterprises/store")
    public RedirectView webStoreEmpresa(Empresa newEmpresa){

        //---- Verifico si todos los campos estan llenos --------///
        if(newEmpresa.getNombre().equals(null) || newEmpresa.getNombre().equals("")){
            return new RedirectView("/web/enterprises/error");
        }
        if(newEmpresa.getTelefono().equals(null) || newEmpresa.getTelefono().equals("")){
            return new RedirectView("/web/enterprises/error");
        }

        if(newEmpresa.getDireccion().equals(null) || newEmpresa.getDireccion().equals("")){
            return new RedirectView("/web/enterprises/error");
        }

        if(newEmpresa.getCorreo().equals(null) || newEmpresa.getCorreo().equals("")){
            return new RedirectView("/web/enterprises/error");
        }

        Empresa empresa = newEmpresa;
        Response response = this.empresaService.createEmpresa(empresa);

        if(response.getCode() == 200){
            return new RedirectView("/web/enterprises/success");
        }
        else{
            return new RedirectView("/web/enterprises/error");
        }
    }

    @GetMapping("/web/enterprises/error")
    public String error(){
        return "empresa/error";
    }

    @GetMapping("/web/enterprises/success")
    public String success(){
        return "empresa/success";
    }

/*
    @GetMapping("enterprises")
    public String index(Model enterprises){
        ArrayList<Empresa>  Empresas = empresaService.selectAll();
        enterprises.addAttribute("enterprises",Empresas);
        return "Empresa/index";
    }

    @GetMapping("enterprises")
    public String empresasregistradas(Model empresas){
        ArrayList<Empresa> empresasDB = this.empresaService.selectAll();
        empresas.addAttribute("empresas",empresasDB);
        return "/Empresa/index";
    }






 */
}
