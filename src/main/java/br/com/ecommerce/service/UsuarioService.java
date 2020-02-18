package br.com.ecommerce.service;

import br.com.ecommerce.domain.Usuario;

import java.util.List;

public interface UsuarioService {
    List<Usuario> findAll();

    Usuario saveOrUpdate(Usuario usuario);
}
