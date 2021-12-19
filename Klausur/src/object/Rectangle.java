package object;

public abstract class Rectangle {
	
	public abstract int getWidth();
	public abstract int getHeight();
	
	public boolean isSquare() {
		
		if (getHeight() == getWidth()) {
			
			return true;
		}
		
		return false;
		
	}
	
	public static int compare(Rectangle a, Rectangle b) {
		
		int x = a.getHeight() * a.getWidth();
		int y = b.getHeight() * b.getWidth();
		
		
		if (x < y) {
			return -1;
		} else if (x > y) {
			return +1;
		} else {
			return 0;
		}
	}
	
	
}
