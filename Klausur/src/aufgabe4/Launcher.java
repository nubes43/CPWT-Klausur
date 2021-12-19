package aufgabe4;

public class Launcher {
	
	public static void main(String[] args) {
		
		Mensch[] menschen;
		
		menschen = new Mensch[3];
		
		menschen[0] = new Mensch("Domenic Ilius");
		menschen[1] = new Seliger("Madara Uchiha", false);
		menschen[2] = new Heiliger("Naruto Uzumaki", true, "08.12.2021");
		
		for (Mensch mensch : menschen) {
			
	
			System.out.println(mensch);
		}
	}
}
