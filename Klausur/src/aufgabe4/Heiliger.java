package aufgabe4;

public class Heiliger extends Seliger{
	
	private String gedenkTag;

	public Heiliger(String name, boolean maertyrer, String gedenkTag) {
		super(name, maertyrer);
		this.gedenkTag = gedenkTag;
		//super.name = name
	}

	@Override
	public String toString() {
		return super.toString() + " Gedenktag: " + gedenkTag;
	}
	
	
	
}
