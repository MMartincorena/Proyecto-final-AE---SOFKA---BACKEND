package com.controller;


import com.model.Documentos.Cliente;
import com.model.Documentos.Volante;
import com.service.impl.VolanteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class VolanteController {

    @Autowired
    private VolanteServiceImpl volanteService;

    // ----------------------------------------------------------------------------------------------------  GET
    @GetMapping(value = "/volante")
    private Flux<Volante> mostrarTodosLosVolantes() {
        return this.volanteService.findAll();
    }

    @GetMapping(value = "/buscar/volante/{id}")
    private Mono<Volante> mostrarVolantePorId(@PathVariable("id") String id) {
        return this.volanteService.findById(id);
    }


    // ---------------------------------------------------------------------------------------------------  POST
    @PostMapping("/volante")
    @ResponseStatus(HttpStatus.CREATED)
    private Mono<Volante> crearVolante(@RequestBody Volante volante) {
        return this.volanteService.save(volante);
    }


    // ----------------------------------------------------------------------------------------------------  PUT
    @PutMapping("/editar/volante/{id}")
    private Mono<ResponseEntity<Volante>> modificarVolantePorId(
            @PathVariable("id") String id,
            @RequestBody Volante volante) {
        return this.volanteService.update(id, volante)
                .flatMap(volante1 -> Mono.just(ResponseEntity.ok(volante1)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    // -------------------------------------------------------------------------------------------------  DELETE
    @DeleteMapping("/eliminar/volante/{id}")
    private Mono<ResponseEntity<Volante>> eliminarClientePorId(
            @PathVariable("id") String id) {
        return this.volanteService.delete(id)
                .flatMap(volante -> Mono.just(ResponseEntity.ok(volante)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }


}
