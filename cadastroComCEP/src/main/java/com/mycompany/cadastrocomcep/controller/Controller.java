/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastrocomcep.controller;

import com.mycompany.cadastrocomcep.dao.UserDAO;
import com.mycompany.cadastrocomcep.model.Endereco;
import com.mycompany.cadastrocomcep.model.UserModel;
import com.mycompany.cadastrocomcep.service.ViaCEP;
import org.json.JSONObject;

/**
 *
 * @author GUILHERMEDIASVILLANO
 */
public class Controller {
        // Valida o formato do e-mail usando expressão regular (Regex)
    public static boolean emailValido(String email) {
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        return email.matches(regex);
    }
    
    public static Endereco buscarCep(String cep) throws Exception {
         JSONObject enderecoJson = ViaCEP.buscarCep(cep);
        
         if(enderecoJson.has("erro")){
             return null;
         }
         
          Endereco userEndereco = new Endereco(enderecoJson.getString("cep"),
                  enderecoJson.getString("logradouro"),
                  enderecoJson.getString("bairro"), 
                  enderecoJson.getString("localidade"),
                  enderecoJson.getString("estado"));
        return userEndereco;
    }
    
    public static boolean register(String name , String email ,char[] password, String cep , String bairro , String logradouro,  String estado, String localidade){
            String senha = new String(password);
            UserModel user = new UserModel(name, email, senha, cep, logradouro, bairro, localidade, estado);
            UserDAO userdao = new UserDAO();
            
            if(userdao.CadastrarUser(user)){
                return true;
            }
            return false;
    }
    
    public static boolean login(String email, char[] password){
        String senha = new String(password); 
        UserDAO userdao = new UserDAO();
        
        if(userdao.validarUser(email, senha)){
            return true;
        }
        return false;   
    }
    
}
