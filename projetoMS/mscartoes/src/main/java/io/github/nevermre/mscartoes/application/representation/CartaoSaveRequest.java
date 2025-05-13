package io.github.nevermre.mscartoes.application.representation;

import io.github.nevermre.mscartoes.domain.BandeiraCartao;
import io.github.nevermre.mscartoes.domain.Cartao;
import lombok.Data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;

@Data
public class CartaoSaveRequest {
    private String nome;
    private BandeiraCartao bandeira;
    private BigDecimal renda;
    private BigDecimal limite;

    public Cartao toModel(){
        Cartao cartao = new Cartao(nome,bandeira,renda,limite);
        return cartao;

    }
}
