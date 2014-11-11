package Runtime;
import java.util.ArrayList;

import Products.*;
import Transactions.*;

public class MovieRental {

	public static void main(String[] args) {
		
		Customer testCustomer = new Customer("Regular Customer", 13);
		Customer youngCustomer = new Customer("College Customer", 19);
		Customer categoryCustomer = new Customer("Eclectic Customer", 24);
		
		ArrayList<Transaction> checkout = new ArrayList<Transaction>();
		
		
		checkout.add(new Rental(new ChildrensMovie("Citizen Kane", true), 5));
		checkout.add(new Rental(new RegularMovie("Airbud", false), 2));
		checkout.add(new Rental(new RegularMovie("STRIPES", false), 3));
		
		
		testCustomer.addCheckout(checkout);
		
		ArrayList<Transaction> checkout2 = new ArrayList<Transaction>();
		
		
		checkout2.add(new Rental(new VideoGame("Dwarf Fortress"), 3));
		checkout2.add(new Sale(new ChildrensMovie("Flubber", 5.00, false )));
		checkout2.add(new Sale(new VideoGame("Kingdom Hearts", 19.99)));
		
		categoryCustomer.addCheckout(checkout2);
		
		
		System.out.println(testCustomer.statement());
		
		ArrayList<Transaction> checkout3 = new ArrayList<Transaction>();
		
		checkout3.add(new Rental(new VideoGame("Call of Duty 69"), 5));
		checkout3.add(new Rental(new CD("Ben Folds"), 5));
		
		youngCustomer.addCheckout(checkout3);
		
		System.out.println("\n" + youngCustomer.statement());
		System.out.println("\n" + categoryCustomer.statement());
		
	}
}
