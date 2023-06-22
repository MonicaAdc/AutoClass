package homework7;

import java.util.Arrays;
import java.util.Scanner;

public class InverseazaArrayEx1 {

	public static void main(String[] args) {
			
			int[] nArray = readArray();
			printReverseArrayFor(nArray);
			System.out.println();
			printReverseArrayWhile(nArray);
			}
	
		public static int[] readArray(){
			Scanner scan = new Scanner (System.in);
			System.out.println("Cate elemente trebuie sa aiba array-ul?");
			
			int n = scan.nextInt();
			int[] xArray =new int[n];
			for (int i = 0 ; i < n; i++ ){
				System.out.println("Introdu elementul " + (i+1) + ":");
				xArray[i] = scan.nextInt();
			}	
			scan.close();
			return xArray;
		}
		public static void printReverseArrayFor(int[] yArray) {
			
			for (int i = yArray.length-1 ; i >= 0 ; i-- ){
				System.out.print(yArray[i] + " ");
			}
		}
		
		public static void printReverseArrayWhile(int[] yArray) {
			int i = yArray.length-1;
			while ( i >= 0  ){
				System.out.print(yArray[i] + " ");
				i--;
			}
		}
	
		

	}


