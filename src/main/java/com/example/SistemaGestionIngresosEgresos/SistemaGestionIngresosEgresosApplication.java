package com.example.SistemaGestionIngresosEgresos;

import com.example.SistemaGestionIngresosEgresos.entities.Usuario;
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
		Usuario usuario1 = new Usuario();

		usuario1.setNombre("pedro perez");
		usuario1.setCorreo("benjamin25@gmail.com");
		usuario1.setRol("administrador");
		usuario1.setEmpresa(empresa1);

		MovimientoDinero movimientoDinero1 = new MovimientoDinero();
		movimientoDinero1.setConcepto("Ingreso");
		movimientoDinero1.setMonto(321000000);
		movimientoDinero1.setEmpleado(usuario1);

		System.out.println(usuario1.getNombre() + " " + usuario1.getCorreo() + " " + empresa1.getNombre() + " " + usuario1.getRol());

		usuario1.setNombre("tomas Galeano");
		usuario1.setCorreo("tomas125_@hotmail.com");
		empresa1.setNombre("Enterprise ");
		usuario1.setRol("operativo");

		System.out.println(usuario1.getNombre() + ", " + usuario1.getCorreo() + ", " + empresa1.getNombre() + ", " + usuario1.getRol());
		Usuario usuario2 = new Usuario("juan gabriel", "juan67@hotmail.com", empresa1, "operativo");
		System.out.println(usuario2.getNombre() + ", " + usuario2.getCorreo() + ", " + empresa1.getNombre() + ", " + usuario2.getRol());


	}
}