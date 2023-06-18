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
				if (vanzari <=500) {
					System.out.println("Bonusul este 600");
				}
				else if (vanzari<= 10000)
				{
					if (luna <= 6)
					{System.out.println("Bonusul este 800");
					}
					else if (luna <= 11)
					{System.out.println("Bonusul este 1000");
					}
					else if (luna == 12)
					{System.out.println(" In decembrie se vand singure!Bonusul este 900");
					}
				}
				else if (vanzari > 10000) {
					System.out.println("Bonusul este 1200");
				}
				break;
		default:
		System.out.println("Nu se ofera niciun bonus");
					
	}

	}
}
