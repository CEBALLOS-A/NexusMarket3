package com.nexusmarket;

import java.util.ArrayList;

public class EnvioService {

    private ArrayList<Envio> listaEnvios = new ArrayList<Envio>();

    public void prepararEnvio(Envio envio) {
        envio.setEstado("En Preparacion");
        listaEnvios.add(envio);
        System.out.println("Envio en preparacion.");
    }

    public void empacar(int idEnvio) {
        Envio envio = consultarEnvio(idEnvio);
        if (envio != null) {
            envio.setEstado("Empacado");
            System.out.println("Envio empacado correctamente.");
        } else {
            System.out.println("No se encontro el envio.");
        }
    }

    public void despachar(int idEnvio, String fechaDespacho) {
        Envio envio = consultarEnvio(idEnvio);
        if (envio != null) {
            envio.setFechaDespacho(fechaDespacho);
            envio.setEstado("Despachado");
            System.out.println("Envio despachado correctamente.");
        } else {
            System.out.println("No se encontro el envio.");
        }
    }

    public void registrarEntrega(int idEnvio, String fechaEntrega) {
        Envio envio = consultarEnvio(idEnvio);
        if (envio != null) {
            envio.setFechaEntrega(fechaEntrega);
            envio.setEstado("Entregado");
            System.out.println("Entrega registrada correctamente.");
        } else {
            System.out.println("No se encontro el envio.");
        }
    }

    public void actualizarEstado(int idEnvio, String nuevoEstado) {
        Envio envio = consultarEnvio(idEnvio);
        if (envio != null) {
            envio.setEstado(nuevoEstado);
            System.out.println("Estado del envio actualizado.");
        } else {
            System.out.println("No se encontro el envio.");
        }
    }

    public Envio consultarEnvio(int idEnvio) {
        for (int i = 0; i < listaEnvios.size(); i++) {
            Envio envio = listaEnvios.get(i);
            if (envio.getId() == idEnvio) {
                return envio;
            }
        }
        return null;
    }
}
