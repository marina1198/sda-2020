package Tema6_QuickSort;

public class QuickSort {

	int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = (low - 1);
		for (int j = low; j < high; j++) {
			// Daca elementul curent este mai mic decat pivotul
			if (arr[j] < pivot) {
				i++;

				// schimba arr[i] cu arr[j]
				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// schimba arr[i+1] cu arr[high]
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	void sort(int arr[], int low, int high) {
		if (low < high) {

			int pi = partition(arr, low, high);
			// sortare dupa partitie si inainte de partitie
			sort(arr, low, pi - 1);
			sort(arr, pi + 1, high);
		}
	}

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String args[]) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };
		int n = arr.length;
		System.out.println("Sirul dat este:");
		printArray(arr);

		QuickSort ob = new QuickSort();
		ob.sort(arr, 0, n - 1);

		System.out.println("\nSirul sortat este:");
		printArray(arr);
	}
}
