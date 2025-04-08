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
    
    public static void addBook(String title, String author, String priceStr, String yearStr){
    
        
        //Conversão de texto para tipos corretos
        double price = Double.parseDouble(priceStr);
        int year = Integer.parseInt(yearStr);
        
        //Cria o objeto Book com os dados recebidos
        Book myBook = new Book(title, author , price, year);
        
        BooksDAO.addBook(myBook);
        
        
        
    }
    
}
