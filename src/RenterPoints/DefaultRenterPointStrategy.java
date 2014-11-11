package RenterPoints;

import java.util.ArrayList;

import Transactions.Transaction;


public class DefaultRenterPointStrategy implements RenterPointStrategy {

	ArrayList<Transaction> checkout;
	
	public DefaultRenterPointStrategy(ArrayList<Transaction> checkout)
	{
		this.checkout = checkout;
	}
	
	@Override
	public int calculateRenterPoints() {
		int points = 0;
		
		for(Transaction line : this.checkout)
		{
			points++;
		}
		
		return points;
		
	}

}
