package com.example.SistemaGestionIngresosEgresos.controllers.Api;

import com.example.SistemaGestionIngresosEgresos.entities.Empresa;
import com.example.SistemaGestionIngresosEgresos.entities.MovimientoDinero;
import com.example.SistemaGestionIngresosEgresos.services.MovimientoDineroService;
import com.example.SistemaGestionIngresosEgresos.services.Response;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class MovimientoDineroApiController {

    private MovimientoDineroService movimientoDineroService;

    public MovimientoDineroApiController(MovimientoDineroService movimientoDineroService) {
        this.movimientoDineroService = movimientoDineroService;
    }

    @RequestMapping("/api/transactions")
    public ArrayList<MovimientoDinero> apiGetMovimientoDinero() {
        return this.movimientoDineroService.getMovimientoDinero();
    }

    @GetMapping("enterprises/{id}/movements")
    public Response getMovimientoDinero(@PathVariable int id) {
        Response response =new Response();
        response.setMessage("satisfactorio");
        response.setCode(200);
        return response;
    }

    @DeleteMapping("enterprises/{id}/movements")
    public Response deleteMovimientoDinero(@PathVariable int id) {

        Response response =new Response();
        response.setMessage("satisfactorio");
        response.setCode(200);
        return response;

    }
    @PostMapping("enterprises/{id}/movements")
    public Response createMovimientoDinero(@PathVariable int id) {

        Response response =new Response();
        response.setMessage("satisfactorio");
        response.setCode(200);
        return response;

    }
    @PatchMapping("enterprises/{id}/movements")
    public Response updateMovimientoDinero(@PathVariable int id) {
        Response response =new Response();
        response.setMessage("satisfactorio");
        response.setCode(200);
        return response;
    }


}
