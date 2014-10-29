import Products.*;
import Transactions.*;

public class MovieRental {

	public static void main(String[] args) {
		
		Customer testCustomer = new Customer("David Copperfield");
		
		testCustomer.addTransaction(new Rental(new ChildrensMovie("Citizen Kane", true), 5));
		testCustomer.addTransaction(new Rental(new RegularMovie("Airbud", false), 2));
		testCustomer.addTransaction(new Rental(new RegularMovie("STRIPES", false), 3));
		testCustomer.addTransaction(new Rental(new VideoGame("Dwarf Fortress"), 3));
		testCustomer.addTransaction(new Sale(new ChildrensMovie("Flubber", 5.00, false )));
		testCustomer.addTransaction(new Sale(new VideoGame("Kingdom Hearts", 19.99)));
		System.out.print(testCustomer.statement());
		
		
	}
}
