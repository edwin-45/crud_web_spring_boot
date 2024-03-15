package com.crud_web.crud_web.controllers;

import com.crud_web.crud_web.models.Usuario;
import com.crud_web.crud_web.utils.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.crud_web.crud_web.dao.UsuarioDao;

@RestController
public class AuthController {
    @Autowired
    private UsuarioDao usuarioDao;

    @Autowired
    private JWTUtil jwtUtil;
    @RequestMapping(value="api/login", method = RequestMethod.POST)
    public String login(@RequestBody Usuario usuario){

        Usuario usuarioLogueado = usuarioDao.verificarCredenciales(usuario);

        if(usuarioLogueado != null){

            String tokenJWT = jwtUtil.create(String.valueOf(usuarioLogueado.getId()),usuarioLogueado.getEmail());

            return tokenJWT;
        }
        return "fail";
    }
}
