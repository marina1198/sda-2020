package ro.unitbv.mostenire;

public class main {

	public static void main(String[] args) {
		Adress address = new Adress("Ploiesti, ", "Domnisori, ", 11);
		PaymentMethod pm = new PaymentMethod("card");
		Customer customer = new Customer(address, pm);
		Customer c1 = new Customer("Marina", "Coman ", 22);
		System.out.println(c1.getCompleteName());
		System.out.println(customer.getAdress().getFullAdress());
		System.out.println(customer.getMethod().getType());

	}

}
