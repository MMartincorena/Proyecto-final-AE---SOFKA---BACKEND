package com.service;

import com.model.Proveedor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IProveedorService {
    // ---------------------------------------------------------------------------------------------------  CREATE
    Mono<Proveedor> save(Proveedor proveedor);

    // ---------------------------------------------------------------------------------------------------   READ
    Flux<Proveedor> findAll();

    Mono<Proveedor> findById(String id);

    Mono<Proveedor> findByNombreProveedor(String nombreProveedor);

    // ---------------------------------------------------------------------------------------------------  UPDATE
    Mono<Proveedor> update(String id, Proveedor proveedor);

    // -------------------------------------------------------------------------------------------------    DELETE
    Mono<Proveedor> delete(String id);
}
