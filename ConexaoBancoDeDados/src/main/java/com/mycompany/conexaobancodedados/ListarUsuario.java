/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conexaobancodedados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author GUILHERMEDIASVILLANO
 */
public class ListarUsuario {

    public static String listarUsuarios(Connection conexao) {

        // Criação de uma String para armazenar os resultados
        String textoUsuarios = "";

        // SQL para selecionar todos os registros
        String sql = "SELECT * FROM usuarios";

        // Tentando executar a consulta SQL
        try (Statement stmt = conexao.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

            // Cabeçalho da tabela
            textoUsuarios += "ID | Nome | Email\n";
            textoUsuarios += "----------------------\n";

            // Loop para percorrer todos os registros retornados
            while (rs.next()) {
                // Pega os dados de cada usuário do banco
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String email = rs.getString("email");

                // Concatena os dados na String
                textoUsuarios += id + " | " + nome + " | " + email + "\n";
            }
        } catch (Exception e) {
            // Caso ocorra algum erro, adiciona a mensagem de erro na String
            textoUsuarios += "Erro ao listar usuários: " + e.getMessage();
        }

        // Retorna o texto com os dados dos usuários
        return textoUsuarios;
    }

    public static String buscarUsuario(Connection conexao, String email, String senha) {

        String nome = "";
        
        // SQL para selecionar todos os registros
        String sql = "SELECT * FROM usuarios WHERE email = ? AND senha = ?";

        try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setString(1, email);
            pstmt.setString(2, senha);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                nome = rs.getString("nome");
                System.out.println("Usuario encontrado");
                return nome;
            } else {
                System.out.println("Usuario NAO encontrado :(");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro.getMessage());
        }
        return null;
    }
    
}
