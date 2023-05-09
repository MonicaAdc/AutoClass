package curs2;

import java.util.Scanner;

public class IfElseExemple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String username = "Test";
		int password = 1234;
		
		Scanner scan = new Scanner(System.in);	
		System.out.println("Te rog introdu username: ");
		//16 si 17 sunt ca sa mi permita login cu tester cu litera mica;
		String inputUsername = scan.next();
		inputUsername = inputUsername.substring(0,1).toUpperCase() + inputUsername.substring(1).toLowerCase();
		System.out.println("Te rog introdu password: ");
		int inputPassword = scan.nextInt();	

		
//string-urile se verifica cu metroda equals si nu cu == pt ca in Java in mom executiei sunt duse in string pool(zona de memorie), si aici Java optimizeaza per obiect memoria
// restul data types ve verifica cu == (int, etc)
// && este un operator -- AND
// 
//boolean - true sau false
		if(username.equals(inputUsername)&& password == inputPassword) {
		
			
			System.out.println("Login successfull");
			
		}else {
			System.out.println("username or password is wrong");
		}
	}
		


}
