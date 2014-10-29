import java.util.Enumeration;
import java.util.Vector;

import RenterPoints.DefaultRenterPointStrategy;
import RenterPoints.RenterPointStrategy;
import Transactions.*;


public class Customer {
    private String _name;
    private Vector<Transaction> _transactions = new Vector<Transaction>();
	private int _frequentRenterPoints;
	private RenterPointStrategy _renterPointStrategy = new DefaultRenterPointStrategy();
    
    public Customer (String name) {
        _name = name;
		_frequentRenterPoints = 0;
    }
    
    public void addTransaction(Transaction arg) {
        _transactions.addElement(arg);
    }
    
    public String getName() {
        return _name;
    }
    
    public String statement() {
    
        double      totalAmount          = 0;
        Enumeration<Transaction> transactions              = _transactions.elements();
        String      result               = "Transaction Record for " + getName() + "\n";
        
        while (transactions.hasMoreElements()) {
            
        	Transaction currentTransaction = transactions.nextElement();
        	double currentSubTotal = 0;
        	
        	// add frequent renter points
        	_frequentRenterPoints += currentTransaction.getFrequentRenterPoints(_renterPointStrategy);
        	result += _frequentRenterPoints + " ";
        	currentSubTotal += currentTransaction.getPrice();
        
         
            result += "\t" + currentTransaction.getProduct().getTitle() +
                      "\t$" +  String.format("%.2f", currentSubTotal) + "\n";
            totalAmount += currentSubTotal;
        }
        
        // add footer lines
        result += "Amount owed is $" + String.format("%.2f", totalAmount) + "\n";
        result += "You earned " + String.valueOf(_frequentRenterPoints) +
                  " frequent renter points";
        return result;
    }
    
    
    
}
