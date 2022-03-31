package com.model.DTOs;

import java.time.LocalDateTime;
import java.util.HashMap;

public class FacturaDTO {

    private Long consecutivo; // Identificador consecutivo no al azar
    private HashMap<Long, Integer> productosVendidos;
    private LocalDateTime fecha;
    private Double montoTotalVenta;
    private String nombreCliente;
    private String nombreVendedor;


    public FacturaDTO(){}


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
