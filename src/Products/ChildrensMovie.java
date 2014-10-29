package Products;


public class ChildrensMovie extends Movie {
	
	public static final double BASE_PRICE = 1.5;
	
	public ChildrensMovie(String title, boolean newRelease)
	{
		super(title, BASE_PRICE, newRelease);
		
	}
	
	public ChildrensMovie(String title, double salePrice, boolean newRelease)
	{
		super(title, BASE_PRICE, salePrice, newRelease);
		
	}
	
	@Override
	public double rentalPrice(int daysRented)
	{
	
		if(this.getNewRelease())
		{
			return daysRented * 3;
		}
		
		if(daysRented > 3)
		{
			return BASE_PRICE + (daysRented - 3)* 1.5;
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
