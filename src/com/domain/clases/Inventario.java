package com.nexusmarket;

public class Inventario {

    private String producto;
    private String bodega;
    private int cantidadDisponible;
    private String estadoInventario;

    public Inventario() {
    }

    public Inventario(String prod, String bod, int cantidad, String est) {
        producto = prod;
        bodega = bod;
        cantidadDisponible = cantidad;
        estadoInventario = est;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String prod) {
        producto = prod;
    }

    public String getBodega() {
        return bodega;
    }

    public void setBodega(String bod) {
        bodega = bod;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidad) {
        cantidadDisponible = cantidad;
    }

    public String getEstadoInventario() {
        return estadoInventario;
    }

    public void setEstadoInventario(String est) {
        estadoInventario = est;
    }
}
