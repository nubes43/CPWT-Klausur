package wochentage;

import java.util.Iterator;

public class Launcher {
	
	public static void main(String[] args) {
		
	boolean loop = true;
	int[] a = new int[10];
	
	
	
	
	for (int i = 0; i < a.length; i++) {
		
		int c = i * 100 + 100;
		a[i] = c;

	}
	

	for (int b : a) {
		
		System.out.print(a[b/100-1] + " ");

	}
	
	System.out.println();
	
	String[] wochentag = { "Mo","Di", "Mi", "Do", "Fr", "Sa", "So" };
	
	int j = 0;
	while (loop == true) 
		
	 {
		
		System.out.print(wochentag[j] + " ");
		
		if (j < wochentag.length-1) {
		j++;
		} else {
			loop = false;
		}
	}
	
	}
	
	
}
