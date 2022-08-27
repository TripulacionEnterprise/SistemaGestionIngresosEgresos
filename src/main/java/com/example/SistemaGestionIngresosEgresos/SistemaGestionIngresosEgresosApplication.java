package com.example.SistemaGestionIngresosEgresos;

import com.example.SistemaGestionIngresosEgresos.entities.Empleado;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class SistemaGestionIngresosEgresosApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SistemaGestionIngresosEgresosApplication.class, args);

		Empleado empleado1 = new Empleado();
		empleado1.setNombre("pedro perez");
		empleado1.setCorreo("benjamin25@gmail.com");
		empleado1.setNombreEmpresa("ingsoftware");
		empleado1.setRol("administrador");
		System.out.println(empleado1.getNombre() + " " + empleado1.getCorreo() + " " + empleado1.getNombreEmpresa() + " " + empleado1.getRol());
		empleado1.setNombre("tomas Galeano");
		empleado1.setCorreo("tomas125_@hotmail.com");
		empleado1.setNombreEmpresa("Enterprise ");
		empleado1.setRol("admistrador");
		System.out.println(empleado1.getNombre() + ", " + empleado1.getCorreo() + ", " + empleado1.getNombreEmpresa() + ", " + empleado1.getRol());
		Empleado empleado2 = new Empleado("juan gabriel", "juan67@hotmail.com", "tecnotec", "operativo");
		System.out.println(empleado2.getNombre() + ", " + empleado2.getCorreo() + ", " + empleado2.getNombreEmpresa() + ", " + empleado2.getRol());


	}
}