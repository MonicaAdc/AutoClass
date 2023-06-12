package homework4;

import java.util.Scanner;

public class TernaryOperatorEx1 {

	public static void main(String[] args) {

		double x;
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog sa intoduci valoarea facturii :");
		x = scan.nextInt();
		
	
		x = (x > 100) ? 0.9 * x : 0.95 * x;
		
		System.out.println("Noua valoare este:" + x );
		
	}

}
