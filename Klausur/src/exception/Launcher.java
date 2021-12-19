package exception;

import java.util.Random;

public class Launcher {
	
	final static int MAX = 500;
	
	static int getRandomNumber() throws Exception {
		
		//Random rnd = new Random(100);
		double rnd2 = Math.random();
		
		
		int yea = (int) Math.round(100*rnd2);
		
		if (yea == 0) {
			
			throw new Exception("fuck");
		}
		else {
		return yea;
		}
	}
	
	public static void main(String[] args) {
		
		for (int i = 0; i < MAX; i++) {
			
			
			try {
				System.out.println(getRandomNumber());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
			}
		}
	
	}
}
