package com.nexusmarket;

import java.util.ArrayList;

public class InventarioService {

    private ArrayList<Inventario> listaInventario = new ArrayList<Inventario>();

    public void registrarExistencia(Inventario inventario) {
        listaInventario.add(inventario);
        System.out.println("Existencia registrada correctamente.");
    }

    public Inventario consultarExistencia(String producto, String bodega) {
        for (int i = 0; i < listaInventario.size(); i++) {
            Inventario inventario = listaInventario.get(i);
            if (inventario.getProducto().equals(producto) && inventario.getBodega().equals(bodega)) {
                return inventario;
            }
        }
        return null;
    }

    public void consultarPorBodega(String bodega) {
        for (int i = 0; i < listaInventario.size(); i++) {
            Inventario inventario = listaInventario.get(i);
            if (inventario.getBodega().equals(bodega)) {
                System.out.println(inventario.getProducto() + " - Cantidad: " + inventario.getCantidadDisponible() + " - Estado: " + inventario.getEstadoInventario());
            }
        }
    }

    public boolean validarDisponibilidad(String producto, String bodega, int cantidad) {
        Inventario inventario = consultarExistencia(producto, bodega);
        if (inventario == null) {
            return false;
        }
        if (inventario.getEstadoInventario().equals("Dañado")) {
            return false;
        }
        if (inventario.getCantidadDisponible() < cantidad) {
            return false;
        }
        return true;
    }

    public void reservarInventario(String producto, String bodega, int cantidad) {
        if (validarDisponibilidad(producto, bodega, cantidad)) {
            Inventario inventario = consultarExistencia(producto, bodega);
            inventario.setCantidadDisponible(inventario.getCantidadDisponible() - cantidad);
            System.out.println("Inventario reservado correctamente.");
        } else {
            System.out.println("No hay disponibilidad suficiente para reservar.");
        }
    }

    public void liberarInventario(String producto, String bodega, int cantidad) {
        Inventario inventario = consultarExistencia(producto, bodega);
        if (inventario != null) {
            inventario.setCantidadDisponible(inventario.getCantidadDisponible() + cantidad);
            System.out.println("Inventario liberado correctamente.");
        } else {
            System.out.println("No se encontro el inventario.");
        }
    }

    public void registrarSalida(String producto, String bodega, int cantidad) {
        Inventario inventario = consultarExistencia(producto, bodega);
        if (inventario == null) {
            System.out.println("No se encontro el inventario.");
            return;
        }
        if (inventario.getCantidadDisponible() < cantidad) {
            System.out.println("No hay suficiente cantidad para registrar la salida.");
            return;
        }
        inventario.setCantidadDisponible(inventario.getCantidadDisponible() - cantidad);
        System.out.println("Salida registrada correctamente.");
    }

    public void ajustarInventario(String producto, String bodega, int nuevaCantidad) {
        Inventario inventario = consultarExistencia(producto, bodega);
        if (inventario != null) {
            if (nuevaCantidad < 0) {
                System.out.println("No se permiten existencias negativas.");
                return;
            }
            inventario.setCantidadDisponible(nuevaCantidad);
            System.out.println("Inventario ajustado correctamente.");
        } else {
            System.out.println("No se encontro el inventario.");
        }
    }

    public void registrarDevolucion(String producto, String bodega, int cantidad) {
        Inventario inventario = consultarExistencia(producto, bodega);
        if (inventario != null) {
            inventario.setCantidadDisponible(inventario.getCantidadDisponible() + cantidad);
            System.out.println("Devolucion registrada en el inventario.");
        } else {
            System.out.println("No se encontro el inventario.");
        }
    }
}
