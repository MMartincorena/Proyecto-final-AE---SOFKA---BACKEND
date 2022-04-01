package com.service.impl;


import com.model.Documentos.Producto;
import com.repository.IProductoRepository;
import com.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductoServiceImpl implements IProductoService {

    @Autowired
    private IProductoRepository iProductoRepository;

    // ---------------------------------------------------------------------------------------------------  CREATE
    @Override
    public Mono<Producto> save(Producto producto) {
        return this.iProductoRepository.save(producto);
    }

    // ---------------------------------------------------------------------------------------------------    READ
    @Override
    public Flux<Producto> findAll(){
        return this.iProductoRepository.findAll();
    }

    @Override
    public Mono<Producto> findById(String id) {
        return this.iProductoRepository.findById(id);
    }

    @Override
    public Mono<Producto> findByNombreProducto(String nombreProducto) {
        return this.iProductoRepository.findByNombreProducto(nombreProducto);
    }

    // ---------------------------------------------------------------------------------------------------  UPDATE
    @Override
    public Mono<Producto> update(String id, Producto producto) {
        return this.iProductoRepository.findById(id)
                .flatMap(producto1 -> {
                    producto.setId(id);
                    return save(producto);
                })
                .switchIfEmpty(Mono.empty());
    }

    // -------------------------------------------------------------------------------------------------    DELETE
    @Override
    public Mono<Producto> delete(String id) {
        return this.iProductoRepository
                .findById(id)
                .flatMap(p -> this.iProductoRepository.deleteById(p.getId()).thenReturn(p));
    }



}
