package com.service;

import com.model.Documentos.Volante;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IVolanteService {
    // ---------------------------------------------------------------------------------------------------  CREATE
    Mono<Volante> save(Volante volante);

    // ---------------------------------------------------------------------------------------------------   READ
    Flux<Volante> findAll();

    Mono<Volante> findById(String id);

    // ---------------------------------------------------------------------------------------------------  UPDATE
    Mono<Volante> update(String id, Volante volante);

    // -------------------------------------------------------------------------------------------------    DELETE
    Mono<Volante> delete(String id);
}
