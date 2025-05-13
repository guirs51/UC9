/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastrocomcep.model;

/**
 *
 * @author GUILHERMEDIASVILLANO
 */
public class Endereco {
    private String CEP;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String estado;
    
    public Endereco(String CEP, String logradouro, String bairro, String localidade, String estado) {
        this.CEP = CEP;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.localidade = localidade;
        this.estado = estado;
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
    
}
