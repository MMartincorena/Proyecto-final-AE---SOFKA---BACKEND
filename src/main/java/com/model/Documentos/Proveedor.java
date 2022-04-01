package com.model.Documentos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "proveedores")
public class Proveedor {

    @Id
    private String codProveedor;
    private String nombreProveedor;
    private String celularProveedor;

    public Proveedor(String codProveedor, String nombreProveedor, String celularProveedor) {
        this.codProveedor = codProveedor;
        this.nombreProveedor = nombreProveedor;
        this.celularProveedor = celularProveedor;
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
