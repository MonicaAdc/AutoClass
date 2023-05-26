package curs6;

public class ArrayExemple {

	public static void main(String[] args) {
	
		String [] textArray= new String[5];
// in mom asta in memorie, s-a creat un array cu 5 valori de null
// daca vreau sa le accesez, le accesez pe baza indexului: 0,1,2,3,4 -> 5 elemente cu index de la 0->4
		
		System.out.println(textArray[1]);
		textArray[1]="Maria";
		System.out.println(textArray[1]);
		System.out.println(textArray[3]);
		textArray[3]="Oana";
		System.out.println(textArray[3]);
		
		
		
		System.out.println("----------------");
		
		System.out.println(textArray[4]);
	}

}
