package homework4;

import java.util.Scanner;

public class TernaryOperator3 {

	public static void main(String[] args) {
		int x;
		
	    Scanner scan = new Scanner(System.in);
		System.out.println("Care este punctajul obtinut?");
		x = scan.nextInt();

		String calificativ = (x>=90) ? "FB" : ((x >= 80) ? "B" : "S");
		System.out.println("Ai primit : FoarteBine");
		
		System.out.println("Ai primit :Bine");
		
		System.out.println("Ai primit : Suficient");
		
	}

}
