package homework5;

public class FibonacciWhileEx2 {

	public static void main(String[] args) {
	int nr1=0;
	int nr2=1;
	int count=9;
	System.out.println("Seria Fibonacci pentru 9 numere este: " + nr1 + " " + nr2);
	
	  int i=1;
      while(i<=count)
      {
          System.out.print(nr1 + " ");
          int sumOfPrevTwo = nr1 + nr2;
          nr1 = nr2;
          nr2 = sumOfPrevTwo;
          i++;
	}
	
	}

}
