package com.repository;

import com.model.Volante;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVolanteRepository extends ReactiveMongoRepository<Volante,String> {
}
