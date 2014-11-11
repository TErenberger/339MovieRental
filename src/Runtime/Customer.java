package Runtime;
import java.util.ArrayList;

import RenterPoints.FrequentPointTactician;
import Transactions.*;


public class Customer 
{
    private String _name;
    private int _age;
    private ArrayList<ArrayList<Transaction>> _checkouts = new ArrayList<ArrayList<Transaction>>();
	private int _frequentRenterPoints;
    
    public Customer (String name, int age) 
    {
        _name = name;
        _age = age;
		_frequentRenterPoints = 0;
    }
    
    public void addCheckout(ArrayList<Transaction> arg) 
    {
        _checkouts.add(arg);
    }
    
    public String getName() 
    {
        return _name;
    }
    
    public int getAge()
    {
    	return _age;
    }
    
    public String statement() 
    {
    
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
    		   	//add line of checkout
	        	double currentSubTotal = 0;
	        	currentSubTotal += currentTransaction.getPrice();
	            result += "\t" + String.format("%-15s", currentTransaction.getProduct().getCategory()) 
	            		+ "\t" + String.format("%-15s", currentTransaction.getProduct().getTitle()) +
	                      "\t" +  String.format("$%.2f", currentSubTotal) + "\n";
	            checkoutTotal += currentSubTotal;
    	   }
    	   
    	   _frequentRenterPoints += FrequentPointTactician.pickStrategy(this, currentCheckout).calculateRenterPoints();
    	   result += String.format("Checkout Total: $%.2f", checkoutTotal) + "\n\n";
           totalAmount += checkoutTotal; 
        }
        
        // add footer lines
        result += "Total amount spent is $" + String.format("%.2f", totalAmount) + "\n";
        result += "You earned " + String.valueOf(_frequentRenterPoints) +
                  " frequent renter points";
        return result;
    }
    
    
    
}
