package curs10;

import java.util.List;
import java.util.ArrayList;

public class ArrayListExemple {

	public static void main(String[] args) {
	//lista este o colectie ordonata de elemente.Ea are inclusiv index prin care poate fi apelata
	
		
		List<String> list = new ArrayList<>();
		
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		
		list.add("Oana");
		list.add("Ion");
		list.add("Maria");
		list.add("Gabriel");
		for (String nume: list) {
			System.out.println(nume);
		}
		
		System.out.println("-------------------");
		
		//printarea in functie de index:
		System.out.println(list.get(2));
		
		System.out.println("-------------------");
		
		//daca vreau sa adaug ceva specific la un anumit index
		
		list.add(0, "Carmen");
		for (String nume: list) {
			System.out.println(list.indexOf(nume)+ ":" + nume);
		}
		
		System.out.println("------------------------");

		list.add(1, "Maria");
		System.out.println(list.size());
		
		for(String nume : list) {
			System.out.println(list.indexOf(nume) + " : " + nume);
		}
		System.out.println("------------------------");

		System.out.println(list.get(4));
		
		list.add(6, "Vasile");
		
		System.out.println("------------------------");
		for(String nume : list) {
			System.out.println(list.indexOf(nume) + " : " + nume);
		}
		
		
		list.remove(0);
		list.remove("Maria");
		
		System.out.println("------------------------");
		for(String nume : list) {
			System.out.println(list.indexOf(nume) + " : " + nume);
		}
		
		
		list.clear();
		System.out.println(list.size());
		
		
		
		
	}

}