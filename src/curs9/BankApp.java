package curs9;

import java.util.Scanner;

/*
 * Simulam un ATM
 * Informam userul operatiunile disponibile sub forma :
 * 1 Deposit
 * 2 Withdraw
 * 3 CheckBalance
 * 
 * Il intrebam ce operatiune vrea sa faca (1 , 2 sau 3)
 * si procesam operatiunea: 
 * (Deposit inseamna balanta + suma depusa)
 * (Withdraw inseamna balanta - suma retrasa)
 * (Check balance - print balanta)
 * Daca incearca sa depuna mai putin sau egal cu 0 aruncam InvalidAmountEception
 * Daca incearca sa retraga mai mult decat balanta aruncam InsuficentFundsException
 * Daca introduce alta operatriune printam operatiune invalida
 * La finalul fiecarei operatiuni il intreabam daca vrea sa continue
 * Plecam cu balanta 0
 */



public class BankApp {

	public static void main(String[] args) {
		ATM atm =  new ATM();
		BankApp bank =  new BankApp();
		bank.printeazaOperatiuni();
		Scanner scan  = new Scanner(System.in);
		System.out.println("Please enter the desired operation:");
		int action = scan.nextInt();
		
	}
	
	
	public void printeazaOperatiuni() {
		System.out.println("Hi, Available operations are:");
		System.out.println("1  Deposit");
		System.out.println("2  Withdraw");
		System.out.println("3  Check Balance");

	}

}