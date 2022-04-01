package com.repository;

import com.model.DTOs.ClienteDTO;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface IClienteRepository extends ReactiveMongoRepository<ClienteDTO,String> {

    // ---------------------------------------------------------------------------------------------------   CREAR
    Mono<ClienteDTO> save(ClienteDTO clienteDTO);


    // ----------------------------------------------------------------------------------------------    MODIFICAR
    Mono<ClienteDTO> update(String id, ClienteDTO clienteDTO);


    // ------------------------------------------------------------------------------------------------   ELIMINAR
    Mono<ClienteDTO> delete(String id);


    // ----------------------------------------------------------------------------------------------------   LEER
    Mono<ClienteDTO> findById(String id);

    Mono<ClienteDTO> findByDocumentoCliente(String documentoCliente);

    Mono<ClienteDTO> findByNombreCliente(String nombreCliente);
}
