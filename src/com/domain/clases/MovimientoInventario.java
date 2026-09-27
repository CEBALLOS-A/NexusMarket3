package com.nexusmarket;

public class MovimientoInventario {

    private String tipoMovimiento;
    private int cantidad;
    private String fecha;
    private String producto;
    private int bodega;

    public MovimientoInventario() {
    }

    public MovimientoInventario(String tipo, int cant, String fech, String prod, int bod) {
        tipoMovimiento = tipo;
        cantidad = cant;
        fecha = fech;
        producto = prod;
        bodega = bod;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipo) {
        tipoMovimiento = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cant) {
        cantidad = cant;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fech) {
        fecha = fech;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String prod) {
        producto = prod;
    }

    public int getBodega() {
        return bodega;
    }

    public void setBodega(int bod) {
        bodega = bod;
    }
}
