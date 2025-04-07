/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conexaobancodedados;

import java.sql.Connection;

/**
 *
 * @author GUILHERMEDIASVILLANO
 */
public class ConexaoBancoDeDados {

    public static void main(String[] args) {
        // Instanciando o objeto da classe ConexaoSQLite
        ConexaoSQLite conexaoSQLite = new ConexaoSQLite();
        // Chamando o método conectar e armazenando ele para usar depois
        Connection conexao = conexaoSQLite.conectar();
        
       CriarTabela.criarTabelaUsuarios(conexao);
       
       //InserirUsuario.inserirUsuario(conexao, "Gui","Gui@gmail");
       
      // AtualizarUsuarios.atualizarUsuario(conexao, 1, "Ana", "ana@gmail.com");
      
       //DeletarUsuario.deletarUsuario(conexao, 1 );
       
       System.out.println(ListarUsuario.listarUsuarios(conexao));
       
        
    }
}
