package com.example.SistemaGestionIngresosEgresos.entities;

public class MovimientoDinero {

    // se definen las propiedades
    private float monto;
    private String concepto;
    private Empleado empleado;


    // se definen los constructores


    public MovimientoDinero() {
    }

    public MovimientoDinero(float monto, String concepto, Empleado empleado) {
        this.monto = monto;
        this.concepto = concepto;
        this.empleado = empleado;
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

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}
