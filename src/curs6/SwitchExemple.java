package curs6;
import java.util.Scanner;

public class SwitchExemple {

	public static void main(String[] args) {
		Scanner Scan= new Scanner(System.in);
		System.out.println("Te rog introdu un calificativ");
		String calificativ = new String();

		
		switch(calificativ) {
			case "A":
				System.out.println("Felicitari!");
				break;
			case "B":
				System.out.println("Destul de bine!");
				break;
			case "C":
				System.out.println("Suficient!");
				break;
			case "D":
				System.out.println("Insuficient!");
				break;
			default:
				System.out.println("Calificativ invalid!");
			
		}
	}

}
