package structure3;

public class Launcher {
	
	
	public static void main(String[] args) {
		
		int p = 98;
		int q = 49;
		
		if (args.length == 2) {
			
			p = Integer.parseInt(args[0]);
			q = Integer.parseInt(args[1]);
		}
		
		if (p < q) {
			
			int x = p; 
			p = q;
			q = x;
		} 
			
			while (q != 0) {
				
				int r = p % q;
				
				p = q;
				q = r;
				
			}
			
		
			
					
		
		System.out.println(p);
			
	}
}
