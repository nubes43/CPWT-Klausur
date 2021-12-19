package task174;

public interface IntegerList {
	
	 int getLength(); // Liefert die L�nge der Liste.
	 void insertLast(int value); // F�gt value am Ende der Liste ein.
	 int getFirst(); // Liefert das erste Element der Liste.
	 void deleteFirst(); // L�scht das erste Element der Liste.
	 boolean search(int value); // Pr�ft, ob value in der Liste vorhanden ist.

}
