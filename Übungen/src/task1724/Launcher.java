package task1724;

public class Launcher {
	
	public static void main(String[] args) {
		
		TagDerOffenenTuer tag = new TagDerOffenenTuer(100);
		
		tag.fuegePersonenHinzu(5, 1);
		tag.fuegePersonenHinzu(20, 0);
		
		
		for (int j = 0; j < tag.getAnzahl(); j++) {
			
		
			System.out.println(tag.Stringify(j));
		}
	}
	
}
