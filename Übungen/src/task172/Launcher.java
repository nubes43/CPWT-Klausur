package task172;

public class Launcher {
	
	public static void main(String[] args) {
		
		int zeile = 5;
		int spalte = 1;
		
		for (int i = 0; i < zeile; i++) {
			
			for (int j = 0; j < spalte; j++) {
				
				System.out.print("*");
				
				
			}
			spalte++;
			System.out.println();
		}
	}
}
