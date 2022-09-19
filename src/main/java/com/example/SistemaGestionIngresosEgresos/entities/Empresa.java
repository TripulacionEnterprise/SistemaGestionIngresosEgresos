package com.example.SistemaGestionIngresosEgresos.entities;


import javax.persistence.*;

@Entity
@Table(name = "empresa",
        indexes = {
                @Index(name = "uniqueIndex", columnList = "email", unique = true)
        }
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
    @Column(name = "email")
    private String correo;
    @ManyToOne
    @JoinColumn(name = "enterpriseid")
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "transactionid")
    private MovimientoDinero movimientoDinero;

    public Empresa(int id, String nombre, String direccion, String telefono, String correo, Usuario usuario, MovimientoDinero movimientoDinero) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.usuario = usuario;
        this.movimientoDinero = movimientoDinero;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public MovimientoDinero getMovimientoDinero() {
        return movimientoDinero;
    }

    public void setMovimientoDinero(MovimientoDinero movimientoDinero) {
        this.movimientoDinero = movimientoDinero;
    }
}
