package io.github.lucasperes.msclientes.application;

import io.github.lucasperes.msclientes.domain.Cliente;
import io.github.lucasperes.msclientes.infra.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public Cliente save(Cliente cliente) {
        return repository.save(cliente);
    }

    public Optional<Cliente> findByCpf(String cpf) {
        return repository.findByCpf(cpf);
    }

}
