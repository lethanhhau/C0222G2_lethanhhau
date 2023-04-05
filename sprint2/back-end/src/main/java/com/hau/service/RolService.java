package com.hau.service;

import com.hau.dto.Rol;
import com.hau.enums.RolNombre;
import com.hau.repository.IRolRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class RolService {


    @Autowired
    IRolRepository rolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return rolRepository.findByRolNombre(rolNombre);
    }

    public boolean existsRolNombre(RolNombre rolNombre){
        return rolRepository.existsByRolNombre(rolNombre);
    }

    public void save(Rol rol){
        rolRepository.save(rol);
    }
}
