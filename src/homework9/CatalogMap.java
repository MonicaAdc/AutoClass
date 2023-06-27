package homework9;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class CatalogMap {

	public static void main(String[] args) {
		Map<String, Integer> cat = new HashMap();
	
		try {
		Scanner scan = new Scanner(System.in);
		String adaug="y";
		do {
		System.out.println("Care este numele?");
		String nume = scan.next();
		try {
		System.out.println("Care este nota?");
		int nota = scan.nextInt();
		
		if (cat.get(nume) == null ) {
			cat.put(nume, nota);
			System.out.println("Nu aveai nota, ti-am trecut acum!");
		}else if(cat.get(nume)<nota){
			//cat.put(nume, nota);
			cat.replace(nume,nota);
			System.out.println("Am updatat nota!");
		}else {
			System.out.println("Nu ai nevoie de alta nota!");
		}
		
		System.out.println("Continuati?y/n");
		adaug = scan.next();
		
		}catch(InputMismatchException e) {
			System.out.println("Please enter only numeric!");
			continue;
		}
		}while (adaug.equals("y"));
		scan.close();
		
		System.out.println("Numar total de elevi: " + cat.size());
		System.out.println(cat);
	}catch(Exception e) {
		System.out.println("General Exception!" );
		
	}
 }
}