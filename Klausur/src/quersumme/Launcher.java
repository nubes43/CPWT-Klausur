package quersumme;

public class Launcher {
	
	
	static int berechneQuersumme(int z) {
		
		int summe = 0;
		
		while (z != 0) {
			
			summe += z % 10;
			
			z = z / 10;
		}
		
		return summe;
	}
	
	public static void main(String[] args) {
		
		System.out.println(berechneQuersumme(12345));
	}
}
