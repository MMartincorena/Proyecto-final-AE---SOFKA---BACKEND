package com.controller;



import com.model.Documentos.Producto;
import com.service.impl.ProductoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin(origins = "*")
public class ProductoController {

    @Autowired
    private ProductoServiceImpl productoService;

    // ----------------------------------------------------------------------------------------------------  GET
    @GetMapping(value = "/producto")
    private Flux<Producto> mostrarTodosLosProductos() {
        return this.productoService.findAll();
    }

    @GetMapping(value = "/buscar/producto/{id}")
    private Mono<Producto> mostrarProductoPorId(@PathVariable("id") String id) {
        return this.productoService.findById(id);
    }


    // ---------------------------------------------------------------------------------------------------  POST
    @PostMapping("/producto")
    @ResponseStatus(HttpStatus.CREATED)
    private Mono<Producto> crearProducto(@RequestBody Producto producto) {
        return this.productoService.save(producto);
    }


    // ----------------------------------------------------------------------------------------------------  PUT
    @PutMapping("/editar/producto/{id}")
    private Mono<ResponseEntity<Producto>> modificarProductoPorId(
            @PathVariable("id") String id,
            @RequestBody Producto producto) {
        return this.productoService.update(id, producto)
                .flatMap(producto1 -> Mono.just(ResponseEntity.ok(producto1)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    // -------------------------------------------------------------------------------------------------  DELETE
    @DeleteMapping("/eliminar/producto/{id}")
    private Mono<ResponseEntity<Producto>> eliminarProductoPorId(
            @PathVariable("id") String id) {
        return this.productoService.delete(id)
                .flatMap(producto -> Mono.just(ResponseEntity.ok(producto)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }


}

