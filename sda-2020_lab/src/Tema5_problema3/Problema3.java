package Tema5_problema3;

import java.util.ArrayList;
import java.util.Scanner;

public class Problema3 {

	public static void main(String[] args) {

		int[] sir = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int x = 7;
		cautareBinara(sir, x);

	}

	public static boolean cautareBinara(int array[], int x) {

		int stanga = 0;
		int dreapta = array.length - 1;

		while (stanga <= dreapta) {
			int mid = (dreapta + stanga) / 2;

			if (array[mid] == x) {
				System.out.println("Valoarea cautata este la indexul " + mid + ".");
				break;
			}

			else if (array[mid] < x) {
				stanga = mid + 1;
			} else if (array[mid] > x) {
				dreapta = mid - 1;
			}
		}

		if (stanga > dreapta) {
			System.out.println("Nu exista valoarea cautata");
		}
		return false;

	}

}
