package task1724;

public class TagDerOffenenTuer {
	
	private String[] teilnehmer;
	private int anzahl;
	
	public TagDerOffenenTuer(int t) {
		super();
		
		this.teilnehmer = new String[t];
		//this.anzahl = anzahl;
	}

	//public TagDerOffenenTuer(int t) {
		
	//}
	public int a = 0;
	
	public void fuegePersonenHinzu(int anzahl, int art) {
		
		
		for (int i = a; i < anzahl; i++) {
			
			if (art == 0) {
				
				teilnehmer[i] = new Besucher().identifizierePerson();
				
			} else if (art == 1) {
				teilnehmer[i] = new Dozent().identifizierePerson();
			}
			
			this.anzahl++;
			
			a++;
		}
		
		
	}
	
	public String Stringify(int lal) {
		
		
		
		return 	teilnehmer[lal];	
	}

	public int getAnzahl() {
		return anzahl;
	}
	
}
