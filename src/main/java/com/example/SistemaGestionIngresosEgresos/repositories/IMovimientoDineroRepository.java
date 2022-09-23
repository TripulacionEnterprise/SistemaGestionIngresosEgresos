package com.example.SistemaGestionIngresosEgresos.repositories;

import com.example.SistemaGestionIngresosEgresos.entities.MovimientoDinero;
import com.example.SistemaGestionIngresosEgresos.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Repository
public interface IMovimientoDineroRepository extends JpaRepository<MovimientoDinero,Long> {
    @Query(value = "SELECT DISTINCT u.name FROM users u ORDER BY u.name", nativeQuery = true)
    public ArrayList<String> getAllNameUsers();

    @Query(value = "SELECT DISTINCT e.name FROM enterprise e ORDER BY e.name", nativeQuery = true)
    public ArrayList<String> getAllNameEnterprises();
}
