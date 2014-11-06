package Runtime;
import java.util.ArrayList;

import Products.*;
import Transactions.*;

public class MovieRental {

	public static void main(String[] args) {
		
		Customer testCustomer = new Customer("David Copperfield", 17);
		
		ArrayList<Transaction> checkout = new ArrayList<Transaction>();
		
		
		checkout.add(new Rental(new ChildrensMovie("Citizen Kane", true), 5));
		checkout.add(new Rental(new RegularMovie("Airbud", false), 2));
		checkout.add(new Rental(new RegularMovie("STRIPES", false), 3));
		
		
		testCustomer.addCheckout(checkout);
		
		ArrayList<Transaction> checkout2 = new ArrayList<Transaction>();
		
		
		checkout2.add(new Rental(new VideoGame("Dwarf Fortress"), 3));
		checkout2.add(new Sale(new ChildrensMovie("Flubber", 5.00, false )));
		checkout2.add(new Sale(new VideoGame("Kingdom Hearts", 19.99)));
		
		testCustomer.addCheckout(checkout2);
		
		System.out.print(testCustomer.statement());
		
		
	}
}
