package inheritance;

public class Main {

	public static void main(String[] args) {

		IndividualCustomer rmzn = new IndividualCustomer();
		rmzn.customerNumber = "12345";

		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "67890";

		SendikaCustomer sendika1 = new SendikaCustomer();
		sendika1.customerNumber = "99999";

		CustomerManager customerManager = new CustomerManager();

		Customer[] customers = { rmzn, hepsiBurada, sendika1 };
		
		customerManager.addMultiple(customers);
	}

}
