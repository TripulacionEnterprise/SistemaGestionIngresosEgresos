package com.example.SistemaGestionIngresosEgresos.controllers.Web;

import com.example.SistemaGestionIngresosEgresos.entities.Empresa;
import com.example.SistemaGestionIngresosEgresos.entities.MovimientoDinero;
import com.example.SistemaGestionIngresosEgresos.services.EmpresaService;
import com.example.SistemaGestionIngresosEgresos.services.MovimientoService;
import com.example.SistemaGestionIngresosEgresos.services.Response;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;

@Controller
public class MovimientoDineroWebController {

    //----------------- Definicion de dependencias ------------------------//

    //---- Se define la propiedad para uso del services------//
    private MovimientoService movimientoService;

    //- Se define el constructor para la inyeccion de dependencias-//
    public MovimientoDineroWebController(MovimientoService service){
        this.movimientoService= service;
    }

    @GetMapping ("/web/movimientos")
    public String index(Model model){
        ArrayList<MovimientoDinero> movimientos = this.movimientoService.getMovimientos();
        model.addAttribute("movimientos",movimientos);
        return "movimiento/index";
    }


    @GetMapping("/web/movimientos/create")
    public String webCreateMovimiento(){
        return "movimiento/create";
    }

    @PostMapping("/web/movimientos/store")
    public RedirectView webStoreMovimiento(MovimientoDinero data) {

        //---- Verifico si todos los campos estan llenos --------///
        if(data.getConcepto().equals(null) ||data.getConcepto().equals("")){
            return new RedirectView("/web/movimientos/error");
        }
        if(data.getEmpresa().equals(null) || data.getEmpresa().equals("")) {
            return new RedirectView("/web/movimientos/error");
        }
        if(data.getMonto()==0 || data.getMonto() ==0) {
            return new RedirectView("/web/movimientos/error");
        }

        if(data.getUsuario().equals(null) || data.getUsuario().equals("")){
            return new RedirectView("/web/movimientos/error");
        }
        if(data.getFecha().equals(null) || data.getFecha().equals("")){
            return new RedirectView("/web/movimientos/error");
        }

        MovimientoDinero movimiento = data;
        Response response = this.movimientoService.createMovimiento(movimiento);

        if(response.getCode() == 200){
            return new RedirectView("/web/movimientos/success");
        }
        else{
            return new RedirectView("/web/movimientos/error");
        }

    }

    @GetMapping("web/movimientos/error")
    public String erro(){
        return "movimento/error";
    }

    @GetMapping("web/movimientos/success")
    public String success(){
        return "movimento/succes";
    }




}
