package com.service.impl;

import com.model.Documentos.Factura;
import com.repository.IFacturaRepository;
import com.service.IFacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class FacturaServiceImpl implements IFacturaService {

    @Autowired
    private IFacturaRepository iFacturaRepository;


    // ---------------------------------------------------------------------------------------------------  CREATE
    @Override
    public Mono<Factura> save(Factura factura){
        return this.iFacturaRepository.save(factura);
    }

    // ---------------------------------------------------------------------------------------------------   READ
    @Override
    public Flux<Factura> findAll() {
        return this.iFacturaRepository.findAll();
    }

    @Override
    public Mono<Factura> findById(String id){
        return this.iFacturaRepository.findById(id);
    }

    // ---------------------------------------------------------------------------------------------------  UPDATE
    @Override
    public Mono<Factura> update(String id, Factura factura) {
        return this.iFacturaRepository.findById(id)
                .flatMap(factura1 -> {
                    factura.setId(id);
                    return save(factura);
                })
                .switchIfEmpty(Mono.empty());
    }

    // -------------------------------------------------------------------------------------------------    DELETE
    @Override
    public Mono<Factura> delete(String id) {
        return this.iFacturaRepository
                .findById(id)
                .flatMap(p -> this.iFacturaRepository.deleteById(p.getId()).thenReturn(p));
    }


}
