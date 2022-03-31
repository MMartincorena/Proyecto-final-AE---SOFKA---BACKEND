package com.repository;

import com.model.DTOs.ProveedorDTO;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface IProveedorRepository extends ReactiveMongoRepository<ProveedorDTO,String> {
    Flux<ProveedorDTO> findByIdCliente(String codProveedor);

}