package com.nexusmarket;

import java.util.ArrayList;

public class PedidoService {

    private ArrayList<Pedido> listaPedidos = new ArrayList<Pedido>();

    public void crearPedido(Pedido pedido) {
        pedido.setEstado("Carrito");
        listaPedidos.add(pedido);
        System.out.println("Pedido creado correctamente.");
    }

    public Pedido consultarPedido(int idPedido) {
        for (int i = 0; i < listaPedidos.size(); i++) {
            Pedido pedido = listaPedidos.get(i);
            if (pedido.getId() == idPedido) {
                return pedido;
            }
        }
        return null;
    }

    public void confirmarPedido(int idPedido) {
        Pedido pedido = consultarPedido(idPedido);
        if (pedido == null) {
            System.out.println("No se encontro el pedido.");
            return;
        }
        if (pedido.getEstado().equals("Finalizado")) {
            System.out.println("El pedido ya esta finalizado y no se puede modificar.");
            return;
        }
        pedido.setEstado("Pendiente de Pago");
        System.out.println("Pedido confirmado, pendiente de pago.");
    }

    public void validarPago(int idPedido) {
        Pedido pedido = consultarPedido(idPedido);
        if (pedido == null) {
            System.out.println("No se encontro el pedido.");
            return;
        }
        if (pedido.getEstado().equals("Finalizado")) {
            System.out.println("El pedido ya esta finalizado y no se puede modificar.");
            return;
        }
        pedido.setEstado("Pagado");
        System.out.println("Pago validado correctamente.");
    }

    public void despacharPedido(int idPedido) {
        Pedido pedido = consultarPedido(idPedido);
        if (pedido == null) {
            System.out.println("No se encontro el pedido.");
            return;
        }
        if (pedido.getEstado().equals("Finalizado")) {
            System.out.println("El pedido ya esta finalizado y no se puede modificar.");
            return;
        }
        pedido.setEstado("Despachado");
        System.out.println("Pedido despachado correctamente.");
    }

    public void confirmarEntrega(int idPedido) {
        Pedido pedido = consultarPedido(idPedido);
        if (pedido == null) {
            System.out.println("No se encontro el pedido.");
            return;
        }
        if (pedido.getEstado().equals("Finalizado")) {
            System.out.println("El pedido ya esta finalizado y no se puede modificar.");
            return;
        }
        pedido.setEstado("Entregado");
        System.out.println("Entrega confirmada correctamente.");
    }

    public void finalizarPedido(int idPedido) {
        Pedido pedido = consultarPedido(idPedido);
        if (pedido == null) {
            System.out.println("No se encontro el pedido.");
            return;
        }
        pedido.setEstado("Finalizado");
        System.out.println("Pedido finalizado correctamente.");
    }
}
