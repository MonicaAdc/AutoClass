package homework9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		Account acc = new Account();
		BankApp bank =  new BankApp();
		bank.printeazaOperatiuni();
		
		String continu;	
		while (true) {
		System.out.println("Please enter the desired operation:");
			try {
				Scanner scan  = new Scanner(System.in);
				int action = scan.nextInt();
				
					if (action == 1) {
						System.out.println("Please enter the amount for deposit:");
						try {
						    int amount = scan.nextInt();
						 	try {
								acc.deposit(amount);
								
							} catch (InvalidAmountException e) {
								System.out.println(e.getMessage());
							}
							acc.printBalance();
						}catch(InputMismatchException e) {
							System.out.println("Please enter only numeric!");
						}
					}else if (action == 2) {
						System.out.println("Please enter the pozitive amount to Withdraw:");
						try {
						    int amount = scan.nextInt();
						    if (amount>=0) {
							try {
								acc.withdraw(amount);
								
							} catch (InsufficientFundsException e) {
								System.out.println(e.getMessage());
							}
							acc.printBalance();
						    }else {
						    	System.out.println("You can not withdraw negative amount!");
						    }
							
						}catch(InputMismatchException e) {
							System.out.println("Please enter only numeric!");
						}
						
					}else if (action == 3) {
						acc.printBalance();
					}else {
						System.out.println("Operatiune invalida");
						bank.printeazaOperatiuni();
					}
						
				}catch(InputMismatchException e) {
					System.out.println("Please enter only numeric option: 1, 2 or 3");
					 
				} 
			
				
			Scanner scanc  = new Scanner(System.in);
			System.out.println("Do you want to continue?(Y/N)");
				continu = scanc.next();
				if(continu.equalsIgnoreCase("y"))
				{
				    continue;
				}else  {
					System.out.println("Thank you!");
					break;
				}
					
			}
		
	}
	
	
	public void printeazaOperatiuni() {
		System.out.println("Hi, Available operations are:");
		System.out.println("1  Deposit");
		System.out.println("2  Withdraw");
		System.out.println("3  Check Balance");

	}

}
