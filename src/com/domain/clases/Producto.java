package com.nexusmarket;

public class Producto {

    private int id;
    private String nombre;
    private String tipoProducto;
    private String estado;

    public Producto() {
    }

    public Producto(int idNuevo, String nombreNuevo, String tipo, String est) {
        id = idNuevo;
        nombre = nombreNuevo;
        tipoProducto = tipo;
        estado = est;
    }

    public int getId() {
        return id;
    }

    public void setId(int idNuevo) {
        id = idNuevo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreNuevo) {
        nombre = nombreNuevo;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoNuevo) {
        tipoProducto = tipoNuevo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estadoNuevo) {
        estado = estadoNuevo;
    }
}
