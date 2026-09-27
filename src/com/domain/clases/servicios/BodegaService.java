package com.nexusmarket;

import java.util.ArrayList;

public class BodegaService {

    private ArrayList<Bodega> listaBodegas = new ArrayList<Bodega>();
    private InventarioService inventarioService;

    public BodegaService(InventarioService servicioInventario) {
        inventarioService = servicioInventario;
    }

    public void registrarBodega(Bodega bodega) {
        listaBodegas.add(bodega);
        System.out.println("Bodega registrada correctamente.");
    }

    public void actualizarBodega(int idBodega, String nombre) {
        Bodega bodega = consultarBodega(idBodega);
        if (bodega != null) {
            bodega.setNombre(nombre);
            System.out.println("Bodega actualizada correctamente.");
        } else {
            System.out.println("No se encontro la bodega.");
        }
    }

    public Bodega consultarBodega(int idBodega) {
        for (int i = 0; i < listaBodegas.size(); i++) {
            Bodega bodega = listaBodegas.get(i);
            if (bodega.getId() == idBodega) {
                return bodega;
            }
        }
        return null;
    }

    public void consultarInventario(int idBodega) {
        Bodega bodega = consultarBodega(idBodega);
        if (bodega == null) {
            System.out.println("No se encontro la bodega.");
            return;
        }
        inventarioService.consultarPorBodega(String.valueOf(idBodega));
    }

    public void asociarProducto(int idBodega, int idProducto) {
        Bodega bodega = consultarBodega(idBodega);
        if (bodega != null) {
            bodega.getProductosAsociados().add(idProducto);
            System.out.println("Producto asociado a la bodega correctamente.");
        } else {
            System.out.println("No se encontro la bodega.");
        }
    }
}
