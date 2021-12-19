package task1725;

public class Launcher {
	
	
	
	public static void add(Wrapper w, int i) throws TestException {
		
		if (i < 10) {
			
			int value = w.value + i;
			System.out.println(value);
			
		} else throw new TestException("Fehler");
	}
	
	public static void main(String[] args) {
		
		Wrapper w = new Wrapper();
		
		try {
			add(w, 8);
		} catch (TestException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		
		try {
			add(w, 11);
		} catch (TestException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	}
	
}
