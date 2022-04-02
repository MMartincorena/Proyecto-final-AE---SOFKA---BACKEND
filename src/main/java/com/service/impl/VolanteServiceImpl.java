package com.service.impl;

import com.model.Documentos.Volante;
import com.repository.IVolanteRepository;
import com.service.IVolanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class VolanteServiceImpl implements IVolanteService {

    @Autowired
    private IVolanteRepository iVolanteRepository;

    // ---------------------------------------------------------------------------------------------------  CREATE
    @Override
    public Mono<Volante> save(Volante volante) {
        return this.iVolanteRepository.save(volante);
    }

    // ---------------------------------------------------------------------------------------------------   READ
    @Override
    public Flux<Volante> findAll(){
        return this.iVolanteRepository.findAll();
    }

    @Override
    public Mono<Volante> findById(String id) {
        return this.iVolanteRepository.findById(id);
    }

    // ---------------------------------------------------------------------------------------------------  UPDATE
    @Override
    public Mono<Volante> update(String id, Volante volante) {
        return this.iVolanteRepository.findById(id)
                .flatMap(volante1 -> {
                    volante.setId(id);
                    return save(volante);
                })
                .switchIfEmpty(Mono.empty());
    }

    // -------------------------------------------------------------------------------------------------    DELETE
    @Override
    public Mono<Volante> delete(String id) {
        return this.iVolanteRepository
                .findById(id)
                .flatMap(p -> this.iVolanteRepository.deleteById(p.getId()).thenReturn(p));
    }
}