package RenterPoints;

import Products.Product;


public class DefaultRenterPointStrategy implements RenterPointStrategy {

	@Override
	public int calculateRenterPoints() {
		
		return 1;
	}

	@Override
	public int calculateRenterPoints(Product product) {
		
		return 1;
	}

}
