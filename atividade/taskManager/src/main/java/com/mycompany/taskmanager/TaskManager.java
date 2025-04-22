/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taskmanager;

import com.mycompany.taskmanager.dao.UserDAO;
import com.mycompany.taskmanager.database.ConnectionSQL;
import com.mycompany.taskmanager.model.User;

/**
 *
 * @author LIVIAHELOISAALVESSOB
 */
public class TaskManager {

    public static void main(String[] args) {
        
        ConnectionSQL.connect();
        
        User user = new User("guilherme", "guilherme@", "232");
        UserDAO.registerUser(user);
        System.out.println( UserDAO.validateLogin(user));
        UserDAO.updateUserName("guilherme@","ana");
        System.out.println(UserDAO.updateUserPassword("Guilherme@", "323"));
//        UserDAO.deleteUser("guilherme@");
        
        
    }
}
