package com.mycompany.booksstore;

import com.mycompany.booksstore.Books.clsBook;
import com.mycompany.booksstore.Books.clsDemoBook;
import com.mycompany.booksstore.Books.clsEBook;
import com.mycompany.booksstore.Books.clsPaperBook;

public class BooksStore {
    
//**************create inventory****************************************
    public static clsInventory inventory = new clsInventory();
    
    public static void main(String[] args) {
        
//**************create some books****************************************
        clsBook book1 = new clsPaperBook("31938029830", "The Last Ember", 2020, 400, 40);
        // this is to so what happens when there is no books in the inventory
        clsBook book2 = new clsPaperBook("05834095868", "Quantum Code", 2018, 350, 0); 
        
        clsBook book3 = new clsEBook("65487584888", "Echoes in the Fog", 2017, 280, "pdf");
        clsBook book4 = new clsEBook("75938347583", "The Clockmaker's Secret", 2015, 320, "word");
        clsBook book5 = new clsEBook("42734687262", "Clean Code: Reloaded", 2021, 500, "pdf");
        
        clsBook book6 = new clsDemoBook("45646769722", "AI Ethics and the Future", 2019);
        clsBook book7 = new clsDemoBook("89385948409", "Frontend from Scratch", 2022);

//**************add some books****************************************
        inventory.addBook(book1); 
        inventory.addBook(book2);
        inventory.addBook(book3);
        inventory.addBook(book4);
        inventory.addBook(book5);
        inventory.addBook(book6);
        inventory.addBook(book7);
        
//**************print inventory****************************************
        inventory.printInventoryDetails();

//**************buy some books****************************************

        inventory.buyBook("31938029830", 3, "af@ex.com", "cairo");
        // buying book with no copies
        inventory.buyBook("05834095868", 3, "ef@ie.com", "alex");
        inventory.buyBook("65487584888", 3, "sdf@yahoo.com", "alex");
        inventory.buyBook("75938347583", 3, "fsdf@er.com", "cairo");
        // try paying un saleable book
        inventory.buyBook("45646769722", 3, "fsdf@er.com", "cairo"); 
        inventory.buyBook("42734687262", 3, "djf@gmail.com", "alexandria");
        // this is to show when there is no book with the searched ISBN
        inventory.buyBook("nothing", 3, "a@d.com", "cairo");  
            
//**************print inventory****************************************
        inventory.printInventoryDetails();
    }
}
