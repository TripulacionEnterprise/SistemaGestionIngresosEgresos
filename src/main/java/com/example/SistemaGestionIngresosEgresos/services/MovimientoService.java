package com.example.SistemaGestionIngresosEgresos.services;

import com.example.SistemaGestionIngresosEgresos.entities.Empresa;
import com.example.SistemaGestionIngresosEgresos.entities.MovimientoDinero;
import com.example.SistemaGestionIngresosEgresos.repositories.IEmpresaRepository;
import com.example.SistemaGestionIngresosEgresos.repositories.IMovimientoDineroRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class MovimientoService {

    //----------------- Definicion de dependencias ------------------------//
    //---- Se define las propiedades -------//
    private IMovimientoDineroRepository movimientoRepository;
    //---- Se define el constructor para la inyeccion de dependencias -------//
    public MovimientoService(IMovimientoDineroRepository repository){
        this.movimientoRepository=repository;
    }


    //------------- Se definen los metodos--------------------///

        //----- metodo para obtener listado de empresas
    public ArrayList<MovimientoDinero> getMovimientos(){
        return (ArrayList<MovimientoDinero>) this.movimientoRepository.findAll();
    }

    //----- metodo para obtener empresa por ID------------//
    public MovimientoDinero getMovimientoById(long Id){
        Optional<MovimientoDinero> existe = this.movimientoRepository.findById(Id);

        if(existe.isPresent()){
            return existe.get();
        }
        else{
            return null;
        }

    }

    public Response createMovimiento(MovimientoDinero  data){
        Response response =new Response();

        try {
            this.movimientoRepository.save(data);
            response.setCode(200);
            response.setMessage("Movimiento registrado exitosamente");
            return response;
        }
        catch (Exception ex){
            response.setCode(500);
            response.setMessage("Error" + ex.getMessage());
            return  response;
        }


    }



}
