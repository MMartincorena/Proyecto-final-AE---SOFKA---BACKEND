package com.repository;

import com.model.DTOs.ProductoDTO;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface IProductoRepository extends ReactiveMongoRepository<ProductoDTO,String> {
    Flux<ProductoDTO> findByIdCliente(String codProducto);

}