package curs6;

import java.util.Arrays;

public class ForEachExemple {

	public static void main(String[] args) {
	
		String[] orase  = {"Iasi", "Cluj", "Brasov", "Pitesti", "Ploiesti"};
		//System.out.println(orase[1]);
		//daca vreau sa parsez tot array-ul meu, fac un for:
		
		for(int i=0; i<orase.length; i++) {
			System.out.println(orase [i]);
		}
		System.out.println("----------");
		
		for (String element: orase) {
			System.out.println(element);
		}
		System.out.println("----------");
		
		System.out.println(orase);
		//daca vreau sa printez asa [Iasi, Cluj, Brasov, Pitesti, Ploiesti]
		System.out.println(Arrays.toString(orase));
	}

}
