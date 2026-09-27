package com.nexusmarket;

public class OperadorLogisticoService {

    private PedidoService pedidoService;
    private EnvioService envioService;
    private BodegaService bodegaService;

    public OperadorLogisticoService(PedidoService servicioPedido, EnvioService servicioEnvio, BodegaService servicioBodega) {
        pedidoService = servicioPedido;
        envioService = servicioEnvio;
        bodegaService = servicioBodega;
    }

    public void prepararPedido(int idPedido) {
        pedidoService.validarPago(idPedido);
        System.out.println("Pedido en preparacion.");
    }

    public void empacarPedido(int idEnvio) {
        envioService.empacar(idEnvio);
    }

    public void despacharPedido(int idPedido, int idEnvio, String fechaDespacho) {
        pedidoService.despacharPedido(idPedido);
        envioService.despachar(idEnvio, fechaDespacho);
    }

    public void actualizarEnvio(int idEnvio, String nuevoEstado) {
        envioService.actualizarEstado(idEnvio, nuevoEstado);
    }

    public void consultarBodega(int idBodega) {
        Bodega bodega = bodegaService.consultarBodega(idBodega);
        if (bodega != null) {
            System.out.println("Bodega: " + bodega.getNombre());
        } else {
            System.out.println("No se encontro la bodega.");
        }
    }
}
