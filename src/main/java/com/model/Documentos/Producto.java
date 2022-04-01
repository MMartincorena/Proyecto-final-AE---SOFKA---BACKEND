package com.model.Documentos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document (collection = "inventario")
public class Producto {

    @Id
    private String codProducto = UUID.randomUUID().toString().substring(0, 10);
    private String nombreProducto;
    private String descripciónProducto;
    private Double precio;
    private int cantidad;
    private int stockActual;
    private int stockMinimo;
    private int stockMaximo;

    public Producto(String codProducto, String nombreProducto, String descripciónProducto, Double precio, int cantidad, int stockActual, int stockMinimo, int stockMaximo) {
        this.codProducto = codProducto;
        this.nombreProducto = nombreProducto;
        this.descripciónProducto = descripciónProducto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.stockActual = stockActual;
        this.stockMinimo = stockMinimo;
        this.stockMaximo = stockMaximo;
    }

    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripciónProducto() {
        return descripciónProducto;
    }

    public void setDescripciónProducto(String descripciónProducto) {
        this.descripciónProducto = descripciónProducto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public int getStockMaximo() {
        return stockMaximo;
    }

    public void setStockMaximo(int stockMaximo) {
        this.stockMaximo = stockMaximo;
    }
}
