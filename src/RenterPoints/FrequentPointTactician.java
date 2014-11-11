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
			return new DoubleRenterPointStrategy(currentCheckout);
		}
		
			
		
		// double points to 18-22 renting one or more new release
		if(customer.getAge() >= 18 && customer.getAge() <= 22)
		{
			return new DoubleRenterPointStrategy(currentCheckout);
		}
		
		return new DefaultRenterPointStrategy(currentCheckout);
	}
	
	
	
	public static boolean twoCategoryCheck(ArrayList<Transaction> checkout)
	{
		ArrayList<String> categories = new ArrayList<String>();
		
		for(Transaction line : checkout)
		{
			if(!categories.contains(line.getProduct().getCategory()))
			{
				categories.add(line.getProduct().getCategory());
			}
		}
		
		if(categories.size() >= 2)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	
}
