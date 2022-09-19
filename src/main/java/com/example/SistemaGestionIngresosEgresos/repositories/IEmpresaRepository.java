package com.example.SistemaGestionIngresosEgresos.repositories;

import com.example.SistemaGestionIngresosEgresos.entities.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpresaRepository extends JpaRepository<Empresa,Integer> {
}
