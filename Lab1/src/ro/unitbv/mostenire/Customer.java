package ro.unitbv.mostenire;

public class Customer {

	private String lastName ;
	private String firstName ;
	private int age ;
	private Adress adress ;
	private PaymentMethod method ;
	public String getLastName() {
		return lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public int getAge() {
		return age;
	}
	public Adress getAdress() {
		return adress;
	}
	public PaymentMethod getMethod() {
		return method;
	}
	public Customer(String lastName, String firstName, int age) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		
	}

	public Customer(Adress adress, PaymentMethod method) {
		this.adress = adress;
		this.method = method;
	}
	public String getCompleteName()
	{
		return firstName+lastName;
	}
}
