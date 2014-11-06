package Transactions;
import Pricing.Price;
import Pricing.PriceStrategy;
import Products.Product;
import RenterPoints.*;


public abstract class Transaction {

	protected Product _product;
	protected Price _priceStrategy;
	
	public Transaction(Product product)
	{
		_product = product;
	}

	public Product getProduct() {
	    return _product;
	}
	
	public abstract double getPrice();
	
}
