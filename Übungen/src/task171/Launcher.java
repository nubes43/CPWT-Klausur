package task171;

public class Launcher {
	
	public static void main(String[] args) {
		
		int days = 31;
		int hours = 24;
		int minutes = 60;
		int seconds = 60;
		
		int product = days * hours * minutes * seconds;
		
		System.out.println(product + " Sekunden");
	}
}
