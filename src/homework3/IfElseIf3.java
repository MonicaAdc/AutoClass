package homework3;

import java.util.Scanner;

public class IfElseIf3 {

	int number1;

	public void askNumber() {
		Scanner scan  =  new Scanner(System.in);
		System.out.println("Te rog sa introduci un numar :");
		number1 = scan.nextInt();
		scan.close();
}	
	public void returnDay(){
		if(number1 ==1) {
		System.out.println("Astazi este Luni");
	}
		else if(number1==2){
		System.out.println("Astazi este Marti");	
	}
		else if(number1==3){
			System.out.println("Astazi este Miercuri");	
		}
		else if(number1==4){
			System.out.println("Astazi este Joi");	
		}
		else if(number1==5){
			System.out.println("Astazi este Vineri");	
		}
		else if(number1==6){
			System.out.println("Astazi este Sambata");	
		}
		else if(number1==7){
			System.out.println("Astazi este Duminica");	
		}
		else {
			System.out.println("Saptamana are doar 7 zile te rog sa introduci un numar valid");	
		}
								
}
	}

