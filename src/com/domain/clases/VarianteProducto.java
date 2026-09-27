package com.nexusmarket;

public class VarianteProducto {

    private int id;
    private int productoId;
    private String descripcion;

    public VarianteProducto() {
    }

    public VarianteProducto(int idNuevo, int idProducto, String desc) {
        id = idNuevo;
        productoId = idProducto;
        descripcion = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int idNuevo) {
        id = idNuevo;
    }

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int idProducto) {
        productoId = idProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descNueva) {
        descripcion = descNueva;
    }
}
