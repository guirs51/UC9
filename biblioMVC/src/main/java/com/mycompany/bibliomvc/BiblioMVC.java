/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bibliomvc;

import com.mycompany.bibliomvc.dao.BooksDAO;
import com.mycompany.bibliomvc.database.ConnectSQLite;
import com.mycompany.bibliomvc.database.CreateTables;
import com.mycompany.bibliomvc.model.Book;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author GUILHERMEDIASVILLANO
 */
public class BiblioMVC {

    public static void main(String[] args) {
        
        ConnectSQLite connectSQLite = new ConnectSQLite();
        Connection conexao = connectSQLite.connect();
        
        CreateTables.createTables(conexao);
        
        Book myBook1 = new Book("Livro 1", "Leo", 99.50, 2000);
        Book myBook2 = new Book("Livro 2", "Ana" ,49.50, 2025);
        Book myBook3 = new Book("Livro 3", "Jao" ,19.50, 2015);
        
        BooksDAO.addBook(myBook1);
        BooksDAO.addBook(myBook2);
        BooksDAO.addBook(myBook3);
        
        String[] info = BooksDAO.findBook( 1);
        System.out.println(info[0] + " " +info[1] + " " +info[2] + " " +info[3] + " " + info[4]);
        
        
        ArrayList<Book> infoBooks = BooksDAO.findBooks();
        
        for(Book book : infoBooks){
          System.out.println(book.getId() + " " + book.getTitle() + " " + book.getAuthor() + " " + book.getPrice() + " " + book.getYear());
        }
    }
}
