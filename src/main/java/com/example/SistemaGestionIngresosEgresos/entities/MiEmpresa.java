package com.Empresa;

public class MiEmpresa {

    private String NombreEmpresa;
    private String Direccion;
    private int NumeroTelefono;
    private int Nit;


    public String getNombreEmpresa() {
        return NombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.NombreEmpresa = nombreEmpresa;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        this.Direccion = direccion;
    }

    public int getNumeroTelefono() {
        return NumeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.NumeroTelefono = numeroTelefono;
    }

    public int getNit() {
        return Nit;
    }

    public void setNit(int nit) {
        this.Nit = nit;
    }
}
