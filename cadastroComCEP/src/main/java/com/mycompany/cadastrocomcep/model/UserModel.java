/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastrocomcep.model;

/**
 *
 * @author GUILHERMEDIASVILLANO
 */
public class UserModel {

    private int id;
    private String name;
    private String email;
    private String password;
    private String CEP;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String estado;

    public UserModel(String name, String email, String password, String CEP, String logradouro, String bairro, String localidade, String estado) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.CEP = CEP;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.localidade = localidade;
        this.estado = estado;
    }

//    public UserModel(String CEP, String logradouro, String bairro, String localidade, String estado) {
//        this.CEP = CEP;
//        this.logradouro = logradouro;
//        this.bairro = bairro;
//        this.localidade = localidade;
//        this.estado = estado;
//    }

    //get 
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public String getCEP() {
        return this.CEP;
    }

    public String getLogradouro() {
        return this.logradouro;
    }

    public String getBairro() {
        return this.bairro;
    }

    public String getLocalidade() {
        return this.localidade;
    }

    public String getEstado() {
        return this.estado;
    }

    //Settings 
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public void settEstado(String estado) {
        this.estado = estado;
    }
}
