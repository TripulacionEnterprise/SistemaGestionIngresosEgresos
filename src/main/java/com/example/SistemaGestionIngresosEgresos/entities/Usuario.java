package com.example.SistemaGestionIngresosEgresos.entities;

import javax.persistence.*;
import java.util.Date;

//Se hace el cambio  de nombre de la clase
//Ya  no se llamara Empleado sino Usuario
//Para seguir con el desarrollo del proyecto web
//@harrison

@Entity
@Table(name = "users",
    indexes = {
        @Index(name = "uniqueIndex", columnList = "email", unique = true)
    }
)
public class Usuario {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        @Column(name = "email")
        private String correo;
        @Column(name = "name")
        private String nombre;
        @Column(name = "phone")
        private String telefono;
        @Column(name = "rol")
        private RolEnum rol;

    public Usuario() {
    }

    public Usuario(long id, String correo, String nombre, String telefono
            , RolEnum rol
    ) {
        this.id = id;
        this.correo = correo;
        this.nombre = nombre;
        this.telefono = telefono;
        this.rol = rol;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public RolEnum getRol() {
        return rol;
    }

    public void setRol(RolEnum rol) {
        this.rol = rol;
    }


}

