package object;

public class Launcher {
	
	public static void main(String[] args) {
		
		Rectangle r1 = new DefaultRectangle(3, 2);
		Rectangle r2 = new DefaultRectangle(2, 3);
		Rectangle r3 = new DefaultRectangle(3, 3);
		
		System.out.println("Is r1 a square? " + r1.isSquare());
		System.out.println("Is r2 a square? " + r2.isSquare());
		System.out.println("Is r3 a square? " + r3.isSquare());
		
		System.out.println("Comparison of r1 with r2: " + Rectangle.compare(r1, r2));
		System.out.println("Comparison of r1 with r3: " + Rectangle.compare(r1, r3));
		
		
	}
}
