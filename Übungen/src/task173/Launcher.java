package task173;

public class Launcher {
	
	static double round(double zahl, int kommastelle) {
		
		double yea = Math.pow(10, kommastelle);
		
		double hey = Math.round(yea*zahl) / yea;
		
		
		return (double) hey;
	}
	
	static float round(float zahl, int kommastelle) {
		
		double yea = Math.pow(10, kommastelle);
		
		double hey = Math.round(yea*zahl) / yea;
		
		
		return (float) hey;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(round(1234.56789, 0));
		
		System.out.println(round(123.456789f, 2));
		
		
	}
	
}
