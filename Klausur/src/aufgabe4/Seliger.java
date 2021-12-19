package aufgabe4;

public class Seliger extends Mensch{
	
	private boolean maertyrer;
	

	public Seliger(String name, boolean maertyrer) {
		super(name);
		this.maertyrer = maertyrer;
		
	}

	@Override
	public String toString() {
		return super.toString()+ " Maertyrer: " + maertyrer;
	}
	
	
}
