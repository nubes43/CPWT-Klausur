package task1723;

public class Launcher {
	

	
	public static void main(String[] args) {
		
		Beleg bill1 = new Beleg();
		Beleg bill2 = new Beleg();
		Beleg bill3 = new Beleg();
		
		bill3.setNummer(5);
		
		System.out.println(bill1.getNummer());
		System.out.println(bill2.getNummer());
		System.out.println(bill3.getNummer());
	}
	
}
