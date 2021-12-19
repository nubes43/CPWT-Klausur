package aufgabe4;

public class Mensch {
	
	private String name;
	
	public Mensch(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Name: "+  name;
	}


}
