package com.example.SistemaGestionIngresosEgresos.repositories;

import com.example.SistemaGestionIngresosEgresos.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario,Long> {
    @Query(value = "SELECT u FROM users u WHERE u.name = ?1", nativeQuery = true)
    Usuario findUserByUserName(String nombre);

}
