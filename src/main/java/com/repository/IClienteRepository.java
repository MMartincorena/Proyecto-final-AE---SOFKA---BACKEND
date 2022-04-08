package com.repository;

import com.model.Cliente;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface IClienteRepository extends ReactiveMongoRepository<Cliente,String> {
    Mono<Cliente> findByNombreCliente(String nombreCliente);
}
