package com.example.SistemaGestionIngresosEgresos.controllers.Web;

import com.example.SistemaGestionIngresosEgresos.entities.MovimientoDinero;
import com.example.SistemaGestionIngresosEgresos.services.MovimientoDineroService;
import com.example.SistemaGestionIngresosEgresos.services.Response;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MovimientoDineroWebController {

    //----------------- Definicion de dependencias ------------------------//

    //---- Se define la propiedad para uso del services------//
    private MovimientoDineroService movimientoDineroService;

    //- Se define el constructor para la inyeccion de dependencias-//
    public MovimientoDineroWebController(MovimientoDineroService service){
        this.movimientoDineroService = service;
    }

    @GetMapping ("/web/transactions")
    public String index(Model model){
        model.addAttribute("movimientos",this.movimientoDineroService.getMovimientoDinero());
        return "movimiento/index";
    }


    @GetMapping("/web/transactions/create")
    public String webCreateMovimiento(Model model){
        model.addAttribute("usuarios", this.movimientoDineroService.getAllNameUsers());
        model.addAttribute("empresas", this.movimientoDineroService.getAllNameEnterprises());
        return "movimiento/create";
    }

    @PostMapping("/web/transactions/store")
    public RedirectView webStoreMovimiento(MovimientoDinero data) {

        //---- Verifico si todos los campos estan llenos --------///
        if(data.getConcepto().equals(null) ||data.getConcepto().equals("")){
            return new RedirectView("/web/transactions/error");
        }
        if(data.getEmpresa().equals(null) || data.getEmpresa().equals("")) {
            return new RedirectView("/web/transactions/error");
        }
        if(data.getMonto()==0 || data.getMonto() ==0) {
            return new RedirectView("/web/transactions/error");
        }

        if(data.getUsuario().equals(null) || data.getUsuario().equals("")){
            return new RedirectView("/web/transactions/error");
        }
        if(data.getFecha().equals(null) || data.getFecha().equals("")){
            return new RedirectView("/web/transactions/error");
        }

        MovimientoDinero movimiento = data;
        Response response = this.movimientoDineroService.createMovimientoDinero(movimiento);

        if(response.getCode() == 200){
            return new RedirectView("/web/transactions/success");
        }
        else{
            return new RedirectView("/web/movimientos/error");
        }

    }

    @GetMapping("web/transactions/error")
    public String erro(){
        return "movimento/error";
    }

    @GetMapping("web/transactions/success")
    public String success(){
        return "movimento/success";
    }


}
