package br.com.ecommerce.service.impl;

import br.com.ecommerce.domain.Usuario;
import br.com.ecommerce.repository.UsuarioRepository;
import br.com.ecommerce.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario saveOrUpdate(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}
