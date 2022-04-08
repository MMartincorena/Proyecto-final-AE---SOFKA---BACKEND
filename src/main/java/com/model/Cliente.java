package com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document(collection = "clientes")
public class Cliente {

    @Id
    private String id = UUID.randomUUID().toString().substring(0, 10);
    private String documentoCliente;
    private String nombreCliente;
    private String celularCliente;

    public Cliente() {
    }

    public Cliente(String id, String documentoCliente, String nombreCliente, String celularCliente) {
        this.id = id;
        this.documentoCliente = documentoCliente;
        this.nombreCliente = nombreCliente;
        this.celularCliente = celularCliente;
    }

    public String getId() {
        return id; }

    public void setId(String id) {
        this.id = id; }

    public String getDocumentoCliente() {
        return documentoCliente;
    }

    public void setDocumentoCliente(String documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCelularCliente() {
        return celularCliente;
    }

    public void setCelularCliente(String celularCliente) {
        this.celularCliente = celularCliente;
    }
}
