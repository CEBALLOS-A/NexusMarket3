package com.nexusmarket;

public class Comprador extends Usuario {

    private String direccionPrincipal;
    private String estadoComercial;

    public Comprador() {
    }

    public Comprador(int id, String nombre, String correo, String rol, String est, String direccion, String estComercial) {
        super(id, nombre, correo, rol, est);
        direccionPrincipal = direccion;
        estadoComercial = estComercial;
    }

    public String getDireccionPrincipal() {
        return direccionPrincipal;
    }

    public void setDireccionPrincipal(String nuevaDireccion) {
        direccionPrincipal = nuevaDireccion;
    }

    public String getEstadoComercial() {
        return estadoComercial;
    }

    public void setEstadoComercial(String nuevoEstado) {
        estadoComercial = nuevoEstado;
    }
}
