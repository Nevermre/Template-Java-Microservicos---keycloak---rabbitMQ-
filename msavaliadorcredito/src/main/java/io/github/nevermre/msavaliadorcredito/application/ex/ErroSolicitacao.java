package io.github.nevermre.msavaliadorcredito.application.ex;

public class ErroSolicitacao extends RuntimeException {
    public ErroSolicitacao(String message) {
        super(message);
    }
}
