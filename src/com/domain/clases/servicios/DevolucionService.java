package com.nexusmarket;

import java.util.ArrayList;

public class DevolucionService {

    private ArrayList<Devolucion> listaDevoluciones = new ArrayList<Devolucion>();

    public void solicitarDevolucion(Devolucion devolucion) {
        devolucion.setEstado("Solicitada");
        listaDevoluciones.add(devolucion);
        System.out.println("Devolucion solicitada correctamente.");
    }

    public void registrarDevolucion(Devolucion devolucion) {
        listaDevoluciones.add(devolucion);
        System.out.println("Devolucion registrada correctamente.");
    }

    public void aprobarDevolucion(int idDevolucion) {
        Devolucion devolucion = consultarDevolucion(idDevolucion);
        if (devolucion != null) {
            devolucion.setEstado("Aprobada");
            System.out.println("Devolucion aprobada correctamente.");
        } else {
            System.out.println("No se encontro la devolucion.");
        }
    }

    public void rechazarDevolucion(int idDevolucion) {
        Devolucion devolucion = consultarDevolucion(idDevolucion);
        if (devolucion != null) {
            devolucion.setEstado("Rechazada");
            System.out.println("Devolucion rechazada correctamente.");
        } else {
            System.out.println("No se encontro la devolucion.");
        }
    }

    public Devolucion consultarDevolucion(int idDevolucion) {
        for (int i = 0; i < listaDevoluciones.size(); i++) {
            Devolucion devolucion = listaDevoluciones.get(i);
            if (devolucion.getId() == idDevolucion) {
                return devolucion;
            }
        }
        return null;
    }
}
