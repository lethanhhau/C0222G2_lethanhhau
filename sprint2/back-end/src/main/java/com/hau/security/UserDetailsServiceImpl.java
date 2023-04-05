package com.hau.security;

import com.hau.dto.Usuario;
import com.hau.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario usuario = usuarioService.getByEmail(email).orElseThrow(()-> new UsernameNotFoundException("email no encontrado"));
        return UsuarioPrincipalFactory.build(usuario);
    }
}
