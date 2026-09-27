package com.nexusmarket;

public class Factura {

    private int id;
    private int pedido;
    private String fecha;
    private double monto;

    public Factura() {
    }

    public Factura(int idNuevo, int idPedido, String fechaNueva, double montoNuevo) {
        id = idNuevo;
        pedido = idPedido;
        fecha = fechaNueva;
        monto = montoNuevo;
    }

    public int getId() {
        return id;
    }

    public void setId(int idNuevo) {
        id = idNuevo;
    }

    public int getPedido() {
        return pedido;
    }

    public void setPedido(int idPedido) {
        pedido = idPedido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fechaNueva) {
        fecha = fechaNueva;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double montoNuevo) {
        monto = montoNuevo;
    }
}
