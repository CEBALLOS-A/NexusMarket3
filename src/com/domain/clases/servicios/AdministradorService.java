package com.nexusmarket;

import java.util.ArrayList;

public class AdministradorService {

    private VendedorService vendedorService;
    private BodegaService bodegaService;
    private UsuarioService usuarioService;

    public AdministradorService(VendedorService servicioVendedor, BodegaService servicioBodega, UsuarioService servicioUsuario) {
        vendedorService = servicioVendedor;
        bodegaService = servicioBodega;
        usuarioService = servicioUsuario;
    }

    public void registrarVendedor(Vendedor vendedor) {
        vendedorService.registrarVendedor(vendedor);
    }

    public void actualizarVendedor(int idUsuario, String nombreCompleto, String correoElectronico) {
        vendedorService.actualizarVendedor(idUsuario, nombreCompleto, correoElectronico);
    }

    public void registrarBodega(Bodega bodega) {
        bodegaService.registrarBodega(bodega);
    }

    public void actualizarBodega(int idBodega, String nombre) {
        bodegaService.actualizarBodega(idBodega, nombre);
    }

    public void consultarUsuarios() {
        ArrayList<Usuario> lista = usuarioService.listarUsuarios();
        for (int i = 0; i < lista.size(); i++) {
            Usuario usuario = lista.get(i);
            System.out.println(usuario.getIdUsuario() + " - " + usuario.getNombreCompleto() + " - " + usuario.getRolUsuario());
        }
    }

    public void consultarReportes() {
        System.out.println("Total de usuarios registrados: " + usuarioService.listarUsuarios().size());
    }
}
