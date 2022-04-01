package com.repository;

import com.model.Documentos.Producto;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoRepository extends ReactiveMongoRepository<Producto,String> {
}