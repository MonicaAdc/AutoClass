package homework8;

import java.util.Scanner;

public class SavingsAccount extends Account{
	
	public SavingsAccount(int accountNumber, double balance, Customer accountOwner) {
		super(accountNumber, balance, accountOwner);
		
	}

	@Override
	public void withdraw(double amount) throws InsuficientFundsException {
			if (balance-amount < 0) {
				throw new InsuficientFundsException("Insuficient funds for transaction!");
			}else {
				balance = balance-amount;
				System.out.println("Please pick your money!");
				System.out.println("Your new balance is: " + balance);
			
			}		
	}
}