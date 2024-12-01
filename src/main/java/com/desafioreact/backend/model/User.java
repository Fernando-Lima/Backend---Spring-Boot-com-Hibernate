package com.desafioreact.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class User {
    
    @Id
    @GeneratedValue
   private Long id;
   private String nome;
   private String telefone;
   private String email;
   private String username;
   private String senha;
   private boolean isActive;

    @ManyToOne
    @JoinColumn(name = "user_permission_id", nullable = false)
   private UserPermission userPermission;
   

public User() {
        super();
}

public User(Long id, String nome, String telefone, String email, String username, String senha, boolean isActive,
       UserPermission userPermission) {
    this.id = id;
    this.nome = nome;
    this.telefone = telefone;
    this.email = email;
    this.username = username;
    this.senha = senha;
    this.isActive = isActive;
    this.userPermission = userPermission;
}

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getTelefone() {
    return telefone;
}

public void setTelefone(String telefone) {
    this.telefone = telefone;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getUsername() {
    return username;
}

public void setUsername(String username) {
    this.username = username;
}

public String getSenha() {
    return senha;
}

public void setSenha(String senha) {
    this.senha = senha;
}

public boolean isActive() {
    return isActive;
}

public void setIsActive(boolean isActive) {
    this.isActive = isActive;
}

public UserPermission getUserPermission() {
    return userPermission;
}

public void setUserPermission(UserPermission userPermission) {
   this.userPermission = userPermission;
}

}
