package com.repository;

import com.model.Documentos.Proveedor;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface IProveedorRepository extends ReactiveMongoRepository<Proveedor,String> {
}