package com.desafioreact.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.desafioreact.backend.model.User;
import com.desafioreact.backend.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User salvar(@RequestBody User user){
        validaUsuariosAtivos();
        return userRepository.save(user);
    }


    public List<User> listar(){
        return userRepository.findAll();
    }

    private void validaUsuariosAtivos(){
        long usuariosAtivos = userRepository.findAll().stream()
        .filter(User::isActive)
        .count();
        if (usuariosAtivos >= 5) {
            
            throw new IllegalStateException("Limite de 5 usuários ativos atingido.");
        }
    }
}
