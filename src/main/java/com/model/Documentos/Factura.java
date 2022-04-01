package com.model.Documentos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.UUID;

@Document (collection = "facturas")
public class Factura {

    @Id
    private String id = UUID.randomUUID().toString().substring(0, 10);
    private Long consecutivo; // Identificador consecutivo no al azar
    private HashMap<Long, Integer> productosVendidos;
    private LocalDateTime fecha;
    private Double montoTotalVenta;
    private String nombreCliente;
    private String nombreVendedor;


    public Factura(String id, Long consecutivo, HashMap<Long, Integer> productosVendidos, LocalDateTime fecha, Double montoTotalVenta, String nombreCliente, String nombreVendedor) {
        this.id = id;
        this.consecutivo = consecutivo;
        this.productosVendidos = productosVendidos;
        this.fecha = fecha;
        this.montoTotalVenta = montoTotalVenta;
        this.nombreCliente = nombreCliente;
        this.nombreVendedor = nombreVendedor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(Long consecutivo) {
        this.consecutivo = consecutivo;
    }

    public HashMap<Long, Integer> getProductosVendidos() {
        return productosVendidos;
    }

    public void setProductosVendidos(HashMap<Long, Integer> productosVendidos) {
        this.productosVendidos = productosVendidos;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Double getMontoTotalVenta() {
        return montoTotalVenta;
    }

    public void setMontoTotalVenta(Double montoTotalVenta) {
        this.montoTotalVenta = montoTotalVenta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }
}
