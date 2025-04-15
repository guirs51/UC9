/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.logincomhash.model;

/**
 *
 * @author GUILHERMEDIASVILLANO
 */
public class Usuario {
    private int id;
    private String email;
    private String senha;

    // Construtor
    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    // Get e Set do ID
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Get e Set do Email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Get e Set da Senha
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
