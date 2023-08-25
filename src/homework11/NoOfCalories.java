package homework11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import java.util.Scanner;

public class NoOfCalories {

	public static void DenumireLegume() throws IOException {
		try {
		OutputStream outputstream = new FileOutputStream("legume.properties");
		Properties propFile =new Properties();
		propFile.setProperty("morcov", "58");
		propFile.setProperty("cartof", "95");
		propFile.setProperty("castravete", "20");
		propFile.setProperty("dovlecel", "48");
		propFile.setProperty("ardei", "38");
		propFile.store(outputstream, "Salvat fisier");
		outputstream.close();
				
	}catch (IOException e){
		e.printStackTrace();
	}
}

public static void citesteCalorii(String leguma) throws IOException {
		
		try{
			FileInputStream inputStream = new FileInputStream("legume.properties");
			Properties prop = new Properties();
			prop.load(inputStream);
			String cal = prop.getProperty(leguma.toLowerCase());
			
			if (cal !=null) {
				System.out.println("Leguma aleasa de tine are " + cal + " calorii");
			}else {
				System.out.println("Nu vindem aceasta leguma");
				}
			inputStream.close();
			}catch( IOException e) {
			System.out.println("Eroare citire din fisier");
			}
	}

	public static void main(String[] args) throws IOException {
		
		DenumireLegume();
		
		Scanner scan  = new Scanner(System.in);
		while (true) {
			System.out.println("Ce leguma doriti?");
			String leguma = scan.next();
					
			citesteCalorii(leguma);
			
			System.out.println("Alegeti alta leguma? (Y/N)");
			String continu = scan.next();
			
				if(continu.equalsIgnoreCase("Y")) 
				{continue;
				  }else{
					System.out.println("La revedere!");
					break;
				  }	
			}
		scan.close();
		}
	
}
