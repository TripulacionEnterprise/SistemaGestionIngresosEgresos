package com.example.SistemaGestionIngresosEgresos.services;

import com.example.SistemaGestionIngresosEgresos.entities.Empresa;
import com.example.SistemaGestionIngresosEgresos.repositories.IEmpresaRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class EmpresaService {

    //----------------- Definicion de dependencias ------------------------//
    //---- Se define las propiedades -------//
    private IEmpresaRepository empresaRepository;
    //---- Se define el constructor para la inyeccion de dependencias -------//
    public EmpresaService(IEmpresaRepository repository){
        this.empresaRepository=repository;
    }
    //------------- Se definen los metodos--------------------///
    //------metodo para obtener todas las empresas------///
    public ArrayList<Empresa> apiGetEmpresas(){
        return (ArrayList<Empresa>) this.empresaRepository.findAll();
    }

    public Empresa apiCreateEmpresa(Empresa newEmpresa) {
        return this.empresaRepository.save(newEmpresa);
    }
    public String webGetEmpresas(){
        return "Hola mundo";
    }

/*
       //----- metodo para obtener empresa por ID------------//
    public Empresa selectById(long Id){
        Optional<Empresa> existe = this.empresaRepository.findById(Id);

        if(existe.isPresent()){
            return existe.get();
        }
        else{
            return null;
        }

    }

        //------ metodo para crear Empresa-----------//
    public Response createEmpresa(Empresa data){
        Response response =new Response();
        this.empresaRepository.save(data);
        response.setCode(200);
        response.setMessage("Empresa registrada exitosamente");
        return response;
    }

        //---- metodo para actualizar Empresa------//
    public Response updateEmpresa(int Id, Empresa data ){
        Response response =new Response();

        if(Id == 0){
            response.setCode(500);
            response.setMessage("Error, el Id del usuario no es válido.");
            return response;
        }

            //------- Validacion si el usuario existe -----//
        Empresa existe =selectById(Id);

        if(existe == null){
            response.setCode(500);
            response.setMessage("Error, La Empresa no existe en la base de datos.");
            return response;
        }

            //----Se valida y actualiza datos provenientes de la peticion--//
        if(data.getNombre()!= null){
            existe.setNombre(data.getNombre());
        }

        if(data.getDireccion()!= null ){
            existe.setDireccion(data.getDireccion());
        }

        if(data.getTelefono()!= null){
            existe.setTelefono(data.getTelefono());
        }

        /*
        if(data.getNit()!= null){
            existe.setNit(data.getNit());
        }

        this.empresaRepository.save(existe);
        response.setCode(200);
        response.setMessage("Empresa actualizada exitosamente");

        return response;

    }

        //---- metodo para eliminar Empresa------//
    public Response deleteEmpresaById(long Id){
        Response response = new Response();
        try {
            this.empresaRepository.deleteById(Id);
            response.setCode(200);
            response.setMessage("Empresa eliminada exitosamente");
            return response;
        }
        catch (Exception ex){
            response.setCode(500);
            response.setMessage("Error" + ex.getMessage());
            return  response;
        }
    }

 */
}
