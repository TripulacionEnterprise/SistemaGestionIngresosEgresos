package com.example.SistemaGestionIngresosEgresos.entities;

public class Empleado {
        private String nombre;
        private String correo;

        private Empresa empresa;
        private String rol;

    public Empleado() {
    }

    public Empleado(String nombre, String correo, Empresa empresa, String rol) {
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







