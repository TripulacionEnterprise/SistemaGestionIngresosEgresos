package com.example.web.services;


public class MovimientoDinero {

    // se definen las propiedades
    private float monto;
    private String concepto;
    private String usuario;


    // se definen los constructores
    public MovimientoDinero(float monto, String concepto, String usuario) {
        this.monto = monto;
    }



    // se definen los genters y setters
    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
