package com.example.SistemaGestionIngresosEgresos.respositories;

import com.example.SistemaGestionIngresosEgresos.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario,Integer> {
}
