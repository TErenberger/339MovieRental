package RenterPoints;

import java.util.ArrayList;
import Transactions.*;
import Runtime.Customer;


public class FrequentPointTactician {

	
	public static RenterPointStrategy pickStrategy(Customer customer, ArrayList<Transaction> currentCheckout)
	{
		
		// double points if more than two types of categories
		
		if(twoCategoryCheck(currentCheckout))
		{
			return new DoubleRenterPointStrategy();
		}
		
			
		
		// double points to 18-22 renting one or more new release
		if(customer.getAge() >= 18 && customer.getAge() <= 22)
		{
			return new DoubleRenterPointStrategy();
		}
		
		return new DefaultRenterPointStrategy();
	}
	
	
	
	public static boolean twoCategoryCheck(ArrayList<Transaction> checkout)
	{
		
		
		return false;
	}
	
	
}
