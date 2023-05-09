package curs2;

public class Rectangle {
//variabile	
	private int lenght;
	private int weight;
	
//constructor	
	public Rectangle(int lenght, int weight) {
		this.lenght = lenght;
		this.weight = weight;
	}
//metoda
	public int calculateArea() {
		return lenght*weight;
	}
	
	
}
