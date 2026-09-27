package com.nexusmarket;

import java.util.ArrayList;

public class MovimientoInventarioService {

    private ArrayList<MovimientoInventario> listaMovimientos = new ArrayList<MovimientoInventario>();
    private InventarioService inventarioService;

    public MovimientoInventarioService(InventarioService servicioInventario) {
        inventarioService = servicioInventario;
    }

    public void registrarMovimiento(MovimientoInventario movimiento) {
        if (validarMovimiento(movimiento)) {
            listaMovimientos.add(movimiento);
            System.out.println("Movimiento registrado correctamente.");
        } else {
            System.out.println("Tipo de movimiento invalido.");
        }
    }

    public boolean validarMovimiento(MovimientoInventario movimiento) {
        String tipo = movimiento.getTipoMovimiento();
        if (tipo.equals("Ingreso") || tipo.equals("Reserva") || tipo.equals("Salida") || tipo.equals("Ajuste") || tipo.equals("Devolucion")) {
            return true;
        }
        return false;
    }

    public void aplicarMovimiento(MovimientoInventario movimiento) {
        String bodega = String.valueOf(movimiento.getBodega());
        if (movimiento.getTipoMovimiento().equals("Ingreso")) {
            inventarioService.registrarExistencia(new Inventario(movimiento.getProducto(), bodega, movimiento.getCantidad(), "Disponible"));
        } else if (movimiento.getTipoMovimiento().equals("Reserva")) {
            inventarioService.reservarInventario(movimiento.getProducto(), bodega, movimiento.getCantidad());
        } else if (movimiento.getTipoMovimiento().equals("Salida")) {
            inventarioService.registrarSalida(movimiento.getProducto(), bodega, movimiento.getCantidad());
        } else if (movimiento.getTipoMovimiento().equals("Ajuste")) {
            inventarioService.ajustarInventario(movimiento.getProducto(), bodega, movimiento.getCantidad());
        } else if (movimiento.getTipoMovimiento().equals("Devolucion")) {
            inventarioService.registrarDevolucion(movimiento.getProducto(), bodega, movimiento.getCantidad());
        } else {
            System.out.println("Tipo de movimiento invalido.");
        }
    }
}
