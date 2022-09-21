package com.example.SistemaGestionIngresosEgresos.repositories;

import com.example.SistemaGestionIngresosEgresos.entities.MovimientoDinero;
import com.example.SistemaGestionIngresosEgresos.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMovimientoDineroRepository extends JpaRepository<MovimientoDinero,Long> {
}
