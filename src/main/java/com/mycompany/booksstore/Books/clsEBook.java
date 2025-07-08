package com.mycompany.booksstore.Books;

import EmailService.clsEmailService;

public class clsEBook extends clsPaidBook implements interEFile{
    
    private String _fileType;
    
    public clsEBook(String isbn, String title, int year, double price, String fileType) {
        super(isbn, title, year, "E-Book", price);
        _fileType = fileType;
    }

    @Override
    public String getType() {
        return _type;
    }
    
    @Override
    public void printBookDetails(){
        super.printBookDetails();
        System.out.println("Price    : " + _price);
    }
    
    @Override
    public boolean deliver(int quantity, String email, String address){
        return new clsEmailService(this, quantity, email).sendEmail();
    }

    public String getFileType() {
        return _fileType;
    }
    
}
