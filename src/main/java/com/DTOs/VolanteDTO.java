package com.DTOs;


import java.time.LocalDateTime;
import java.util.HashMap;

public class VolanteDTO {

    private String codVolante;
    private String nombreProveedor;
    private LocalDateTime fecha;
    private HashMap<Long, Integer> productosIngresados;



    VolanteDTO(){}


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

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public HashMap<Long, Integer> getProductosIngresados() {
        return productosIngresados;
    }

    public void setProductosIngresados(HashMap<Long, Integer> productosIngresados) {
        this.productosIngresados = productosIngresados;
    }


}
