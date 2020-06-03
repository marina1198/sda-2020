package Tema5_problema1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problema1 {

	public static void main(String[] args) {

		
		int[] sir =  { 12, 25, 47, 58, 47, 7, 96, 14, 3, 9 };

		System.out.println(Arrays.toString(sir));
		Scanner scanner = new Scanner(System.in);

		System.out.println("Alegeti pozitia numarului:");
		int p = scanner.nextInt();
		while (p < 0 || p > sir.length) {
			System.out.println("Pozitia este incorecta. ");
			System.out.println("Alegeti pozitia numarului:");
			p = scanner.nextInt();
		}
		System.out.println("Pozitia este corecta.");

		ArrayList<String> sirNou = new ArrayList<String>();
		String nul1 = "null";

		int n = sir.length - 1;
		
		if (p <= n) {
			for (int i = p; i < n; i++) {
				sir[i] = sir[i + 1];

			}
			sir[n] = 0;
			
			System.out.println(java.util.Arrays.toString(sir));
		} else
			System.out.println("Numarul introdus este prea mare");

	}
}
