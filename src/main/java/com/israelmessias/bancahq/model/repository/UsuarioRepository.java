package com.israelmessias.bancahq.model.repository;

import com.israelmessias.bancahq.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Boolean existsByEmail(String email);
    Optional<Usuario> findByEmail(String email);
}
