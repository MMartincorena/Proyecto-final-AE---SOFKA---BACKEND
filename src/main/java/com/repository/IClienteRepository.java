package com.repository;

import com.model.Documentos.Cliente;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface IClienteRepository extends ReactiveMongoRepository<Cliente,String> {
}
