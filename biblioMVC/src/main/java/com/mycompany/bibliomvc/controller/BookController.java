/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliomvc.controller;

import com.mycompany.bibliomvc.dao.BooksDAO;
import com.mycompany.bibliomvc.model.Book;

/**
 *
 * @author GUILHERMEDIASVILLANO
 */
public class BookController {

    public static void addBook(String title, String author, String priceStr, String yearStr) {

        //Conversão de texto para tipos corretos
        double price = Double.parseDouble(priceStr);
        int year = Integer.parseInt(yearStr);

        //Cria o objeto Book com os dados recebidos
        Book myBook = new Book(title, author, price, year);

        BooksDAO.addBook(myBook);

    }

    public static void updateBook(String idStr, String newTitle, String newAuthor, String newPrice, String newYear) {
            
        //Conversão de texto para tipos corretos
        int id = Integer.parseInt(idStr);
        double Price = Double.parseDouble(newYear);
        int Year = Integer.parseInt(newYear);
        
        Book myBook = new Book(newTitle, newAuthor, Price, Year);
        myBook.setId(id);
        
        BooksDAO.updateBook(myBook);
        
    }
    
    public static void removeBook(String idStr){
        
        //Conversão de texto para tipos corretos
        int id = Integer.parseInt(idStr);
        
        BooksDAO.deleteBook(id);
        
       System.out.println("hello wolrd");
    }
}
