package com.nexusmarket;

public class Devolucion {

    private int id;
    private int pedido;
    private String fecha;
    private String motivo;
    private String estado;

    public Devolucion() {
    }

    public Devolucion(int idNuevo, int idPedido, String fechaNueva, String motivoNuevo, String estadoNuevo) {
        id = idNuevo;
        pedido = idPedido;
        fecha = fechaNueva;
        motivo = motivoNuevo;
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fechaNueva) {
        fecha = fechaNueva;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivoNuevo) {
        motivo = motivoNuevo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estadoNuevo) {
        estado = estadoNuevo;
    }
}
