package com.example.SistemaGestionIngresosEgresos.entities;

import javax.persistence.*;
import java.util.Date;

//Se hace el cambio  de nombre de la clase
//Ya  no se llamara Empleado sino Usuario
//Para seguir con el desarrollo del proyecto web
//@harrison
@Entity
@Table(name = "user",
    indexes = {
        @Index(name = "uniqueIndex", columnList = "email", unique = true)
    }
)
public class Usuario {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        @Column(name = "email")
        private String correo;
        @Column(name = "profile")
        private RolEnum rol;
        @ManyToOne
        @JoinColumn(name = "enterpriseid")
        private Empresa empresa;
        @Column(name = "name")
        private String nombre;
        @Column(name = "address")
        private String direccion;
        @Column(name = "phone")
        private String telefono;
        @Column(name = "identification")
        private String nit;
        @Column(name = "createdAt")
        private Date creadoEn;
        @Column(name = "updatedAt")
        private Date actualizadoEn;

    public Usuario() {
    }

    public Usuario(int id, String correo, RolEnum rol, Empresa empresa, String nombre, String direccion, String telefono, String nit, Date creadoEn, Date actualizadoEn) {
        this.id = id;
        this.correo = correo;
        this.rol = rol;
        this.empresa = empresa;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
        this.creadoEn = creadoEn;
        this.actualizadoEn = actualizadoEn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public RolEnum getRol() {
        return rol;
    }

    public void setRol(RolEnum rol) {
        this.rol = rol;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public Date getCreadoEn() {
        return creadoEn;
    }

    public void setCreadoEn(Date creadoEn) {
        this.creadoEn = creadoEn;
    }

    public Date getActualizadoEn() {
        return actualizadoEn;
    }

    public void setActualizadoEn(Date actualizadoEn) {
        this.actualizadoEn = actualizadoEn;
    }
}







