package com.example.SistemaGestionIngresosEgresos.controllers;

import com.example.SistemaGestionIngresosEgresos.services.EmpresaService;

import org.springframework.web.bind.annotation.*;

@RestController
public class MovimientoDineroController {
    private EmpresaService empresaService;

    public MovimientoDineroController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }



    @GetMapping("/enterprises/{id}/movements")
    public getMovimientoDinero(@PathVariable int id) {

        return this.empresaService.selectById (id);

    }

    @DeleteMapping("/enterprises/{id}/movements")
    public getMovimientoDinero(@PathVariable int id) {

        return this.empresaService.selectById (id);

    }
    @PostMapping ("/enterprises/{id}/movements")
    public getMovimientoDinero(@PathVariable int id) {

        return this.empresaService.selectById (id);


    }
    @PatchMapping ("/enterprises/{id}/movements")
    public getMovimientoDinero(@PathVariable int id) {

        return this.empresaService.selectById (id);


    }

}
