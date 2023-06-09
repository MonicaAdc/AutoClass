package curs9;

public class GenericsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printDetails(123, true);
		
	}

	//T este o referinta catre un obiect generic
	
		public static <T> void printDetails (T obj, T obj1) {
			System.out.println("Data type pentru obiect" + obj + "este" + obj.getClass().getName());
			System.out.println("Data type pentru obiect" + obj1 + "este" + obj1.getClass().getName());
		
}
}