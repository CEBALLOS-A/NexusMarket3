package com.nexusmarket;

public class Usuario {

    private int idUsuario;
    private String nombreCompleto;
    private String correoElectronico;
    private String rolUsuario;
    private String estado;

    public Usuario() {
    }

    public Usuario(int id, String nombre, String correo, String rol, String est) {
        idUsuario = id;
        nombreCompleto = nombre;
        correoElectronico = correo;
        rolUsuario = rol;
        estado = est;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int nuevoId) {
        idUsuario = nuevoId;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nuevoNombre) {
        nombreCompleto = nuevoNombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String nuevoCorreo) {
        correoElectronico = nuevoCorreo;
    }

    public String getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(String nuevoRol) {
        rolUsuario = nuevoRol;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String nuevoEstado) {
        estado = nuevoEstado;
    }
}
