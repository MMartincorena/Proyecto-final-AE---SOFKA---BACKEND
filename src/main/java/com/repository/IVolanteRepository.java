package com.repository;

import com.model.Documentos.Volante;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface IVolanteRepository extends ReactiveMongoRepository<Volante,String> {
}
