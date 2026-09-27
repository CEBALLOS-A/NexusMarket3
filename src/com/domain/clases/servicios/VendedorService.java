package com.nexusmarket;

import java.util.ArrayList;

public class VendedorService {

    private ArrayList<Vendedor> listaVendedores = new ArrayList<Vendedor>();
    private ProductoService productoService;
    private InventarioService inventarioService;

    public VendedorService(ProductoService servicioProducto, InventarioService servicioInventario) {
        productoService = servicioProducto;
        inventarioService = servicioInventario;
    }

    public void registrarVendedor(Vendedor vendedor) {
        listaVendedores.add(vendedor);
        System.out.println("Vendedor registrado correctamente.");
    }

    public void actualizarVendedor(int idUsuario, String nombreCompleto, String correoElectronico) {
        for (int i = 0; i < listaVendedores.size(); i++) {
            Vendedor vendedor = listaVendedores.get(i);
            if (vendedor.getIdUsuario() == idUsuario) {
                vendedor.setNombreCompleto(nombreCompleto);
                vendedor.setCorreoElectronico(correoElectronico);
                System.out.println("Vendedor actualizado correctamente.");
                return;
            }
        }
        System.out.println("No se encontro el vendedor con ese id.");
    }

    public Vendedor consultarVendedor(int idUsuario) {
        for (int i = 0; i < listaVendedores.size(); i++) {
            Vendedor vendedor = listaVendedores.get(i);
            if (vendedor.getIdUsuario() == idUsuario) {
                return vendedor;
            }
        }
        return null;
    }

    public void administrarProductos(int idVendedor) {
        Vendedor vendedor = consultarVendedor(idVendedor);
        if (vendedor == null) {
            System.out.println("No se encontro el vendedor.");
            return;
        }
        System.out.println("El vendedor " + vendedor.getNombreCompleto() + " esta administrando sus productos.");
    }

    public void registrarProducto(Producto producto) {
        productoService.registrarProducto(producto);
    }

    public void actualizarProducto(int idProducto, String nombre) {
        productoService.actualizarProducto(idProducto, nombre);
    }

    public void suspenderProducto(int idProducto) {
        productoService.suspenderProducto(idProducto);
    }

    public void consultarInventario(String producto, String bodega) {
        inventarioService.consultarExistencia(producto, bodega);
    }
}
