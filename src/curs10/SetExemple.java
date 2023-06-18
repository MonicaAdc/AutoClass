package curs10;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExemple {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		//unul ne zice ce contine si altul marimea :metode
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		// ca sa populam set-ul avem metoda de add. In interiorul ei putem pune stringuri
		//set-ul nu permite dupicate

		set.add("mov");
		set.add("alb");
		set.add("rosu");
		set.add("galben");
		System.out.println("-------------------------");
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		
		for (String element: set) {
			System.out.println(element);
		}
		 System.out.println("------------------");
		 
		 Iterator<String> iterator = set.iterator();
		 while(iterator.hasNext()) {
			 System.out.println(iterator.next());
		 }
			 set.remove("galben");
			for(String element:set) {
				System.out.println(element);
		}
			//set-ul returneaza True sau False: are metode predefinite
			//set-ul primeste un singur data type si este o structura de date neordonata
			System.out.println(set.contains("-----------"));
			System.out.println(set.contains("negru"));
			 System.out.println(set.contains("rosu"));
		 }
	}

