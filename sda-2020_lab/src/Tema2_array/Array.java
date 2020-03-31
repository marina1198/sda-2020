package Tema2_array;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		double temperaturi[] = { 36.7, 38.0, 36, 37.8, 36.8, 35.9, 39 };

		ArrayList<Double> temperaturi_normale = new ArrayList<Double>();
		ArrayList<Double> temperaturi_anormale = new ArrayList<Double>();

		System.out.println("Index     Temperatura");
		for (int i = 0; i < temperaturi.length; i++)

		{
			if (temperaturi[i] < 37.0) {
				temperaturi_normale.add(temperaturi[i]);

				System.out.println("index " + i + " -temperatura normala: " + temperaturi[i]);

			} else {
				temperaturi_anormale.add(temperaturi[i]);

				System.out.println("index " + i + " -temperatura anormala: " + temperaturi[i]);

			}

		}

		System.out.println("\n" + "Temperaturi normale : " + temperaturi_normale);
		System.out.println("Temperaturi anormale : " + temperaturi_anormale);

	}

}
