package RenterPoints;

import Products.Product;


public class DefaultRenterPointStrategy implements RenterPointStrategy {

	@Override
	public int calculateRenterPoints() {
		
		return 1;
	}

}
