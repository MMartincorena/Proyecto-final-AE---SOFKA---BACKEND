package com.service;

import com.model.DTOs.ClienteDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface IClienteService {

    Mono<ClienteDTO> save(ClienteDTO clienteDTO);

    Mono<ClienteDTO> delete(String id);

    Mono<ClienteDTO> deleteById(Object id);

    Mono<ClienteDTO> update(String id, ClienteDTO clienteDTO);

    Flux<ClienteDTO> findAll();

    Mono<ClienteDTO> findById(String id);

    Mono<ClienteDTO> findByDocumentoCliente(String documentoCliente);

    Mono<ClienteDTO> findByNombreCliente(String nombreCliente);

}
