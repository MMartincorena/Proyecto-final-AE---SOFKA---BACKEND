package com.controller;

import com.model.Proveedor;

import com.service.impl.ProveedorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin(origins = "*")
public class ProveedorController {

    @Autowired
    private ProveedorServiceImpl proveedorService;

    // ----------------------------------------------------------------------------------------------------  GET
    @GetMapping(value = "/proveedor")
    private Flux<Proveedor> mostrarTodosLosProveedores() {
        return this.proveedorService.findAll();
    }

    @GetMapping(value = "/buscar/proveedor/{id}")
    private Mono<Proveedor> mostrarProveedorPorId(@PathVariable("id") String id) {
        return this.proveedorService.findById(id);
    }


    // ---------------------------------------------------------------------------------------------------  POST
    @PostMapping("/proveedor")
    @ResponseStatus(HttpStatus.CREATED)
    private Mono<Proveedor> crearProveedor(@RequestBody Proveedor proveedor) {
        return this.proveedorService.save(proveedor);
    }


    // ----------------------------------------------------------------------------------------------------  PUT
    @PutMapping("/editar/proveedor/{id}")
    private Mono<ResponseEntity<Proveedor>> modificarProveedorPorId(
            @PathVariable("id") String id,
            @RequestBody Proveedor proveedor) {
        return this.proveedorService.update(id, proveedor)
                .flatMap(proveedor1 -> Mono.just(ResponseEntity.ok(proveedor1)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    // -------------------------------------------------------------------------------------------------  DELETE
    @DeleteMapping("/eliminar/proveedor/{id}")
    private Mono<ResponseEntity<Proveedor>> eliminarProveedorPorId(
            @PathVariable("id") String id) {
        return this.proveedorService.delete(id)
                .flatMap(proveedor -> Mono.just(ResponseEntity.ok(proveedor)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }
}