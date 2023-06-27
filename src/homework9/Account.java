package homework9;

public class Account {
	
	public int balance = 0;
	
	public void deposit(int amount) throws InvalidAmountException {
		
		if(amount <= 0) {
		  throw new InvalidAmountException("Your amount " +amount + " is not valid!Should be > 0");
		}
		balance = balance + amount;
	}
	
	public void withdraw(int amount) throws InsufficientFundsException {
		
		if(balance < amount) {
		  throw new InsufficientFundsException( "Insufficient Funds");
		}
		balance = balance - amount;
	}
	
	public void printBalance() {
			
			System.out.println("Your Actual Balance: " + balance);
		}
}