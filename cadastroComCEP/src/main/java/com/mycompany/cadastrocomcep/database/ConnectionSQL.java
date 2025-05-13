/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastrocomcep.database;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author GUILHERMEDIASVILLANO
 */
public class ConnectionSQL {
    // carrega os arquivos .env

    private static final Dotenv dotenv = Dotenv.load();

    private static Connection connection;

    // Variáveis de conexão
    private static final String URL = dotenv.get("DB_URL");
    private static final String DB_USER = dotenv.get("DB_USER");
    private static final String DB_PASSWORD = dotenv.get("DB_PASSWORD");

    public static Connection conectar() {
        try {
            // Se ainda não houver conexão, cria uma nova
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(URL, DB_USER, DB_PASSWORD);
                CreateTable();
                System.out.println("Conectado ao banco.");
            }
        } catch (SQLException error) {
            throw new RuntimeException("Erro na conexão com o banco de dados", error);
        }

        return connection;
    }

    private static void CreateTable() {
        String sql = "CREATE TABLE IF NOT EXISTS user ("
                + "id INT AUTO_INCREMENT PRIMARY KEY, "
                + "name VARCHAR(255) NOT NULL,"
                + "email VARCHAR(255) NOT NULL UNIQUE,"
                + "password VARCHAR(255) NOT NULL,"
                + "cep VARCHAR(255) NOT NULL,"
                + "logradouro VARCHAR(255) NOT NULL,"
                + "bairro VARCHAR(255) NOT NULL,"
                + "localidade VARCHAR(255) NOT NULL,"
                + "estado VARCHAR(255) NOT NULL) ";
        
        try(Statement stmt = connection.createStatement()){
        stmt.execute(sql);
        }catch (SQLException e ){
            throw new RuntimeException("Erro ao criar a tabela", e);
        }
}
}
