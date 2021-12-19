package task1721;

public class Launcher {
	

	
	public static void main(String[] args) {
		
		int n = 18844;
		int t = 2;
		
		while (n > 1) {
			
			if (n % t == 0) {
				
				n = n / t;
				
				System.out.println(n + " " + t);
			} else {
				t = t + 1;
			}
			
		}
	}
	
}
