package com.nexusmarket;

import java.util.ArrayList;

public class ProductoService {

    private ArrayList<Producto> listaProductos = new ArrayList<Producto>();
    private VarianteProductoService varianteProductoService;

    public ProductoService(VarianteProductoService servicioVariante) {
        varianteProductoService = servicioVariante;
    }

    public void registrarProducto(Producto producto) {
        listaProductos.add(producto);
        System.out.println("Producto registrado correctamente.");
    }

    public void actualizarProducto(int idProducto, String nombre) {
        Producto producto = consultarProducto(idProducto);
        if (producto != null) {
            producto.setNombre(nombre);
            System.out.println("Producto actualizado correctamente.");
        } else {
            System.out.println("No se encontro el producto.");
        }
    }

    public void publicarProducto(int idProducto) {
        Producto producto = consultarProducto(idProducto);
        if (producto != null) {
            producto.setEstado("Publicado");
            System.out.println("Producto publicado correctamente.");
        } else {
            System.out.println("No se encontro el producto.");
        }
    }

    public void suspenderProducto(int idProducto) {
        Producto producto = consultarProducto(idProducto);
        if (producto != null) {
            producto.setEstado("Suspendido");
            System.out.println("Producto suspendido correctamente.");
        } else {
            System.out.println("No se encontro el producto.");
        }
    }

    public void descontinuarProducto(int idProducto) {
        Producto producto = consultarProducto(idProducto);
        if (producto != null) {
            producto.setEstado("Descontinuado");
            System.out.println("Producto descontinuado correctamente.");
        } else {
            System.out.println("No se encontro el producto.");
        }
    }

    public void agregarVariante(int idProducto, VarianteProducto variante) {
        Producto producto = consultarProducto(idProducto);
        if (producto != null) {
            variante.setProductoId(idProducto);
            varianteProductoService.crearVariante(variante);
        } else {
            System.out.println("No se encontro el producto.");
        }
    }

    public void actualizarVariante(int idVariante, String descripcion) {
        varianteProductoService.actualizarVariante(idVariante, descripcion);
    }

    public Producto consultarProducto(int idProducto) {
        for (int i = 0; i < listaProductos.size(); i++) {
            Producto producto = listaProductos.get(i);
            if (producto.getId() == idProducto) {
                return producto;
            }
        }
        return null;
    }
}
