package com.service;

import com.model.Producto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IProductoService {
    // ---------------------------------------------------------------------------------------------------  CREATE
    Mono<Producto> save(Producto producto);

    // ---------------------------------------------------------------------------------------------------   READ
    Flux<Producto> findAll();

    Mono<Producto> findById(String id);

    Mono<Producto> findByNombreProducto(String nombreProducto);

    // ---------------------------------------------------------------------------------------------------  UPDATE
    Mono<Producto> update(String id, Producto producto);

    // -------------------------------------------------------------------------------------------------    DELETE
    Mono<Producto> delete(String id);
}
