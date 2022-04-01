package com.model.Documentos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document (collection = "proveedores")
public class Proveedor {

    @Id
    private String id = UUID.randomUUID().toString().substring(0, 10);

    private String codProveedor;
    private String nombreProveedor;
    private String celularProveedor;

    public Proveedor() {
    }

    public Proveedor(String id, String codProveedor, String nombreProveedor, String celularProveedor) {
        this.id = id;
        this.codProveedor = codProveedor;
        this.nombreProveedor = nombreProveedor;
        this.celularProveedor = celularProveedor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodProveedor() {
        return codProveedor;
    }

    public void setCodProveedor(String codProveedor) {
        this.codProveedor = codProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getCelularProveedor() {
        return celularProveedor;
    }

    public void setCelularProveedor(String celularProveedor) {
        this.celularProveedor = celularProveedor;
    }
}
