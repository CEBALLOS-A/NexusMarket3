package com.nexusmarket;

import java.util.ArrayList;

public class ReembolsoService {

    private ArrayList<Reembolso> listaReembolsos = new ArrayList<Reembolso>();

    public void procesarReembolso(Reembolso reembolso) {
        reembolso.setEstado("Procesado");
        listaReembolsos.add(reembolso);
        System.out.println("Reembolso procesado correctamente.");
    }

    public Reembolso consultarReembolso(int idReembolso) {
        for (int i = 0; i < listaReembolsos.size(); i++) {
            Reembolso reembolso = listaReembolsos.get(i);
            if (reembolso.getId() == idReembolso) {
                return reembolso;
            }
        }
        return null;
    }
}
