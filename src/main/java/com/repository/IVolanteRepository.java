package com.repository;

import com.model.DTOs.VolanteDTO;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface IVolanteRepository extends ReactiveMongoRepository<VolanteDTO,String> {
    Flux<VolanteDTO> findByIdVolante(String codVolante);

}
