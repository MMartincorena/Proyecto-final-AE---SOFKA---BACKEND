package com.service.impl;

import com.model.Cliente;
import com.repository.IClienteRepository;
import com.service.IClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClienteServiceImpl implements IClienteService {

    @Autowired
    private IClienteRepository iClienteRepository;


    // ---------------------------------------------------------------------------------------------------  CREATE
    @Override
    public Mono<Cliente> save(Cliente cliente) {
        return this.iClienteRepository.save(cliente);
    }

    // ---------------------------------------------------------------------------------------------------   READ
    @Override
    public Flux<Cliente> findAll(){
        return this.iClienteRepository.findAll();
    }

    @Override
    public Mono<Cliente> findById(String id) {
        return this.iClienteRepository.findById(id);
    }

    @Override
    public Mono<Cliente> findByNombreCliente(String nombreCliente) {
        return this.iClienteRepository.findByNombreCliente(nombreCliente);
    }

    // ---------------------------------------------------------------------------------------------------  UPDATE
    @Override
    public Mono<Cliente> update(String id, Cliente cliente) {
        return this.iClienteRepository.findById(id)
                .flatMap(cliente1 -> {
                    cliente.setId(id);
                    return save(cliente);
                })
                .switchIfEmpty(Mono.empty());
    }

    // -------------------------------------------------------------------------------------------------    DELETE
    @Override
    public Mono<Cliente> delete(String id) {
        return this.iClienteRepository
                .findById(id)
                .flatMap(p -> this.iClienteRepository.deleteById(p.getId()).thenReturn(p));
    }


}
