/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.controller;

import com.mycompany.mavenproject1.model.Joker;
import com.mycompany.mavenproject1.service.JokerService;
import org.json.JSONObject;

/**
 *
 * @author guilh
 */
public class JokerController {

    public static String getJoker() throws Exception{

        JSONObject jokerJson = JokerService.buscarJoker();

        if (jokerJson.has("erro") ){
            return null;
        }
        
        Joker jj = new Joker(jokerJson.getString("setup"), jokerJson.getString("delivery"));
        
        return jj.getJoker();
    }
}
