package com.controller;

import com.model.Documentos.Cliente;
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

    // ----------------------------------------------------------------------------------------------------  GET
    @GetMapping(value = "/cliente")
    private Flux<Cliente> mostrarTodosLosClientes() {
        return this.clienteService.findAll();
    }

    @GetMapping(value = "/buscar/cliente/{id}")
    private Mono<Cliente> mostrarClientePorId(@PathVariable("id") String id) {
        return this.clienteService.findById(id);
    }


    // ---------------------------------------------------------------------------------------------------  POST
    @PostMapping("/cliente")
    @ResponseStatus(HttpStatus.CREATED)
    private Mono<Cliente> crearCliente(@RequestBody Cliente cliente) {
        return this.clienteService.save(cliente);
    }


    // ----------------------------------------------------------------------------------------------------  PUT
    @PutMapping("/editar/cliente/{id}")
    private Mono<ResponseEntity<Cliente>> modificarClientePorId(
            @PathVariable("id") String id,
            @RequestBody Cliente cliente) {
        return this.clienteService.update(id, cliente)
                .flatMap(cliente1 -> Mono.just(ResponseEntity.ok(cliente1)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    // -------------------------------------------------------------------------------------------------  DELETE
    @DeleteMapping("/eliminar/cliente/{id}")
    private Mono<ResponseEntity<Cliente>> eliminarClientePorId(
            @PathVariable("id") String id) {
        return this.clienteService.delete(id)
                .flatMap(cliente -> Mono.just(ResponseEntity.ok(cliente)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }


}
