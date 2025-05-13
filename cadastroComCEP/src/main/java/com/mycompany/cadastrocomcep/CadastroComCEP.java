/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastrocomcep;

import com.mycompany.cadastrocomcep.dao.UserDAO;
import com.mycompany.cadastrocomcep.database.ConnectionSQL;
import com.mycompany.cadastrocomcep.model.UserModel;
import com.mycompany.cadastrocomcep.service.ViaCEP;
import com.mycompany.cadastrocomcep.view.Cadastro;
import com.mycompany.cadastrocomcep.view.TelaLogin;
import org.json.JSONObject;

/**
 *
 * @author GUILHERMEDIASVILLANO
 */
public class CadastroComCEP {

    public static void main(String[] args) {
         new TelaLogin().setVisible(true);
    } 
}
