package homework6;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu un anul de vechime in firma: ");
		int an =scan.nextInt();
		System.out.println("Te rog introdu valoarea vanzarilor efectuate: ");
		int vanzari =scan.nextInt();
		System.out.println("Te rog introdu luna in care s-au efectuat vanzarile: ");
		int luna =scan.nextInt();
		
		int bonus;
	 
	switch(an) {
		case 1:
				System.out.println("Bonusul este 100");
			break;
		case 2:
				System.out.println("Bonusul este 200");
			break;
		case 3:
			if (vanzari <=500)
				System.out.println("Bonusul este 600");
		
			else {	
			if (vanzari<= 100000 && luna<=6 )
				System.out.println("Bonusul este 800");
		
			if(vanzari<=100000 && luna<=7 && luna<=11 )
				System.out.println("Bonusul este 1000");
			
			
			if(vanzari<=100000 && luna==12 )
				System.out.println(" In decembrie se vand singure!Bonusul este 900");
			 

			if (vanzari > 100000)
				System.out.println("Bonusul este 1200");
			}
			break;
			
			default:
				if(an>3);
				System.out.println("Nu se ofera niciun bonus");
					
	}

	}
}
