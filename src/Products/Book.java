package Products;

public class Book extends Product {

	public static final double BASE_PRICE = .5;
	public Book(String title) 
	{
		super(title, BASE_PRICE);
	}
	
	public Book(String title, double salePrice)
	{
		super(title, BASE_PRICE, salePrice);
		
	}

	@Override
	public double rentalPrice(int daysRented) {
		if(daysRented > 3)
		{
			return BASE_PRICE + (daysRented - 3)*.5;
		}
		else
		{
			return BASE_PRICE;
		}
	}

	@Override
	public int frequentRentalPoints(int daysRented) {
		if(daysRented > 7)
		{
			return 2;
		}
		else
		{
			return 1;
		}
	}
	
	@Override
	public String getCategory()
	{
		return "Book";
	}

}
