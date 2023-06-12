package homework4;

import java.util.Scanner;

public class IntreabaNumereEx4 {

	public static void main(String[] args) {
		int i;
		int nr;
		int sum=0;
		

		for (i=1; i<=10; i++) {
			System.out.println("Please enter a number :");
			Scanner scan  =  new Scanner(System.in);
			nr =scan.nextInt();
			sum=sum+nr;
		}

		System.out.println("The sum of the numbers is "+ sum);

	}
}
