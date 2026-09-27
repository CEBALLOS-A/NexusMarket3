package com.nexusmarket;

public class DetalleCarrito {

    private int id;
    private String comprador;
    private String estado;
    private String fecha;
    private int carritoId;
    private String producto;
    private int cantidad;
    private double precioUnitario;

    public DetalleCarrito() {
    }

    public DetalleCarrito(int idNuevo, String compradorNuevo, String estadoNuevo, String fechaNueva, int idCarrito, String prod, int cant, double precio) {
        id = idNuevo;
        comprador = compradorNuevo;
        estado = estadoNuevo;
        fecha = fechaNueva;
        carritoId = idCarrito;
        producto = prod;
        cantidad = cant;
        precioUnitario = precio;
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fechaNueva) {
        fecha = fechaNueva;
    }

    public int getCarritoId() {
        return carritoId;
    }

    public void setCarritoId(int idCarrito) {
        carritoId = idCarrito;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String prod) {
        producto = prod;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cant) {
        cantidad = cant;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precio) {
        precioUnitario = precio;
    }
}
