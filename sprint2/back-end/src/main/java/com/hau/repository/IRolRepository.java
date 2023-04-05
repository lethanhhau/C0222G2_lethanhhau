package com.hau.repository;

import com.hau.dto.Rol;
import com.hau.enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
    boolean existsByRolNombre(RolNombre rolNombre);
}
