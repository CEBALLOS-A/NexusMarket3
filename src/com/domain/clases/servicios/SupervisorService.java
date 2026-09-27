package com.nexusmarket;

public class SupervisorService {

    private PedidoService pedidoService;
    private InventarioService inventarioService;
    private EnvioService envioService;

    public SupervisorService(PedidoService servicioPedido, InventarioService servicioInventario, EnvioService servicioEnvio) {
        pedidoService = servicioPedido;
        inventarioService = servicioInventario;
        envioService = servicioEnvio;
    }

    public void consultarPedidos(int idPedido) {
        Pedido pedido = pedidoService.consultarPedido(idPedido);
        if (pedido != null) {
            System.out.println("Pedido " + pedido.getId() + " - Estado: " + pedido.getEstado());
        } else {
            System.out.println("No se encontro el pedido.");
        }
    }

    public void consultarInventario(String producto, String bodega) {
        Inventario inventario = inventarioService.consultarExistencia(producto, bodega);
        if (inventario != null) {
            System.out.println("Producto: " + inventario.getProducto() + " - Cantidad: " + inventario.getCantidadDisponible());
        } else {
            System.out.println("No se encontro el inventario.");
        }
    }

    public void consultarEnvios(int idEnvio) {
        Envio envio = envioService.consultarEnvio(idEnvio);
        if (envio != null) {
            System.out.println("Envio " + envio.getId() + " - Estado: " + envio.getEstado());
        } else {
            System.out.println("No se encontro el envio.");
        }
    }

    public void consultarReportes() {
        System.out.println("Reporte general del sistema en consulta.");
    }

    public void consultarEstadoOperativo() {
        System.out.println("Consultando el estado operativo del sistema.");
    }
}
