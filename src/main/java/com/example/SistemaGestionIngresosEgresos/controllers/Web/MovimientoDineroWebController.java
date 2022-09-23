package com.example.SistemaGestionIngresosEgresos.controllers.Web;

import com.example.SistemaGestionIngresosEgresos.entities.MovimientoDinero;
import com.example.SistemaGestionIngresosEgresos.services.MovimientoDineroService;
import com.example.SistemaGestionIngresosEgresos.services.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
@Controller
public class MovimientoDineroWebController {
    public MovimientoDineroService movimientoDineroService;

    public MovimientoDineroWebController(MovimientoDineroService movimientoDineroService) {
        this.movimientoDineroService = movimientoDineroService;
    }

    @RequestMapping("/web/transactions")
    public ArrayList<MovimientoDinero> webGetMovimientoDinero(){
        return (ArrayList<MovimientoDinero>) this.movimientoDineroService.getMovimientoDinero();
    }

    @PostMapping("/web/transactions")
    public Response apiCreateMovimientoDinero(@RequestBody MovimientoDinero newMovimientoDinero){
        return this.movimientoDineroService.createMovimientoDinero(newMovimientoDinero);
    }
}
