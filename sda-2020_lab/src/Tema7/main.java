package Tema7;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class main {
	
	public static void main(String[] args) {
		double[] notematematica;
		notematematica = new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		double[] noteromana = new double[] { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };
		// Create a HashMap object called catalog
		studenti elev1 = new studenti("Coman", "Marina", noteromana[0], notematematica[9]);
		studenti elev2 = new studenti("Soare", "Anda", noteromana[1], notematematica[8]);
		studenti elev3 = new studenti("Brasov", "Ovidiu", noteromana[2], notematematica[7]);
		studenti elev4 = new studenti("Petrescu", "Andrei", noteromana[3], notematematica[6]);
		studenti elev5 = new studenti("Deacu", "Andrei", noteromana[4], notematematica[5]);
		studenti elev6 = new studenti("Vladislav", "Vlaicu", noteromana[5], notematematica[4]);
		studenti elev7 = new studenti("Draghia", "Vladimir", noteromana[6], notematematica[3]);
		studenti elev8 = new studenti("Liviu", "Andrei", noteromana[7], notematematica[2]);
		studenti elev9 = new studenti("Shelby", "Thomas", noteromana[8], notematematica[1]);
		studenti elev10 = new studenti("Coman", "Daiana", noteromana[9], notematematica[0]);

		HashMap<String, studenti> catalog = new HashMap<String, studenti>();

		// Add keys and values (CNP,Name)
		catalog.put("1", elev1);
		catalog.put("2", elev2);
		catalog.put("3", elev3);
		catalog.put("4", elev4);
		catalog.put("5", elev5);
		catalog.put("6", elev6);
		catalog.put("7", elev7);
		catalog.put("8", elev8);
		catalog.put("9", elev9);
		catalog.put("10", elev10);
		 System.out.println(catalog);
		System.out.println(catalog.get("15"));
		 for(String getkey:catalog.keySet())
		 {
		 System.out.println(getkey);
		 }
		System.out.println("\n" + "LinkedHashMap" + "\n");

		LinkedHashMap<String, studenti> catalog1 = new LinkedHashMap<String, studenti>();
		catalog1.put("11", elev1);
		catalog1.put("12", elev2);
		catalog1.put("13", elev3);
		catalog1.put("14", elev4);
		catalog1.put("15", elev5);
		catalog1.put("16", elev6);
		catalog1.put("17", elev7);
		catalog1.put("18", elev8);
		catalog1.put("19", elev9);
		catalog1.put("20", elev10);
		 for(String getkeys:catalog1.keySet())
		 {
		 System.out.println(getkeys);
		}
		System.out.println(catalog1.get("18"));
	}

}
