package com.mycompany.booksstore.ShippmentService;

import com.mycompany.booksstore.Books.clsBook;

public class clsShipmmentService {
    
    public enum enStatus{Packaging, Delivering, Deliveried}
    
    private clsBook _book;
    private enStatus _status;
    private String _address;
    private String _email;
    private int _quantity;

    public clsShipmmentService(clsBook book, int quantity, String email, String address) {
        _book = book;
        _address = address;
        _email = email;
        _quantity = quantity;
        _status = enStatus.Packaging;
    }
    
    public boolean startShipping() {
        System.out.println("\n*****************************************************\n");
        System.out.println("The Shipping Process For Book With ISBN: " + _book.getIsbn() + " of Type: " 
                + _book.getType() + " Has Started.....");
        System.out.println("\n*****************************************************\n");
        return true;
    }

    public String getStatus() {
        switch (_status) {
            case enStatus.Packaging:
                return "Packaging";
            case enStatus.Delivering:
                return "Delivering";
            case enStatus.Deliveried:
                return "Deliveried";
            default:
                return "Unknown";
        }
    }

    public String getAddress() {
        return _address;
    }

    public String getEmail() {
        return _email;
    }

    public int getQuantity() {
        return _quantity;
    }
    
    public void setAddress(String address) {
        _address = address;
    }

    public void setEmail(String _email) {
        this._email = _email;
    }

    public void setQuantity(int _quantity) {
        this._quantity = _quantity;
    }
    
}
