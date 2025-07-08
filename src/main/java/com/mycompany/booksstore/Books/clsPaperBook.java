package com.mycompany.booksstore.Books;

import com.mycompany.booksstore.ShippmentService.clsShipmmentService;

public class clsPaperBook extends clsPaidBook implements interQuantityBook{
        
    private int _quantity;
    
    public clsPaperBook(String isbn, String title, int year, double price, int quantity) {
        super(isbn, title, year, "Paper Book", price);
        _quantity = quantity;
    }

    @Override
    public String getType() {
        return _type;
    }
    
    @Override
    public boolean deliver(int quantity, String email, String address){
        return new clsShipmmentService(this, quantity, email, address).startShipping();
    }
    
    @Override
    public void printBookDetails(){
        super.printBookDetails();
        System.out.println("Price    : " + _price);
        System.out.println("Quantity : " + getQuantity());
    }
    
    
    public int getQuantity() {
        return _quantity;
    }
    
    public void setQuantity(int quantity) {
        this._quantity = _quantity;
    }
    
    public void reduceQuantity() throws IllegalArgumentException{
        if(_quantity == 0)
            throw new IllegalArgumentException("We Only Got "+ _quantity+" Copy.");
        
        _quantity--;
    }
}
