package br.com.ecommerce.repository;

import br.com.ecommerce.domain.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {

}
