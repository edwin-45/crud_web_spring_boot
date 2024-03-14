package com.crud_web.crud_web.dao;

import com.crud_web.crud_web.models.Usuario;

import java.util.List;

public interface UsuarioDao {

    List<Usuario> getUsuarios();


    void eliminar(Long id);

    void registrar(Usuario usuario);
    boolean verificarCredenciales(Usuario usuario);
}
