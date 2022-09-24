package com.example.SistemaGestionIngresosEgresos.repositories;

import com.example.SistemaGestionIngresosEgresos.entities.Empresa;
import com.example.SistemaGestionIngresosEgresos.entities.MovimientoDinero;
import com.example.SistemaGestionIngresosEgresos.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Repository
public interface IMovimientoDineroRepository extends JpaRepository<MovimientoDinero,Long> {
    @Query(value = "SELECT u FROM users u ORDER BY u.name", nativeQuery = true)
    public ArrayList<Usuario> getAllNameUsers();
    @Query(value = "SELECT u FROM users u WHERE u.name = ?1", nativeQuery = true)
    public ArrayList<Usuario> findIdUserByName(String nombre);

    @Query(value = "SELECT e FROM enterprise e ORDER BY e.name", nativeQuery = true)
    public ArrayList<Empresa> getAllNameEnterprises();
    @Query(value = "SELECT e FROM enterprise e WHERE e.name = ?1", nativeQuery = true)
    public ArrayList<Empresa> findIdEnterpriseByName(String nombre);
}
