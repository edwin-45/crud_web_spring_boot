package com.crud_web.crud_web.controllers;

import com.crud_web.crud_web.dao.UsuarioDao;
import com.crud_web.crud_web.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value="api/usuarios/{id}", method= RequestMethod.GET)
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Edwin");
        usuario.setApellido("Torrado");
        usuario.setEmail("edwin@gmail.com");
        usuario.setTelefono("3107755561");
        usuario.setPassword("Edwin");

        return usuario;
    }

    @RequestMapping(value="api/usuarios")
    public List<Usuario>getUsuarios(){
        return usuarioDao.getUsuarios();
    }

    @RequestMapping(value="api/usuarios", method = RequestMethod.POST)
    public void registrarUsuario(@RequestBody Usuario usuario){
         usuarioDao.registrar(usuario);
    }


    @RequestMapping(value="usuario1")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Edwin");
        usuario.setApellido("Torrado");
        usuario.setEmail("edwin@gmail.com");
        usuario.setTelefono("3107755561");
        usuario.setPassword("Edwin");

        return usuario;
    }

    @RequestMapping(value="api/usuarios/{id}", method= RequestMethod.DELETE)
    public void eliminar(@PathVariable Long id){
        usuarioDao.eliminar(id);
    }

    @RequestMapping(value="usuario3")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Edwin");
        usuario.setApellido("Torrado");
        usuario.setEmail("edwin@gmail.com");
        usuario.setTelefono("3107755561");
        usuario.setPassword("Edwin");

        return usuario;
    }

}
