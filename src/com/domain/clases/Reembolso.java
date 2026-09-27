package com.nexusmarket;

public class Reembolso {

    private int id;
    private int pedido;
    private int fecha;
    private double monto;
    private String estado;

    public Reembolso() {
    }

    public Reembolso(int idNuevo, int idPedido, int fechaNueva, double montoNuevo, String estadoNuevo) {
        id = idNuevo;
        pedido = idPedido;
        fecha = fechaNueva;
        monto = montoNuevo;
        estado = estadoNuevo;
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

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fechaNueva) {
        fecha = fechaNueva;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double montoNuevo) {
        monto = montoNuevo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estadoNuevo) {
        estado = estadoNuevo;
    }
}
