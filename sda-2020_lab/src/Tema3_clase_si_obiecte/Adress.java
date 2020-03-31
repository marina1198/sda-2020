package Tema3_clase_si_obiecte;

public class Adress {

	private String street;
	private String city;
	private int number;

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public int getNumber() {
		return number;
	}

	public Adress(String street, String city, int number) {
		super();
		this.street = street;
		this.city = city;
		this.number = number;
	}

	public String getFullAdress() {

		return city + street + number;
	}

}
