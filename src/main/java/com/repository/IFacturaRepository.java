package com.repository;

import com.model.Documentos.Factura;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface IFacturaRepository extends ReactiveMongoRepository<Factura,String> {
}
