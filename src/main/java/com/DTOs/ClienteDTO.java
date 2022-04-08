package com.DTOs;


public class ClienteDTO {

    private String documentoCliente;
    private String nombreCliente;
    private String celularCliente;

    public ClienteDTO() {}


    public String getDocumentoCliente() {
        return documentoCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getCelularCliente() {
        return celularCliente;
    }

    //-----------------------------------------------------------------------------------------------   VALIDADORES SETTER

    public void setDocumentoCliente(String documentoCliente) throws IllegalAccessException {
        if(documentoCliente == null || documentoCliente.isEmpty())
            throw new IllegalAccessException("El campo de documento no puede ser vacío");
        this.documentoCliente = documentoCliente;
    }

    public void setNombreCliente(String nombreCliente) throws  IllegalArgumentException {
        if (nombreCliente == null || nombreCliente.isEmpty())
            throw new IllegalArgumentException("El campo nombre no puede ser vacío");
        this.nombreCliente = nombreCliente;
    }

    public void setCelularCliente(String celularCliente) throws  IllegalArgumentException {
        if (celularCliente == null || celularCliente.isEmpty())
            throw new IllegalArgumentException("El campo celular no puede ser vacío");
        this.celularCliente = celularCliente;
    }






}
