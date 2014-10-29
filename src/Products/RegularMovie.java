package Products;


public class RegularMovie extends Movie {
	private static final double BASE_PRICE = 2.0;
	
	public RegularMovie(String title, boolean newRelease) {
		super(title, BASE_PRICE, newRelease);
		
	}
	
	public RegularMovie(String title, double salePrice, boolean newRelease)
	{
		super(title, BASE_PRICE, salePrice, newRelease);
	}

	@Override
	public double rentalPrice(int daysRented) {
		
		if(this.getNewRelease())
		{
			return daysRented * 3;
		}
		
		if(daysRented > 2)
		{
			return BASE_PRICE + (daysRented - 2) * 1.5;
		}
		else
		{
			return BASE_PRICE;
		}
		
	}

	@Override
	public int frequentRentalPoints(int daysRented) {
		if(this.getNewRelease() && daysRented > 1)
		{
			return 2;
		}
		else
		{
			return 1;
		}
	}

}
