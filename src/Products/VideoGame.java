package Products;


public class VideoGame extends Product {

	public final static double BASE_PRICE = 2.0;
	public VideoGame(String title){
		super(title, BASE_PRICE);
	}
	public VideoGame(String title, double salePrice) {
		super(title, BASE_PRICE, salePrice);
	}
	
	@Override
	public double rentalPrice(int daysRented) {
		if(daysRented > 2)
		{
			return BASE_PRICE + (daysRented-2)*1.5;
		}
		else
		{
			return BASE_PRICE;
		}
		
	}

	@Override
	public int frequentRentalPoints(int daysRented) {
		if(daysRented > 2)
		{
			return 2;
		}
		else
		{
			return 1;
		}
	}

}
