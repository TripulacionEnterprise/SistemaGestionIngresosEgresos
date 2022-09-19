package com.example.SistemaGestionIngresosEgresos.entities;

import javax.persistence.*;

@Entity
@Table(name = "transaction")
public class MovimientoDinero {

    // se definen las propiedades
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "amount")
    private float monto;
    @Column(name = "concept")
    private String concepto;

    // se definen los constructores

    public MovimientoDinero(int id, float monto, String concepto) {
        this.id = id;
        this.monto = monto;
        this.concepto = concepto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
}
