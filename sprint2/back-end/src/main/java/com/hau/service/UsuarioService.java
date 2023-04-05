package com.hau.service;

import com.hau.dto.Usuario;
import com.hau.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class UsuarioService {

    @Autowired
    IUsuarioRepository usuarioRepository;

    public Optional<Usuario> getByEmail(String email){
        return usuarioRepository.findByEmail(email);
    }

    public boolean existsEmail(String email){
        return usuarioRepository.existsByEmail(email);
    }

    public Usuario save(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
}