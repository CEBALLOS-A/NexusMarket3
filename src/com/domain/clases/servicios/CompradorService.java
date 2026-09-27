package com.nexusmarket;

import java.util.ArrayList;

public class CompradorService {

    private ArrayList<Comprador> listaCompradores = new ArrayList<Comprador>();
    private CarritoService carritoService;
    private PedidoService pedidoService;
    private DevolucionService devolucionService;

    public CompradorService(CarritoService servicioCarrito, PedidoService servicioPedido, DevolucionService servicioDevolucion) {
        carritoService = servicioCarrito;
        pedidoService = servicioPedido;
        devolucionService = servicioDevolucion;
    }

    public void registrarComprador(Comprador comprador) {
        listaCompradores.add(comprador);
        System.out.println("Comprador registrado correctamente.");
    }

    public Comprador consultarComprador(int idUsuario) {
        for (int i = 0; i < listaCompradores.size(); i++) {
            Comprador comprador = listaCompradores.get(i);
            if (comprador.getIdUsuario() == idUsuario) {
                return comprador;
            }
        }
        return null;
    }

    public void agregarDireccion(int idUsuario, String direccion) {
        Comprador comprador = consultarComprador(idUsuario);
        if (comprador != null) {
            comprador.setDireccionPrincipal(direccion);
            System.out.println("Direccion agregada correctamente.");
        } else {
            System.out.println("No se encontro el comprador.");
        }
    }

    public void actualizarDireccion(int idUsuario, String nuevaDireccion) {
        Comprador comprador = consultarComprador(idUsuario);
        if (comprador != null) {
            comprador.setDireccionPrincipal(nuevaDireccion);
            System.out.println("Direccion actualizada correctamente.");
        } else {
            System.out.println("No se encontro el comprador.");
        }
    }

    public void crearCarrito(Carrito carrito) {
        carritoService.registrarCarrito(carrito);
    }

    public void agregarProductoCarrito(DetalleCarrito detalle) {
        carritoService.agregarProducto(detalle);
    }

    public void eliminarProductoCarrito(int idDetalle) {
        carritoService.eliminarProducto(idDetalle);
    }

    public void confirmarPedido(Pedido pedido) {
        pedidoService.crearPedido(pedido);
    }

    public Pedido consultarPedido(int idPedido) {
        return pedidoService.consultarPedido(idPedido);
    }

    public void solicitarDevolucion(Devolucion devolucion) {
        devolucionService.solicitarDevolucion(devolucion);
    }
}
