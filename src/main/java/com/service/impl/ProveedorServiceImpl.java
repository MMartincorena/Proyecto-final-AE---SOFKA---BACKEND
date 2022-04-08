package com.service.impl;

import com.model.Proveedor;
import com.repository.IProveedorRepository;
import com.service.IProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProveedorServiceImpl implements IProveedorService {

    @Autowired
    private IProveedorRepository iProveedorRepository;


    // ---------------------------------------------------------------------------------------------------  CREATE
    @Override
    public Mono<Proveedor> save(Proveedor proveedor) {
        return this.iProveedorRepository.save(proveedor);
    }

    // ---------------------------------------------------------------------------------------------------   READ
    @Override
    public Flux<Proveedor> findAll(){
        return this.iProveedorRepository.findAll();
    }

    @Override
    public Mono<Proveedor> findById(String id) {
        return this.iProveedorRepository.findById(id);
    }

    @Override
    public Mono<Proveedor> findByNombreProveedor(String nombreProveedor) {
        return this.iProveedorRepository.findByNombreProveedor(nombreProveedor);
    }

    // ---------------------------------------------------------------------------------------------------  UPDATE
    @Override
    public Mono<Proveedor> update(String id, Proveedor proveedor) {
        return this.iProveedorRepository.findById(id)
                .flatMap(proveedor1 -> {
                    proveedor.setId(id);
                    return save(proveedor);
                })
                .switchIfEmpty(Mono.empty());
    }

    // -------------------------------------------------------------------------------------------------    DELETE
    @Override
    public Mono<Proveedor> delete(String id) {
        return this.iProveedorRepository
                .findById(id)
                .flatMap(p -> this.iProveedorRepository.deleteById(p.getId()).thenReturn(p));
    }


}
