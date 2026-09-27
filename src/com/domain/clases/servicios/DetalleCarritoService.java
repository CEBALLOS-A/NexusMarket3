package com.nexusmarket;

import java.util.ArrayList;

public class DetalleCarritoService {

    private ArrayList<DetalleCarrito> listaDetalles = new ArrayList<DetalleCarrito>();

    public void registrarDetalle(DetalleCarrito detalle) {
        listaDetalles.add(detalle);
        System.out.println("Producto agregado al carrito.");
    }

    public void eliminarDetalle(int idDetalle) {
        for (int i = 0; i < listaDetalles.size(); i++) {
            DetalleCarrito detalle = listaDetalles.get(i);
            if (detalle.getId() == idDetalle) {
                listaDetalles.remove(i);
                System.out.println("Producto eliminado del carrito.");
                return;
            }
        }
        System.out.println("No se encontro el producto en el carrito.");
    }

    public void eliminarPorCarrito(int idCarrito) {
        for (int i = listaDetalles.size() - 1; i >= 0; i--) {
            DetalleCarrito detalle = listaDetalles.get(i);
            if (detalle.getCarritoId() == idCarrito) {
                listaDetalles.remove(i);
            }
        }
    }

    public void actualizarCantidad(int idDetalle, int cantidad) {
        for (int i = 0; i < listaDetalles.size(); i++) {
            DetalleCarrito detalle = listaDetalles.get(i);
            if (detalle.getId() == idDetalle) {
                detalle.setCantidad(cantidad);
                System.out.println("Cantidad actualizada correctamente.");
                return;
            }
        }
        System.out.println("No se encontro el producto en el carrito.");
    }

    public double calcularSubtotal(int idDetalle) {
        for (int i = 0; i < listaDetalles.size(); i++) {
            DetalleCarrito detalle = listaDetalles.get(i);
            if (detalle.getId() == idDetalle) {
                double subtotal = detalle.getCantidad() * detalle.getPrecioUnitario();
                return subtotal;
            }
        }
        return 0;
    }

    public double calcularTotalPorCarrito(int idCarrito) {
        double total = 0;
        for (int i = 0; i < listaDetalles.size(); i++) {
            DetalleCarrito detalle = listaDetalles.get(i);
            if (detalle.getCarritoId() == idCarrito) {
                total = total + (detalle.getCantidad() * detalle.getPrecioUnitario());
            }
        }
        return total;
    }
}
