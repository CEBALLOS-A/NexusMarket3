package com.nexusmarket;

import java.util.ArrayList;

public class Bodega {

    private int id;
    private String nombre;
    private ArrayList<Integer> productosAsociados = new ArrayList<Integer>();

    public Bodega() {
    }

    public Bodega(int idNuevo, String nombreNuevo) {
        id = idNuevo;
        nombre = nombreNuevo;
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

    public ArrayList<Integer> getProductosAsociados() {
        return productosAsociados;
    }
}
