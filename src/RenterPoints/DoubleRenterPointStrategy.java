package RenterPoints;

import java.util.ArrayList;

import Products.Product;
import Transactions.Transaction;

public class DoubleRenterPointStrategy extends DefaultRenterPointStrategy implements RenterPointStrategy {

	public DoubleRenterPointStrategy(ArrayList<Transaction> checkout)
	{
		super(checkout);
	}

	@Override
	public int calculateRenterPoints() {
		int points = 0;
		
		for(Transaction line : this.checkout)
		{
			points+=2;
		}
		
		
		return points;
	}
}
