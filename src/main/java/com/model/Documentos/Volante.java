package com.model.Documentos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.HashMap;

@Document
public class Volante {

    @Id
    private String codVolante;
    private String nombreProveedor;
    private HashMap<Long, Integer> productosIngresados;
    private LocalDateTime fecha;
    private Long codProveedor;


    public String getCodVolante() {
        return codVolante;
    }

    public void setCodVolante(String codVolante) {
        this.codVolante = codVolante;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public HashMap<Long, Integer> getProductosIngresados() {
        return productosIngresados;
    }

    public void setProductosIngresados(HashMap<Long, Integer> productosIngresados) {
        this.productosIngresados = productosIngresados;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Long getCodProveedor() {
        return codProveedor;
    }

    public void setCodProveedor(Long codProveedor) {
        this.codProveedor = codProveedor;
    }
}
