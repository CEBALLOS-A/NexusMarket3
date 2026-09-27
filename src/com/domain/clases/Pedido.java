package com.nexusmarket;

public class Pedido {

    private int id;
    private String comprador;
    private String estado;
    private int cantidad;
    private double precio;
    private int producto;
    private double subTotal;

    public Pedido() {
    }

    public Pedido(int idNuevo, String compradorNuevo, String estadoNuevo, int cant, double prec, int prod, double subTotalNuevo) {
        id = idNuevo;
        comprador = compradorNuevo;
        estado = estadoNuevo;
        cantidad = cant;
        precio = prec;
        producto = prod;
        subTotal = subTotalNuevo;
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cant) {
        cantidad = cant;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double prec) {
        precio = prec;
    }

    public int getProducto() {
        return producto;
    }

    public void setProducto(int prod) {
        producto = prod;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotalNuevo) {
        subTotal = subTotalNuevo;
    }
}
