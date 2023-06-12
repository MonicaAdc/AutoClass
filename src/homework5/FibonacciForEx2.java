package homework5;

public class FibonacciForEx2 {
	public static void main(String args[])  {
			
	int nr1=0;
	int nr2=1;
	int count=9; 
	System.out.println("Seria Fibonacci pentru 9 numere este: " + nr1 + " " + nr2 );
		   
		for(int i=2;i<count;++i)
		 {    
			int nextnr=nr1+nr2;    
			 System.out.println(nextnr);    
			 nr1=nr2;   
			 nr2=nextnr;    
		 }    
												}
		}