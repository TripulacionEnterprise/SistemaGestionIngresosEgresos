package com.example.SistemaGestionIngresosEgresos.controllers.Web;

import com.example.SistemaGestionIngresosEgresos.entities.Empresa;
import com.example.SistemaGestionIngresosEgresos.services.EmpresaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class HomeWebController {

    EmpresaService empresaService;

    public HomeWebController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }

    @GetMapping("/")
    public String index(Model modelo){
        ArrayList<Empresa> empresas = this.empresaService.apiGetEmpresas();
        modelo.addAttribute("empresas", empresas);
        return "/index";
    }
}
