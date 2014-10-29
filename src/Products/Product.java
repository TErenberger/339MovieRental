package Products;
public abstract class Product {

	protected String _title;
	protected double _salePrice;
	protected double _rentalBasePrice;
	protected boolean _forSale;
	
	
	
	public Product(String title, double rentalPrice) {
		_title = title;
		_rentalBasePrice = rentalPrice;
		_forSale = false;
	}
	
	public Product(String title, double rentalPrice, double salePrice) {
		_salePrice = salePrice;
		_rentalBasePrice = rentalPrice;
		_forSale = true;
		_title = title;
	}

	public String getTitle() {
	    return _title;
	}
	public double getSalePrice() {
		if(_forSale == true)
		{
			return _salePrice;
		}
		else
		{
			return -1;
		}
	}
	public boolean isForSale()
	{
		return _forSale;
	}
	public abstract double rentalPrice(int daysRented);
	
	public abstract int frequentRentalPoints(int daysRented);
}