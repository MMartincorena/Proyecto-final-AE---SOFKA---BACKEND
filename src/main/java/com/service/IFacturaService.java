package com.service;

import com.model.Factura;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IFacturaService {


    Mono<Factura> save(Factura factura);

    Flux<Factura> findAll();

    Mono<Factura> findById(String id);

    // ---------------------------------------------------------------------------------------------------  UPDATE
    Mono<Factura> update(String id, Factura factura);

    // -------------------------------------------------------------------------------------------------    DELETE
    Mono<Factura> delete(String id);
}
