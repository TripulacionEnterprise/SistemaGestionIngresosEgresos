package com.example.SistemaGestionIngresosEgresos.respositories;


import org.springframework.stereotype.Repository;
@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario,Integer> {
}
