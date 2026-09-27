package com.nexusmarket;

import java.util.ArrayList;

public class VarianteProductoService {

    private ArrayList<VarianteProducto> listaVariantes = new ArrayList<VarianteProducto>();

    public void crearVariante(VarianteProducto variante) {
        listaVariantes.add(variante);
        System.out.println("Variante creada correctamente.");
    }

    public void actualizarVariante(int idVariante, String descripcion) {
        for (int i = 0; i < listaVariantes.size(); i++) {
            VarianteProducto variante = listaVariantes.get(i);
            if (variante.getId() == idVariante) {
                variante.setDescripcion(descripcion);
                System.out.println("Variante actualizada correctamente.");
                return;
            }
        }
        System.out.println("No se encontro la variante.");
    }

    public void eliminarVariante(int idVariante) {
        for (int i = 0; i < listaVariantes.size(); i++) {
            VarianteProducto variante = listaVariantes.get(i);
            if (variante.getId() == idVariante) {
                listaVariantes.remove(i);
                System.out.println("Variante eliminada correctamente.");
                return;
            }
        }
        System.out.println("No se encontro la variante.");
    }
}
