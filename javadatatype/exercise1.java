package ro.unitbv.javadatatype;
import java.util.Scanner;


public class exercise1 {



	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

	
		System.out.println("Introdu nr 1: ");
		int nr1 = scanner.nextInt();
		
		System.out.println("Introdu nr 2: ");
		int nr2 = scanner.nextInt();

		int suma= nr1+nr2;
		System.out.println("Suma: " + suma);
		
		int diferenta=nr1-nr2;
		System.out.println("Diferenta:" + diferenta);

		double impartire = (double) nr1 / nr2;
		System.out.println("Impartire " + impartire);
		
		int produs= nr1*nr2;
		System.out.println("Produs " +  produs);
		
		int medie= (nr1+nr2)/2;
		System.out.println("Media: " + medie);
		
		
		System.out.println("Maximul este:" + Math.max(nr1,  nr2));
		System.out.println("Minimul este:" + Math.min(nr1, nr2));
		
		
		
	}
}