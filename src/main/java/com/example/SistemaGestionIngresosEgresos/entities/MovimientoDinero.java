package com.example.SistemaGestionIngresosEgresos.entities;

public class MovimientoDinero {

    // se definen las propiedades
    private float monto;
    private String concepto;
    private Usuario usuario;


    // se definen los constructores


    public MovimientoDinero() {
    }

    public MovimientoDinero(float monto, String concepto, Usuario usuario) {
        this.monto = monto;
        this.concepto = concepto;
        this.usuario = usuario;
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

    public Usuario getEmpleado() {
        return usuario;
    }

    public void setEmpleado(Usuario usuario) {
        this.usuario = usuario;
    }
}
