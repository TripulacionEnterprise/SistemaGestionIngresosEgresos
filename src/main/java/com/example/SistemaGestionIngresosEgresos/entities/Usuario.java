package com.example.SistemaGestionIngresosEgresos.entities;

import javax.persistence.*;

//Se hace el cambio  de nombre de la clase
//Ya  no se llamara Empledo sino Usuario
//Para saeguir con el desarrollo del proyecto web
//@harrison
@Entity
@Table(name = "Usuario")
public class Usuario {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "nombre")
        private String nombre;
        @Column(name = "correo")
        private String correo;

        @Column(name = "empresa")
        private String empresa;
        @Column(name = "rol")
        private String rol;

    public Usuario() {
    }

    public Usuario(String nombre, String correo, Empresa empresa, String rol) {
        this.nombre = nombre;
        this.correo = correo;
        this.empresa = empresa;
        this.rol = rol;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        if(rol.toLowerCase().equals("administrador"))
            this.rol = rol;
        else
            if(rol.toLowerCase().equals("operativo"))
                this.rol = rol;
            else
                this.rol = null;
    }
}







