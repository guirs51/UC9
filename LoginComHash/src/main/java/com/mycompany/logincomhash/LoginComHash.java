/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.logincomhash;

import com.mycompany.logincomhash.DAO.UsuarioDAO;
import com.mycompany.logincomhash.database.ConnectionSQL;
import com.mycompany.logincomhash.model.Usuario;
import com.mycompany.logincomhash.view.TelaLogin;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GUILHERMEDIASVILLANO
 */
public class LoginComHash {

    public static void main(String[] args) {
        
        new TelaLogin().setVisible(true);
    }
}
