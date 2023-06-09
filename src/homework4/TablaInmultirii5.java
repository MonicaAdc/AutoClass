package homework4;

import java.util.Scanner;

public class TablaInmultirii5 {

	public static void main(String[] args) {
		int nr;
		
		System.out.println("Please enter a number :");
		Scanner scan  =  new Scanner(System.in);
		int x =scan.nextInt();
		
		for(int nr1 = 1; nr1<=10; nr1++) {
			System.out.println( x+ " * " + nr1 + " = "+ nr1*x);
			
	}

	}
}
