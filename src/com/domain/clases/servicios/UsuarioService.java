package com.nexusmarket;

import java.util.ArrayList;

public class UsuarioService {

    private ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();

    public void registrarUsuario(Usuario usuario) {
        if (validarDatos(usuario)) {
            listaUsuarios.add(usuario);
            System.out.println("Usuario registrado correctamente.");
        } else {
            System.out.println("No se pudo registrar el usuario, faltan datos.");
        }
    }

    public void actualizarUsuario(int idUsuario, String nombreCompleto, String correoElectronico) {
        for (int i = 0; i < listaUsuarios.size(); i++) {
            Usuario usuario = listaUsuarios.get(i);
            if (usuario.getIdUsuario() == idUsuario) {
                usuario.setNombreCompleto(nombreCompleto);
                usuario.setCorreoElectronico(correoElectronico);
                System.out.println("Usuario actualizado correctamente.");
                return;
            }
        }
        System.out.println("No se encontro el usuario con ese id.");
    }

    public Usuario consultarUsuario(int idUsuario) {
        for (int i = 0; i < listaUsuarios.size(); i++) {
            Usuario usuario = listaUsuarios.get(i);
            if (usuario.getIdUsuario() == idUsuario) {
                return usuario;
            }
        }
        return null;
    }

    public void cambiarEstado(int idUsuario, String nuevoEstado) {
        for (int i = 0; i < listaUsuarios.size(); i++) {
            Usuario usuario = listaUsuarios.get(i);
            if (usuario.getIdUsuario() == idUsuario) {
                usuario.setEstado(nuevoEstado);
                System.out.println("Estado del usuario actualizado.");
                return;
            }
        }
        System.out.println("No se encontro el usuario con ese id.");
    }

    public void asignarRol(int idUsuario, String nuevoRol) {
        for (int i = 0; i < listaUsuarios.size(); i++) {
            Usuario usuario = listaUsuarios.get(i);
            if (usuario.getIdUsuario() == idUsuario) {
                usuario.setRolUsuario(nuevoRol);
                System.out.println("Rol asignado correctamente.");
                return;
            }
        }
        System.out.println("No se encontro el usuario con ese id.");
    }

    public ArrayList<Usuario> listarUsuarios() {
        return listaUsuarios;
    }

    public boolean validarDatos(Usuario usuario) {
        if (usuario.getNombreCompleto() == null || usuario.getNombreCompleto().equals("")) {
            return false;
        }
        if (usuario.getCorreoElectronico() == null || usuario.getCorreoElectronico().equals("")) {
            return false;
        }
        return true;
    }
}
