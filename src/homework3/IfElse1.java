package homework3;

import java.util.Scanner;

public class IfElse1 {
	int a=18;
	int b=65;
	int number1;

	public void askAge() {
		Scanner scan  =  new Scanner(System.in);
		System.out.println("Please enter your age :");
		number1 = scan.nextInt();
		scan.close();
	}

	public void compareTheAge() {
	
		if(number1 < a ) {
			System.out.println("”Esti minor”!");
		}else if(number1 >= a && number1 <b) {
			System.out.println("Esti Adult!");
		}else {
			System.out.println("Esti batran!");
		}
		
}
	
}