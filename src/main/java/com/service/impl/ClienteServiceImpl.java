package com.service.impl;


import com.model.DTOs.ClienteDTO;
import com.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClienteServiceImpl implements IClienteService {

    @Autowired
    private IClienteService IClienteRepository;


    // ---------------------------------------------------------------------------------------------------  CREATE
    //------------------------------------------------------------------------------------------------------------
    @Override
    public Mono<ClienteDTO> save(ClienteDTO clienteDTO){
        return this.IClienteRepository.save(clienteDTO);
    }

    // ---------------------------------------------------------------------------------------------------   READ
    //-----------------------------------------------------------------------------------------------------------
    @Override
    public Flux<ClienteDTO> findAll(){
        return this.IClienteRepository.findAll();
    }

    @Override
    public Mono<ClienteDTO> findById(String id) {
        return null;
    }

    @Override
    public Mono<ClienteDTO> findByNombreCliente(String nombreCliente) {
        return this.IClienteRepository.findByNombreCliente(nombreCliente);
    }

    @Override
    public Mono<ClienteDTO> findByDocumentoCliente(String documentoCliente) {
        return this.IClienteRepository.findByDocumentoCliente(documentoCliente);
    }

    // ---------------------------------------------------------------------------------------------------  UPDATE
    //------------------------------------------------------------------------------------------------------------
    @Override
    public Mono<ClienteDTO> update(String id, ClienteDTO clienteDTO) {
        return this.IClienteRepository.findById(id)
                .flatMap(clienteDTO1 -> {
                    clienteDTO.setId(id);
                    return save(clienteDTO);
                })
                .switchIfEmpty(Mono.empty());
    }

    // -------------------------------------------------------------------------------------------------    DELETE
    //------------------------------------------------------------------------------------------------------------
    @Override
    public Mono<ClienteDTO> deleteById(Object id) {
        return null;
    }

    @Override
    public Mono<ClienteDTO> delete(String id) {
        return this.IClienteRepository
                .findById(id)
                .flatMap(p -> this.IClienteRepository.deleteById(p.getId()).thenReturn(p));

    }



}
