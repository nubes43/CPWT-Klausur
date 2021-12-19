package ampel;

public class Ampelfarbe {
	
	String text;

	private Ampelfarbe(String text) {
		super();
		this.text = text;
	}
	

	final Ampelfarbe ROT = new Ampelfarbe("Anhalten");
	final Ampelfarbe GELB = new Ampelfarbe("Achtung");
	final Ampelfarbe GRÜN = new Ampelfarbe("Weiterfahren");
	
	
}
