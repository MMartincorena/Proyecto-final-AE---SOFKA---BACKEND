package com.controller;


import com.model.Documentos.Factura;
import com.service.impl.FacturaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class FacturaController {

@Autowired
    private FacturaServiceImpl facturaService;

    // ----------------------------------------------------------------------------------------------------  GET
    @GetMapping(value = "/factura")
    private Flux<Factura> AllFacturas() {
        return this.facturaService.findAll();
    }

    @GetMapping(value = "/buscar/factura/{id}")
    private Mono<Factura> searchFacturaByID(@PathVariable("id") String id) {
        return this.facturaService.findById(id);
    }

    // ---------------------------------------------------------------------------------------------------  POST
    @PostMapping("/factura")
    @ResponseStatus(HttpStatus.CREATED)
    private Mono<Factura> saveFactura(@RequestBody Factura factura) {
        return this.facturaService.save(factura);
    }

    // ----------------------------------------------------------------------------------------------------  PUT
    @PutMapping("/editar/factura/{id}")
    private Mono<ResponseEntity<Factura>> updateFactura(
            @PathVariable("id") String id,
            @RequestBody Factura factura) {
        return this.facturaService.update(id, factura)
                .flatMap(factura1 -> Mono.just(ResponseEntity.ok(factura1)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    // -------------------------------------------------------------------------------------------------  DELETE
    @DeleteMapping("/eliminar/factura/{id}")
    private Mono<ResponseEntity<Factura>> deleteFactura(
            @PathVariable("id") String id) {
        return this.facturaService.delete(id)
                .flatMap(factura -> Mono.just(ResponseEntity.ok(factura)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }


}
