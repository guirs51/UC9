/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.logincomhash;

import com.mycompany.logincomhash.DAO.UsuarioDAO;
import com.mycompany.logincomhash.database.ConnectionSQL;
import com.mycompany.logincomhash.model.Usuario;

/**
 *
 * @author GUILHERMEDIASVILLANO
 */
public class LoginComHash {

    public static void main(String[] args) {
        ConnectionSQL.conectar();
        
       //Usuario meuUser = new Usuario("Ana@gmail", "minhaSenha");
        //Usuario meuUser1 = new Usuario("loud@gmail", "minhaSenha");
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        //usuarioDAO.registrarUsuario(meuUser1);
        
        //usuarioDAO.validarLogin(meuUser1);
        
        System.out.println(usuarioDAO.buscarUsuarioPorEmail("Ana@gmail").getEmail());
        
       usuarioDAO.atualizarSenha("loud@gmail", "123");
        
        
    }
}
