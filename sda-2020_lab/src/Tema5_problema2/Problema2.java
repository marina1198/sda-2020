package Tema5_problema2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problema2 {

	public static void main(String[] args) {

		int[] sir = { 12, 25, 47, 58, 47, 7, 96, 14, 3, 9 };
		
		System.out.println(Arrays.toString(sir));
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Alegeti pozitia :");
		int p = scanner.nextInt();
		
		System.out.println("Introduceti numarul :");
		int numar = scanner.nextInt();

		int[] sirNou = new int[11];

		for (int i = 0; i < sir.length; i++) {
			sirNou[i] = sir[i];

		}

		int n = sirNou.length;
		if (p <= n) {
			for (int i = n - 2; i >= p; i--)

				sirNou[i + 1] = sirNou[i];
			sirNou[p] = numar;

			System.out.println(java.util.Arrays.toString(sirNou));
		} else
			System.out.println("Pozitia introdusa depaseste pozitia maxima din sir");
	}


}