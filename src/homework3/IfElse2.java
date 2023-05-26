package homework3;

import java.util.Scanner;

public class IfElse2 {
	int a;

	
	public void askTheScore() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Introdu scorul tau: ");
		a=scan.nextInt();
		scan.close();
	}
	public void CompareTheScore() {
		if(a<65)
		System.out.println("Ai picat.Mai incearca!");
		else if (a>=66)
		System.out.println("Felicitari! Ai trecut!");
	}

}
