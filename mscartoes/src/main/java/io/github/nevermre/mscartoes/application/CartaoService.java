package io.github.nevermre.mscartoes.application;

import io.github.nevermre.mscartoes.domain.Cartao;
import io.github.nevermre.mscartoes.infra.repository.CartaoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CartaoService {

    private final CartaoRepository repository;

    @Transactional
    public Cartao save( Cartao cartao) {
        return repository.save(cartao);

    }

    public List<Cartao> getCartoesRendaMenorIgual(Long Renda) {
        var rendaBigDecimal = BigDecimal.valueOf(Renda);
        return repository.findByRendaLessThanEqual(rendaBigDecimal);
    }
}
