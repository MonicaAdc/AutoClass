package homework5;

import java.util.Scanner;

public class DoWhileEx1 {
	
	public static void main(String[] args) {
	
		String username = "TestUser";
		int password = 1234;
		int tries = 0;
				
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a user :");
			String inputUsername = scan.next();
			System.out.println("Enter a password :");
			int inputPassword = scan.nextInt();
					
			if ( inputUsername.equals("TestUser") && ( inputPassword == 1234 )) {
				System.out.println("login sucessful"); 
				break;
			} else {
				System.out.println("Login Error");
				tries++;
				
				if (tries == 3)
				{
					System.out.println("Maximum attempts reached. User blocked");
				}
			}
		} while( tries < 3 );
	}		
}
