package object;

public class DefaultRectangle extends Rectangle {
	
	private int width;
	private int height;
	
	public DefaultRectangle(int w, int h) {
		super();
		
		width = w;
		height = h;
	}

	@Override
	public int getWidth() {
		
		return this.width;
	}

	@Override
	public int getHeight() {
		
		
		return this.height;
	}
}
