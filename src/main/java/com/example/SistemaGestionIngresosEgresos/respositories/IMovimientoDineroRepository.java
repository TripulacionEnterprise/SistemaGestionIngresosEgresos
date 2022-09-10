package com.example.SistemaGestionIngresosEgresos.respositories;

import com.example.SistemaGestionIngresosEgresos.entities.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMovimientoDineroRepository extends JpaRepository<MovimientoDinero,Integer> {
}
