import java.util.Enumeration;
import java.util.Vector;
import java.util.ArrayList;

import RenterPoints.DefaultRenterPointStrategy;
import RenterPoints.FrequentPointTactician;
import RenterPoints.RenterPointStrategy;
import Transactions.*;


public class Customer {
    private String _name;
    private int _age;
    private ArrayList<ArrayList<Transaction>> _checkouts = new ArrayList<ArrayList<Transaction>>();
	private int _frequentRenterPoints;
	private RenterPointStrategy _renterPointStrategy = new DefaultRenterPointStrategy();
    
    public Customer (String name, int age) {
        _name = name;
        _age = age;
		_frequentRenterPoints = 0;
    }
    
    public void addCheckout(ArrayList<Transaction> arg) {
        _checkouts.add(arg);
    }
    
    public String getName() {
        return _name;
    }
    
    public String statement() {
    
        double      totalAmount          = 0;
        String      result               = "Checkout Record for " + getName() + "\n";
        int index = 0;
        for(ArrayList<Transaction> currentCheckout : _checkouts)
        {
    	   index++;
    	   result += "Checkout #" + index + "\n";
    	   double checkoutTotal = 0;
    	   
    	   
    	   for(Transaction currentTransaction : currentCheckout)
    	   {
    		   
	        	double currentSubTotal = 0;
	        	
	        	// add frequent renter points
	        	
	        	currentSubTotal += currentTransaction.getPrice();
	        
	         
	            result += "\t" + currentTransaction.getProduct().getTitle() +
	                      "\t$" +  String.format("%.2f", currentSubTotal) + "\n";
	            checkoutTotal += currentSubTotal;
    	   }
    	   
    	   _frequentRenterPoints += FrequentPointTactician.pickStrategy(this, currentCheckout).calculateRentalPoint();
    	   result += "Checkout Total: $" + checkoutTotal + "\n\n";
           totalAmount += checkoutTotal; 
        }
        
        // add footer lines
        result += "Total amount spent is $" + String.format("%.2f", totalAmount) + "\n";
        result += "You earned " + String.valueOf(_frequentRenterPoints) +
                  " frequent renter points";
        return result;
    }
    
    
    
}
