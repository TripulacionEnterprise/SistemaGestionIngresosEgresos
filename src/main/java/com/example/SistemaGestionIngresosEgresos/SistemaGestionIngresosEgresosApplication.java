package com.example.SistemaGestionIngresosEgresos;

import com.example.SistemaGestionIngresosEgresos.entities.Empleado;
import com.example.SistemaGestionIngresosEgresos.entities.Empresa;
import com.example.SistemaGestionIngresosEgresos.entities.MovimientoDinero;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class SistemaGestionIngresosEgresosApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SistemaGestionIngresosEgresosApplication.class, args);

		Empresa empresa1 = new Empresa();
		empresa1.setNombre("Oracle Inc");
		empresa1.setDireccion("USA");
		empresa1.setTelefono("+1 1234654645");
		empresa1.setNit("665464654-0");
		Empleado empleado1 = new Empleado();

		empleado1.setNombre("pedro perez");
		empleado1.setCorreo("benjamin25@gmail.com");
		empleado1.setRol("administrador");
		empleado1.setEmpresa(empresa1);

		MovimientoDinero movimientoDinero1 = new MovimientoDinero();
		movimientoDinero1.setConcepto("Ingreso");
		movimientoDinero1.setMonto(321000000);
		movimientoDinero1.setEmpleado(empleado1);

		System.out.println(empleado1.getNombre() + " " + empleado1.getCorreo() + " " + empresa1.getNombre() + " " + empleado1.getRol());

		empleado1.setNombre("tomas Galeano");
		empleado1.setCorreo("tomas125_@hotmail.com");
		empresa1.setNombre("Enterprise ");
		empleado1.setRol("operativo");

		System.out.println(empleado1.getNombre() + ", " + empleado1.getCorreo() + ", " + empresa1.getNombre() + ", " + empleado1.getRol());
		Empleado empleado2 = new Empleado("juan gabriel", "juan67@hotmail.com", empresa1, "operativo");
		System.out.println(empleado2.getNombre() + ", " + empleado2.getCorreo() + ", " + empresa1.getNombre() + ", " + empleado2.getRol());


	}
}