package com.mycompany.booksstore;

import com.mycompany.booksstore.Books.clsBook;
import com.mycompany.booksstore.Books.clsPaidBook;
import com.mycompany.booksstore.Books.interNotForSale;
import com.mycompany.booksstore.Books.interQuantityBook;
import java.time.Year;
import java.util.ArrayList;

public class clsInventory {
    
    private ArrayList<clsBook> _listOfBooks = new ArrayList<>();
    

    public boolean addBook(clsBook book){
        return _listOfBooks.add(book);
    }
    
    public void removeOutdatedBooks(int YearsOld){
        
        for(clsBook book : _listOfBooks){
            if(getBookYears(book.getYear()) > YearsOld) {
                _listOfBooks.remove(book);
            }
        }
    }
    
    public int getBookYears(int years){
        return Year.now().getValue() - years;
    }
    
    public double buyBook(String isbn, int quantity, String email, String address) {
        
        clsBook book;
        
        try {
            book = _findInverntoryBookByISBN(isbn);
            
            if(book instanceof interQuantityBook)
                ((interQuantityBook) book).reduceQuantity();
            
            _checkIfForSale(book);
        }
        catch (IllegalArgumentException e){
            System.out.println("\n*****************************************************\n");
            System.out.println(e.getMessage());
            System.out.println("\n*****************************************************\n");
            return -1;
        }
        catch (Throwable e) {
            System.out.println("\n*****************************************************\n");
            System.out.println(e.getMessage());
            System.out.println("\n*****************************************************\n");
            return -2;
        }
        
        if(book instanceof clsPaidBook)
            if(((clsPaidBook)book).deliver(quantity, email, address))
                return _getPaidAmount(book, quantity);
        
        System.out.println("Could not ship");
        return -1;
    }
    
    private void _checkIfForSale(clsBook book) throws java.lang.Throwable{
        if(book instanceof interNotForSale)
            throw new Throwable("The Book is not for sale");
    }
    
    private double _getPaidAmount(clsBook book, int quantity){
        return ((clsPaidBook)book).getPrice() * quantity;
    }
    
    private clsBook _findInverntoryBookByISBN(String isbn) throws IllegalArgumentException{
        for (clsBook book : _listOfBooks) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        
        // not found
        throw new IllegalArgumentException("The Book with: "+isbn+", Was not Found");
    }
    
    public void printInventoryDetails() {
        System.out.println("-------------------------------------------------");
        System.out.println("Inventory List:");

        if (_listOfBooks.isEmpty()) {
            System.out.println("No books in inventory.");
            return;
        }

        for (clsBook book : _listOfBooks) {
            book.printBookDetails();
        }

        System.out.println("-------------------------------------------------");
    }

    private Exception Throwable(String not_for_sale) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}