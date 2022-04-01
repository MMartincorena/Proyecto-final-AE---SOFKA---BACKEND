package com.repository;

import com.model.Documentos.Producto;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface IProductoRepository extends ReactiveMongoRepository<Producto,String> {
    Mono<Producto> findByNombreProducto(String nombreProducto);
}