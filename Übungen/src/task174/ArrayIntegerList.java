package task174;

public class ArrayIntegerList implements IntegerList {
	
	private int[] array;
	private int length;
	
	
	
	public int[] getArray() {
		return array;
	}

	public void setArray(int array, int id) {
		this.array[id] = array;
	}

	public ArrayIntegerList(int length) {
		super();
		this.array[length] = array[length];
	}
	
	public int getLength(){
		
		
		return length;
	}
	
	public void insertLast(int value) {
		
		array[length-1] = value;
	}
	
	public int getFirst() {
		
		return array[0];
	}
	
	public void deleteFirst() {
		
		array[0] = 0;
	}
	
	public boolean search(int value) {
		
		int a = 0;
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] == value) {
				
				a++;
			}
		}
		if (a!=0) {
			return true;
		} else {
			return false;
		}
		
	}

	
		
	
	
}
