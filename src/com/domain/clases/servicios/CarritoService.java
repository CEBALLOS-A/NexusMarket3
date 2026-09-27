package com.nexusmarket;

import java.util.ArrayList;

public class CarritoService {

    private ArrayList<Carrito> listaCarritos = new ArrayList<Carrito>();
    private DetalleCarritoService detalleCarritoService;

    public CarritoService(DetalleCarritoService servicioDetalle) {
        detalleCarritoService = servicioDetalle;
    }

    public void registrarCarrito(Carrito carrito) {
        listaCarritos.add(carrito);
        System.out.println("Carrito creado correctamente.");
    }

    public Carrito consultarCarrito(int idCarrito) {
        for (int i = 0; i < listaCarritos.size(); i++) {
            Carrito carrito = listaCarritos.get(i);
            if (carrito.getId() == idCarrito) {
                return carrito;
            }
        }
        return null;
    }

    public void agregarProducto(DetalleCarrito detalle) {
        detalleCarritoService.registrarDetalle(detalle);
    }

    public void eliminarProducto(int idDetalle) {
        detalleCarritoService.eliminarDetalle(idDetalle);
    }

    public void actualizarCantidad(int idDetalle, int cantidad) {
        detalleCarritoService.actualizarCantidad(idDetalle, cantidad);
    }

    public void vaciarCarrito(int idCarrito) {
        detalleCarritoService.eliminarPorCarrito(idCarrito);
        System.out.println("Carrito vaciado correctamente.");
    }

    public double calcularTotal(int idCarrito) {
        double total = detalleCarritoService.calcularTotalPorCarrito(idCarrito);
        return total;
    }

    public void confirmarCompra(int idCarrito) {
        Carrito carrito = consultarCarrito(idCarrito);
        if (carrito != null) {
            carrito.setEstado("Confirmado");
            System.out.println("Compra confirmada correctamente.");
        } else {
            System.out.println("No se encontro el carrito.");
        }
    }
}
