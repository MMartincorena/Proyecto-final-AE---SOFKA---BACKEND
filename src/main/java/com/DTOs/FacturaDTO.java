package com.DTOs;

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

    public HashMap<Long, Integer> getProductosVendidos() {
        return productosVendidos;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public Double getMontoTotalVenta() {
        return montoTotalVenta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }


    //-----------------------------------------------------------------------------------------------   VALIDADORES SETTER

}
