package com.example.SistemaGestionIngresosEgresos.entities;


import javax.persistence.*;

@Entity
@Table(name = "empresa"/*,
        indexes = {
                @Index(name = "uniqueIndex", columnList = "email", unique = true)
        }*/
)
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String nombre;
    @Column(name = "address")
    private String direccion;
    @Column(name = "phone")
    private String telefono;
    @Column(name = "nit")
    private String nit;

    public Empresa() {
    }

    public Empresa(String nombre, String direccion, String telefono, String nit) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
}
