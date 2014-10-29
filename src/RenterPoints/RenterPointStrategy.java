package RenterPoints;

import Products.Product;

public interface RenterPointStrategy {

	public int calculateRenterPoints();
	public int calculateRenterPoints(Product product);
}
