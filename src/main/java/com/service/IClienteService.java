package com.service;


import com.model.Documentos.Cliente;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface IClienteService {

    // ---------------------------------------------------------------------------------------------------  CREATE
    Mono<Cliente> save(Cliente cliente);

    // ---------------------------------------------------------------------------------------------------    READ
    Flux<Cliente> findAll();

    Mono<Cliente> findById(String id);

    Mono<Cliente> findByNombreCliente(String nombreCliente);

    // ---------------------------------------------------------------------------------------------------  UPDATE
    Mono<Cliente> update(String id, Cliente cliente);

    // -------------------------------------------------------------------------------------------------    DELETE
    Mono<Cliente> delete(String id);



}
