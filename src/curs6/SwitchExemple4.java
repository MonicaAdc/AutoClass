package curs6;

import java.util.Scanner;

public class SwitchExemple4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu anul: ");
		int an =scan.nextInt();
		
		System.out.println("Te rog introdu punctajul: ");
		int punctaj =scan.nextInt();

		
		switch(an) {
		case 3:
			switch (punctaj) {
			case 80:
			System.out.println("Esti eligibil pentru bursa 1 ");
			break;
			
			case 50:
			System.out.println("Esti eligibil pentru bursa 2 ");
			break;
		default:
			System.out.println("Nu esti eligibil pentru bursa");
			
		}
			break;
			default:
				System.out.println("Nu esti eligibil pentru bursa");
			
		}
	}

}
