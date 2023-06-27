package homework8;
/*
 * Clasa Customer – cu 3 variabile
   Clasa Account – cu 3 variabile si metoda public void withdraw(){if() else sysoutInsufficientFundsException
   Clasa InsuficientFundsException  - clasa de exceptie custom. Extinde
   Exception si seteaza in constructor mesajul “Insuficient funds for transaction”
   Clasa SavingsAccount care mosteneste Account
 */
public class Account {

	private int accountNumber;
	public double balance;
	//1 variabila publica de tip Customer pe nume ‘accountOwner’
	public Customer accountOwner;
	
	public Account(int accountNumber, double balance, Customer accountOwner) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountOwner = accountOwner;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Customer getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(Customer accountOwner) {
		this.accountOwner = accountOwner;
	}

	public void withdraw(double amount) throws InsuficientFundsException {
				if (balance-amount < 0) {
				throw new InsuficientFundsException("Insuficient funds for transaction!");
			}
	}
}