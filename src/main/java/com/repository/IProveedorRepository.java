package com.repository;

import com.model.Documentos.Proveedor;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface IProveedorRepository extends ReactiveMongoRepository<Proveedor,String> {
    Mono<Proveedor> findByNombreProveedor(String nombreProveedor);
}