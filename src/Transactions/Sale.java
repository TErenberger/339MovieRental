package Transactions;

import Products.Product;

public class Sale extends Transaction {
	
	public Sale(Product product) {
		super(product);
		
	}
	
	public double getPrice()
	{
		return _product.getSalePrice();
	}

}
