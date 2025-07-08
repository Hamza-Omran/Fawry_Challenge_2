package com.mycompany.booksstore.Books;

public abstract class clsBook{
    protected String _isbn;
    protected String _title;
    protected int _year;
    protected String _type;

    public clsBook(String isbn, String title, int year, String type) {
        _isbn = isbn;
        _title = title;
        _year = year;
        _type = type;
    }

    public String getIsbn() {
        return _isbn;
    }

    public String getTitle() {
        return _title;
    }

    public int getYear() {
        return _year;
    }

    public void setIsbn(String _isbn) {
        this._isbn = _isbn;
    }

    public void setTitle(String _title) {
        this._title = _title;
    }

    public void setYear(int _year) {
        this._year = _year;
    }

 

    public void printBookDetails(){
        System.out.println("-------------------------------------------------");
        System.out.println("ISBN     : " + _isbn);
        System.out.println("Title    : " + _title);
        System.out.println("Year     : " + _year);
        System.out.println("Type     : " + getType());
    }
    
    abstract public String getType();
}
