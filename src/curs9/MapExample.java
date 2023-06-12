package curs9;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		//System.out.println(map.size()); - iti spune dimensiunea si cea cu empty imi va spune daca e empty sau nu structura mea
		
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
		//metoda care iti permite sa introduci anumite valori de date
		
		map.put(1, "negru");
		map.put(33, "alb");
		map.put(88, "verde");
		
	//printeaza map-ul sub forma unui string:	
		System.out.println(map);
		
	//printare pe baza cheii:	
		System.out.println(map.get(88));
		System.out.println("---------");	
	
		//iterare prin toate cheile pe care le are structura mea:	
	for (Integer key: map.keySet()) {
		System.out.println(key);
		System.out.println("---------");	
		
		
		//iterare prin toate valorile pe care le are structura mea:	
		for (String value: map.values()) {
			System.out.println(value);
			System.out.println("---------");	
		
		//daca vreau sa verific o anumita valoare/cheie:	
			System.out.println("Key " + map.containsKey(22));
			System.out.println("Key " + map.containsValue("alb"));
			
		//daca vrem sa stergem/replace o anumita valoare:
			map.replace(1,"rosu");
			System.out.println(map);
			
		//remove
			//map.remove(1);
			//System.out.println(map);
			
	}
		
		
	}

	}
}
