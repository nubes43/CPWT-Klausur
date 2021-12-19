package task1723;

public class Beleg {
	
	int nummer = 0;

	public int getNummer() {
		return nummer;
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
	}
	
	int zaehler = 10000;

	public Beleg() {
		super();
		this.nummer = zaehler + 1;
		zaehler++;
		
	}
	
	
}
