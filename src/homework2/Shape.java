package homework2;

public class Shape {
	
	//constructor
	public Shape (int length)
	{
		int area = calculateSquareArea(length);
		System.out.println("The area of the square is:"+ area);
	}
	
	public Shape (int length, int width)
	{
		int area = calculateRectangleArea(length, width);
		System.out.println("The area of the rectangle is:"+ area);
	}
	
	public Shape (double radius)
	{
		double area =radius*radius*Math.PI;
		System.out.println("The area of the circle is:"+ area);
	}
	
//metoda
	public int calculateSquareArea(int length) {
		return length*length;
	}

	public int calculateRectangleArea(int length, int width) {
		return length*width;
}

}
