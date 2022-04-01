package com.service;

import com.model.DTOs.ClienteDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface IClienteService {

    // ---------------------------------------------------------------------------------------------------   CREAR
    Mono<ClienteDTO> save(ClienteDTO clienteDTO);


    // ----------------------------------------------------------------------------------------------    MODIFICAR
    Mono<ClienteDTO> update(String id, ClienteDTO clienteDTO);


    // ------------------------------------------------------------------------------------------------   ELIMINAR
    Mono<ClienteDTO> delete(String id);

    Mono<ClienteDTO> deleteById(Object id);


    // ----------------------------------------------------------------------------------------------------   LEER
    Mono<ClienteDTO> findById(String id);

    Flux<ClienteDTO> findAll();

    Mono<ClienteDTO> findByDocumentoCliente(String documentoCliente);

    Mono<ClienteDTO> findByNombreCliente(String nombreCliente);

}
