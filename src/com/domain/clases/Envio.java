package com.nexusmarket;

public class Envio {

    private int id;
    private int pedido;
    private String fechaDespacho;
    private String fechaEntrega;
    private String estado;

    public Envio() {
    }

    public Envio(int idNuevo, int idPedido, String despacho, String entrega, String estadoNuevo) {
        id = idNuevo;
        pedido = idPedido;
        fechaDespacho = despacho;
        fechaEntrega = entrega;
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

    public String getFechaDespacho() {
        return fechaDespacho;
    }

    public void setFechaDespacho(String despacho) {
        fechaDespacho = despacho;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String entrega) {
        fechaEntrega = entrega;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estadoNuevo) {
        estado = estadoNuevo;
    }
}
