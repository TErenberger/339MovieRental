package Pricing;

import java.util.ArrayList;
import Runtime.Customer;
import Transactions.Transaction;

public class PriceTactician
{
	public static PriceStrategy pickStrategy(Customer customer, ArrayList<Transaction> currentCheckout)
	{
		return new DefaultPriceStrategy();
	}
}
