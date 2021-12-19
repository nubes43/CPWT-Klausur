package array;

public class Launcher {
	
	public static void main(String[] args) {
		
		String a = "Hello World ";
		
		if (args.length == 1) {
			
			a = args[0];
		}
		
		String input = a.toLowerCase();
		
		
		
		print(input);
		
	
	}
	
	static void print(String input) {
		
		//char start = 'a';
		char c = '\0';
		int index = -1;
		
		//char[] ausgabe  = a.toCharArray();
		
		for (int i = 0; i < Alphabet.letters[0].length; i++) {
			
			//c = a.charAt(i);
			
			for (int j = 0; j < input.length(); j++) {
				
				c = input.charAt(j);
				
				index = c - 'a';
				
				if (index <= 25 && index >= 0) {
						
						System.out.print(Alphabet.letters[index][i] + " ");
					
				}
				if (input.charAt(j) == ' ') {
					
					System.out.print("    ");
				}
			}
			System.out.println();
		}
	}
	
}
