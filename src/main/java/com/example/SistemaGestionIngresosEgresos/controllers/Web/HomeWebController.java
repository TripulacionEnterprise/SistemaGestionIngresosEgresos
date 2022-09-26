package com.example.SistemaGestionIngresosEgresos.controllers.Web;

import com.example.SistemaGestionIngresosEgresos.controllers.BaseController;
import com.example.SistemaGestionIngresosEgresos.entities.Empresa;
import com.example.SistemaGestionIngresosEgresos.entities.Usuario;
import com.example.SistemaGestionIngresosEgresos.services.EmpresaService;
import com.example.SistemaGestionIngresosEgresos.services.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;

import java.util.Map;

@Controller
public class HomeWebController extends BaseController {

    @GetMapping("/")
    public String inicio(Model data, @AuthenticationPrincipal OidcUser principal){
        return "home/inicio";
    }

    @GetMapping("main")
    public String main(Model model, @AuthenticationPrincipal OidcUser principal) {
        return "home/main";
    }
    @GetMapping("error")
    public String error(){
        return "home/error";
    }
}
