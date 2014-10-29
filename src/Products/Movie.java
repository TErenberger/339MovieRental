package Products;


public abstract class Movie extends Product {
	
    private boolean _newRelease;
    /**
     * Rental Only Movie constructor
     * @param title
     * @param newRelease
     */
    public Movie(String title, double rentalBasePrice, boolean newRelease) {
        super(title, rentalBasePrice);
        _newRelease = newRelease;
    }
    
    /**
     * Rental or For Sale Movie
     * @param title
     * @param newRelease
     * @param salePrice
     */
    public Movie(String title, double rentalBasePrice, double salePrice, boolean newRelease) {
        super(title, rentalBasePrice, salePrice);
        _newRelease = newRelease;
    }
    
    public boolean getNewRelease() {
    	return _newRelease;
    }
    
    public void setNewRelease(boolean newValue) {
    	_newRelease = newValue;
    }
    
}
