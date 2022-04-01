package com.repository;

import com.model.Documentos.Producto;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface IProductoRepository extends ReactiveMongoRepository<Producto,String> {
}