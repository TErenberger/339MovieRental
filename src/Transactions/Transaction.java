package Transactions;
import Products.Product;
import RenterPoints.*;


public abstract class Transaction {

	protected Product _product;
	
	public Transaction(Product product)
	{
		_product = product;
	}

	public Product getProduct() {
	    return _product;
	}
	
	public abstract double getPrice();
	
	public int getFrequentRenterPoints(RenterPointStrategy strategy)
	{
		return strategy.calculateRenterPoints(this.getProduct());
	}
	
}
