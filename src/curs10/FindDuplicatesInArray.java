package curs10;

import java.util.Set;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
	 
		//vrem sa aflam daca in interiorul array-ului sunt nume duplicate si sa le printam
		//for in for se mai numeste si algoritm de buble sort
		
		String[] myStringArray = {"Oana","Ion","Bogdan","Ion","Maria","Oana" };
		//index					//	0		1		2		3	 4		5
		//lenght=6
		
		for(int i=0; i< myStringArray.length; i++) {
			for(int j=i+1; j< myStringArray.length; j++) {
				if(myStringArray[i].equals(myStringArray[j])) {
					System.out.println("Nume duplicat: "+ myStringArray[i]);
				}
			}
		System.out.println("------------------------");	
		
		
	

	}
	}
}

