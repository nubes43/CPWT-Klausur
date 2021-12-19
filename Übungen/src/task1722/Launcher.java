package task1722;

public class Launcher {
	
	
	public static void main(String[] args) {
		
		String a = args[0];
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
	
		
		if (b > 0 && b < c && c < a.length()) {
			
			String text = a.substring(b, c);
			
			StringBuilder sb = new StringBuilder();
			
			sb.append(text);
			sb.append(".png");
			
			System.out.println(sb);
		}
	}
}
