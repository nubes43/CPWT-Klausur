package task174;

public interface IntegerList {
	
	 int getLength(); // Liefert die Länge der Liste.
	 void insertLast(int value); // Fügt value am Ende der Liste ein.
	 int getFirst(); // Liefert das erste Element der Liste.
	 void deleteFirst(); // Löscht das erste Element der Liste.
	 boolean search(int value); // Prüft, ob value in der Liste vorhanden ist.

}
