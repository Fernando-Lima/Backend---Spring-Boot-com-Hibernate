package com.desafioreact.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafioreact.backend.model.User;
import com.desafioreact.backend.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User salvar(@RequestBody User user){
        return userService.salvar(user);
    }

    @GetMapping
    public List<User> listar(){
        return userService.listar();
    }

}
