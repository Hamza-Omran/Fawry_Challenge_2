package EmailService;

import com.mycompany.booksstore.Books.clsBook;

public class clsEmailService {
    
    private clsBook _book;
    private String _email;
    private int _quantity;

    public clsEmailService(clsBook book, int quantity, String email) {
        _book = book;
        _email = email;
        _quantity = quantity;
    }
    
    public boolean sendEmail() {
        System.out.println("\n*****************************************************\n");
        System.out.println("The Email Has Been Sented For Book With ISBN: " + _book.getIsbn() + " of Type: " 
                + _book.getType());
        System.out.println("\n*****************************************************\n");
        return true;
    }
    
    public String getEmail() {
        return _email;
    }

    public int getQuantity() {
        return _quantity;
    }

    public void setEmail(String _email) {
        this._email = _email;
    }

    public void setQuantity(int _quantity) {
        this._quantity = _quantity;
    }
}
    

