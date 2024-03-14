package com.crud_web.crud_web.controllers;

import com.crud_web.crud_web.models.Usuario;
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
    @RequestMapping(value="api/login", method = RequestMethod.POST)
    public String login(@RequestBody Usuario usuario){



        if(usuarioDao.verificarCredenciales(usuario)){
            return "OK";
        }
        return "fail";
    }
}
