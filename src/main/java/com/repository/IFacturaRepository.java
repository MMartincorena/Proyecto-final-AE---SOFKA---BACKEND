package com.repository;


import com.model.DTOs.FacturaDTO;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface IFacturaRepository extends ReactiveMongoRepository<FacturaDTO,String> {
    Flux<FacturaDTO> findByIdVolante(String consecutivo);
}
