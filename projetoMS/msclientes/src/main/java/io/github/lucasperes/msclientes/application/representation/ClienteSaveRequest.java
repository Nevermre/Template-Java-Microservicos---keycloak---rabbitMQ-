package io.github.lucasperes.msclientes.application.representation;

import io.github.lucasperes.msclientes.domain.Cliente;
import lombok.Data;

@Data
public class ClienteSaveRequest {

    private String cpf;
    private String nome;
    private Integer idade;

    public Cliente toModel(){
        return new Cliente(this.cpf, this.nome, this.idade);
    }

}
