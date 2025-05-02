/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.model;

/**
 *
 * @author guilh
 */
public class Joker {
    private String setup;
    private String delivery;
    
    public Joker(String setup, String delivery){
        this.delivery = delivery;
        this.setup = setup;
    }
    
    public String getSetup(){
        return this.setup;
    }
    
    public String getDelivery(){
        return this.delivery;
    }
    
    public String getJoker(){
        return this.setup + "\n " + this.delivery;
    }
}
