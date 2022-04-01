package com.controller;

import com.model.DTOs.ClienteDTO;
import com.service.impl.ClienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class ClienteController {

    @Autowired
    private ClienteServiceImpl clienteService;

    // ---------------------------------------------------------------------------------------------------  POST
    @PostMapping("/cliente")
    @ResponseStatus(HttpStatus.CREATED)
    private Mono<ClienteDTO> saveCliente(@RequestBody ClienteDTO clienteDTO) {
        return this.clienteService.save(clienteDTO);
    }

    // ----------------------------------------------------------------------------------------------------  GET
    @GetMapping(value = "/cliente")
    private Flux<ClienteDTO> AllClientes() {
        return this.clienteService.findAll();
    }

    @GetMapping(value = "/buscar/cliente/{id}")
    private Mono<ClienteDTO> searchClienteByID(@PathVariable("id") String id) {
        return this.clienteService.findById(id);
    }

    // ----------------------------------------------------------------------------------------------------  PUT
    @PutMapping("/edit/cliente/{id}")
    private Mono<ResponseEntity<ClienteDTO>> updateCliente(
            @PathVariable("id") String id,
            @RequestBody ClienteDTO clienteDTO) {
        return this.clienteService.update(id, clienteDTO)
                .flatMap(clienteDTO1 -> Mono.just(ResponseEntity.ok(clienteDTO1)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

}
