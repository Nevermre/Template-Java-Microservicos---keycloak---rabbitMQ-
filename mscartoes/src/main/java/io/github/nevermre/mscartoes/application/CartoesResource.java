package io.github.nevermre.mscartoes.application;

import io.github.nevermre.mscartoes.application.representation.CartaoSaveRequest;
import io.github.nevermre.mscartoes.application.representation.CartoesPorClienteResponse;
import io.github.nevermre.mscartoes.domain.Cartao;
import io.github.nevermre.mscartoes.domain.ClienteCartao;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("cartoes")
@RequiredArgsConstructor
public class CartoesResource {

    private final CartaoService cartaoService;
    private final ClienteCartaoService clienteCartaoService;

   // @GetMapping
    public String status(){
        return "OK";
    }

    @PostMapping
    public ResponseEntity cadastra(@RequestBody CartaoSaveRequest request){
        Cartao cartao = request.toModel();
        cartaoService.save(cartao);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping(params="renda")
    public ResponseEntity<List<Cartao>> getCartoesRendaAte(@RequestParam("renda") Long renda){
        List<Cartao> cartoesRendaMenorIgual = cartaoService.getCartoesRendaMenorIgual(renda);
        return ResponseEntity.ok(cartoesRendaMenorIgual);
    }


    @GetMapping(params = "cpf")
    public ResponseEntity<List<CartoesPorClienteResponse>> getCartoesPorCliente(@RequestParam("cpf") String cpf){
        List<ClienteCartao> clienteCartoes = clienteCartaoService.listCartoesByCpf(cpf);
        List<CartoesPorClienteResponse> resultList= clienteCartoes.stream().map(CartoesPorClienteResponse::fromModel).collect(Collectors.toList());
        return ResponseEntity.ok(resultList);
    }
}
