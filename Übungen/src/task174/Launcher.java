package task174;

public class Launcher {

	public static void main(String[] args) {
		
		ArrayIntegerList ail = new ArrayIntegerList(100);
		
		ail.setArray(5,0);
		ail.setArray(4,1);
		ail.setArray(3,2);
		ail.setArray(8,3);
		
		System.out.println(ail.getLength());
	}
}
