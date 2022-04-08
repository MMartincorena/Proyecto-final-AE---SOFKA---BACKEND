package com.repository;

import com.model.Factura;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFacturaRepository extends ReactiveMongoRepository<Factura,String> {
}
