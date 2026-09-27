package com.nexusmarket;

import java.util.ArrayList;

public class FacturaService {

    private ArrayList<Factura> listaFacturas = new ArrayList<Factura>();

    public void generarFactura(Factura factura) {
        if (validarFactura(factura)) {
            listaFacturas.add(factura);
            System.out.println("Factura generada correctamente.");
        } else {
            System.out.println("No se pudo generar la factura, datos incompletos.");
        }
    }

    public Factura consultarFactura(int idFactura) {
        for (int i = 0; i < listaFacturas.size(); i++) {
            Factura factura = listaFacturas.get(i);
            if (factura.getId() == idFactura) {
                return factura;
            }
        }
        return null;
    }

    public boolean validarFactura(Factura factura) {
        if (factura.getPedido() == 0) {
            return false;
        }
        if (factura.getMonto() <= 0) {
            return false;
        }
        return true;
    }
}
