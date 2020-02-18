package br.com.ecommerce.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;

@Document(collection = "usuarios")
@Data
public class Usuario {
    @Id
    private String id;

    private String nome;
    //@Indexed(unique = true)
    private String cpf;
    private String endereco;
    private String telefone;
    private String email;
}
