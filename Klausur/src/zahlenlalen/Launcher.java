package zahlenlalen;

public class Launcher {
	
	
	public static void main(String[] args) {
		
		Double arg = new Double(0.0);
		
		
		if (args.length == 1) {
			
			arg = Double.parseDouble(args[0]);
			
			
		}
		
		double d1 = arg.doubleValue();
		
		double d2 = 0.5;
		
		double sum = d1 + d2;
		
		Double d = new Double(sum);
		
		System.out.println(d.toString());
		
		int a = 106;
		
		System.out.println(a);
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toOctalString(a));
		System.out.println(Integer.toHexString(a).toUpperCase());
		
		
		
		
		
	}
	
	
}
