package structure;

public class Launcher {
	
	
	public static void main(String[] args) {
		
		int jahr = 2016;
		boolean schaltjahr = false;
		
		if (args.length == 1) {
			
			jahr = Integer.parseInt(args[1]);		
		}
		
		if (jahr % 4 == 0) {
			
			if (jahr % 100 == 0) {
				
				if (jahr % 400 == 0) {
					
					schaltjahr = true;
				} else {
					schaltjahr = false;
				}
			} else {
				schaltjahr = true;
			}
			
		} else {
			schaltjahr = false;
		}
		
		System.out.println("Schaltjahr? " + schaltjahr);
	}
	
	
}
