package com.example.SistemaGestionIngresosEgresos.entities;

import javax.persistence.*;

@Entity
@Table(name = "transaction")
public class MovimientoDinero {

    // se definen las propiedades
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "amount")
    private float monto;
    @Column(name = "concept")
    private String concepto;
    @ManyToOne
    @JoinColumn(name = "userid")
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "enterpriseid")
    private Empresa empresa;

    @Column(name="fecha")
    private String fecha;

    // se definen los constructores

    public MovimientoDinero(long id, float monto, String concepto, Usuario usuario, Empresa empresa) {
        this.id = id;
        this.monto = monto;
        this.concepto = concepto;
        this.usuario = usuario;
        this.empresa = empresa;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
