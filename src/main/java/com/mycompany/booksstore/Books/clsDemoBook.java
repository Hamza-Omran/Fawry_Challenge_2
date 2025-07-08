package com.mycompany.booksstore.Books;

public class clsDemoBook extends clsBook implements interNotForSale{

    public clsDemoBook(String isbn, String title, int year) {
        super(isbn, title, year, "Demo Book");
    }
    
    @Override
    public String getType() {
        return _type;
    }    
}
