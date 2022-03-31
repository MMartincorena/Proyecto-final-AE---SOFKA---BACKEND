package com.repository;

import com.model.DTOs.ClienteDTO;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface IClienteRepository extends ReactiveMongoRepository<ClienteDTO,String> {
    Flux<ClienteDTO> findByIdCliente(String documentoCliente);      // Buscar cliente por ID

}
