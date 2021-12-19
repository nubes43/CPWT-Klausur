package mitarbeiter;

public class Gehaltsabrechnung {
	
	private static final int MITARBEITER_ANZAHL = 4;
	private static Mitarbeiter[] mitarbeiter;
	private static double bruttosumme;

	
	public static void main(String[] args) {
		
		Gehaltsabrechnung.mitarbeiter  = new Mitarbeiter[Gehaltsabrechnung.MITARBEITER_ANZAHL];
		
		Gehaltsabrechnung.mitarbeiter[0] = new Arbeiter();
		Gehaltsabrechnung.mitarbeiter[1] = new Arbeiter();
		Gehaltsabrechnung.mitarbeiter[2] = new Angestellter();
		Gehaltsabrechnung.mitarbeiter[3] = new Manager();

		Gehaltsabrechnung.mitarbeiter[0].name = "Otto";
		Gehaltsabrechnung.mitarbeiter[1].name = "Sven";
		Gehaltsabrechnung.mitarbeiter[2].name = "Wilhelm";
		Gehaltsabrechnung.mitarbeiter[3].name = "Jens";
		
		((Arbeiter) Gehaltsabrechnung.mitarbeiter[0]).stundenlohn = 20;
		((Arbeiter) Gehaltsabrechnung.mitarbeiter[0]).stundenanzahl = 200;
		((Arbeiter) Gehaltsabrechnung.mitarbeiter[0]).schichtzulage = 30;
		((Arbeiter) Gehaltsabrechnung.mitarbeiter[0]).personalnummer = 567;
		
		for (int i = 0; i < MITARBEITER_ANZAHL; i++) {
			
			
			bruttosumme = Gehaltsabrechnung.mitarbeiter[i].berechneMonatsBrutto();
			System.out.println(bruttosumme);
		}
	}
}


abstract class Mitarbeiter extends Gehaltsabrechnung {
	
	int personalnummer;
	String name;
	
	public Mitarbeiter() {
		
		
	}
	
	abstract public double berechneMonatsBrutto();
	
	
}

class Arbeiter extends Mitarbeiter {
	
	double stundenlohn;
	double stundenanzahl;
	double schichtzulage;
	
	public double berechneMonatsBrutto() {
		
		return this.stundenlohn * this.stundenanzahl + this.schichtzulage;
		
	}
	
}

class Angestellter  extends Mitarbeiter {
	
	double grundgehalt;
	double ortszuschlag;
	double zulage;
	
	public double berechneMonatsBrutto() {
		
		return this.grundgehalt + this.ortszuschlag + this.zulage;
	}
	
}

class Manager extends Mitarbeiter {
	
	double fixgehalt;
	double provision;
	double umsatz;
	
	public double berechneMonatsBrutto() {
		
		return this.fixgehalt + this.umsatz * this.provision;
	}
	
}


