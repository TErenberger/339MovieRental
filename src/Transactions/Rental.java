package Transactions;
import Products.Product;


public class Rental extends Transaction{
    private int   _daysRented;
    
    public Rental(Product product, int daysRented) {
    	super(product);
        _daysRented = daysRented;
    }
    
    public int getDaysRented() {
        return _daysRented;
    } 
    
    public double getPrice()
    {
    	return _product.rentalPrice(_daysRented);
    }
   
}
