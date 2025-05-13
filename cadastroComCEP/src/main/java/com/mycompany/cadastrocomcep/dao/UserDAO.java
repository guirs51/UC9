/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastrocomcep.dao;

import com.mycompany.cadastrocomcep.database.ConnectionSQL;
import com.mycompany.cadastrocomcep.model.UserModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author GUILHERMEDIASVILLANO
 */
public class UserDAO {

    public boolean CadastrarUser(UserModel user) {
        String sql = "INSERT INTO user (name, email, password, cep, logradouro, bairro, localidade, estado) VALUES (?, ?, ?, ?, ?, ?, ?, ?); ";

        String senhaHas = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());

        try (Connection conn = ConnectionSQL.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, user.getName());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, senhaHas);
            stmt.setString(4, user.getCEP());
            stmt.setString(5, user.getLogradouro());
            stmt.setString(6, user.getBairro());
            stmt.setString(7, user.getLocalidade());
            stmt.setString(8, user.getEstado());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public UserModel buscarUser(String email) {
        String sql = "SELECT * FROM user WHERE email = ? ";

        try (Connection conn = ConnectionSQL.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                UserModel user = new UserModel(rs.getString("name"), rs.getString("email"), rs.getString("password"), rs.getString("cep"), rs.getString("bairro"), rs.getString("logradouro"), rs.getString("localidade"), rs.getString("estado"));
                user.setId(rs.getInt("id"));
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean validarUser(String email, String senha) {
        String sql = "SELECT password FROM user WHERE email = ?";
           
        try (Connection conn = ConnectionSQL.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()){
            String senhaHash = rs.getString("password");
            return BCrypt.checkpw(senha, senhaHash);
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteUser(String email) {
        String sql = "DELETE FROM user WHERE email = ?";

        try (Connection conn = ConnectionSQL.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, email);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

}
