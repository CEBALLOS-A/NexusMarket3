package com.nexusmarket;

public class Carrito {

    private int id;
    private String comprador;
    private String estado;

    public Carrito() {
    }

    public Carrito(int idNuevo, String compradorNuevo, String estadoNuevo) {
        id = idNuevo;
        comprador = compradorNuevo;
        estado = estadoNuevo;
    }

    public int getId() {
        return id;
    }

    public void setId(int idNuevo) {
        id = idNuevo;
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String compradorNuevo) {
        comprador = compradorNuevo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estadoNuevo) {
        estado = estadoNuevo;
    }
}
