package homework10;
	/* “Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam consectetur odio ac quam commodo, eu 
	eleifend felis imperdiet. Integer bibendum nunc quis sem faucibus,
	vitae laoreet mi dignissim. Praesent eget ligula nec lorem varius
	malesuada. Nulla neque lacus, euismod quis erat nec, convallis
	vestibulum augue. Nullam et aliquet justo. Aliquam erat volutpat.
	Nulla elementum urna in dolor viverra, in efficitur lectus mattis.”
 * 
 *1 -> de cate ori apare cuvantul “Nulla” in acest string si va printa numarul
 *2 -> va imparti stringul in cate propozitii cuprinde si le va printa fiecare pe randul ei in consola
 *3 -> va folosi metoda deleteCharAt() din StringBuilder pentru a sterge toate aparitiile literei ‘a’
 *4 -> va folosi clasa StringBuilder pentru a inlocui toate aparitiile literei ‘o’ cu caracterul ‘#’
 */
public class PatruMetodeStringsEx1 {


		static String textSource ="Lorem ipsum dolor sit amet, consectetur adipiscing elit Aliquam consectetur odio ac quam commodo, eu eleifend felis imperdiet. Integer bibendum nunc quis sem faucibus, vitae laoreet mi dignissim. Praesent eget ligula nec lorem variusmalesuada. Nulla neque lacus, euismod quis erat nec, convallis vestibulum augue. Nullam et aliquet justo. Aliquam erat volutpat. Nulla elementum urna in dolor viverra, in efficitur lectus mattis.";
		static String word = "Nulla";
		
		public static void main(String[] args) {
			try {
				wordCount(textSource, word);
				System.out.println("------------");
				printSentences(textSource);
				System.out.println("------------");
				deleteChar(textSource,'a');
				System.out.println("------------");
				replaceChar(textSource,'o','#');
				System.out.println("------------");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		
	//Metoda1: verifica de catre ori apare cuvantul “Nulla” in acest string si va printa numarul:
		public static void wordCount(String textSource, String word ){
			
			int count=0 , index= 0;
			while ((index = textSource.indexOf(word, index)) != -1 ){
	            count++;
	            index++;
	        }
	        System.out.println("Total occurrences of " + word + ": " + count);
	    }
		
		//Metoda2: va imparti stringul in cate propozitii cuprinde si le va printa fiecare pe randul ei in consola
	   public static void printSentences(String textSource ){
			
		   StringBuilder sb = new StringBuilder(textSource);
		   for (int i = 0; i < textSource.length(); i++) {
			   char c = textSource.charAt(i);
			   if   (c == '.') { sb.setCharAt(i, '/');  }
			   } 
		   String[] lines = sb.toString().split("/"); 
		  	   
		   for(String s: lines){
		       System.out.println(s +".");
		   }    
	   	}
	   
	   //Metoda3:  va folosi metoda deleteCharAt() din StringBuilder pentru a sterge toate aparitiile literei ‘a’
	   public static void deleteChar(String textSource, char c ){
	   StringBuilder sb = new StringBuilder(textSource);
	   int length =textSource.length();
		   for (int i = 0; i< length-1 ; i++) {
			     char ch = sb.charAt(i);
			     if   (ch == c) {
			       sb.deleteCharAt(i);
			       length--;
			     }
		   }
	   
	   System.out.println(sb);
	   }
	   //4. A patra metoda va folosi clasa StringBuilder pentru a inlocui toate aparitiile literei ‘o’ cu caracterul ‘#’
	   public static void replaceChar(String textSource, char c1, char c2 ){
		   StringBuilder sb = new StringBuilder(textSource);
		   int length =textSource.length();
			   for (int i = 0; i< length-1 ; i++) {
				     char c = sb.charAt(i);
				     if   (c == c1) {
				       sb.setCharAt(i,c2);
				       
				     }
			   }
		   
		   System.out.println(sb);
		   }
	   
}
