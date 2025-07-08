package com.mycompany.booksstore.Books;

public abstract class clsPaidBook extends clsBook{
    
    protected double _price;
    
    public clsPaidBook(String isbn, String title, int year, String type, double price) {
        super(isbn, title, year, type);
        _price = price;
    }
    
    public double getPrice() {
        return _price;
    }
    
    public void setPrice(double _price) {
        this._price = _price;
    }
    
    abstract public boolean deliver(int quantity, String email, String address);
}
