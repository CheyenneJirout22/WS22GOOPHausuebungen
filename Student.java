package uebung;

public class Student {
	// Zustand: Klassendiagramm (Attribute) -> Instanzvariablen
	// Sichtbarkeit von Instanzvariablen sind: 
	// 'private' (UML '-', package (kein Modifier) (UML '~'), public (UML '+'), protected (UML '#')
	private String vorname;
	private String nachname;
	private String gebdatum;
	private final String matrNr; // UML {readOnly}
	private double gewicht;
	
	// Konstruktor: Wird bei der Erstellung des Objekts mittels new-Operator aufgerufen
	// 1. Konstruktor hat keinen Return-Datentyp
	// 2. Konstruktor muss analog zur Klasse heissen	
	public Student(String vornameInp, String nachnameInp, String gebdatumInp, String matrNrInp, double gewichtInp) {
		// Merkregel: Jede Instanzvariable IMMER im Konstruktor mit einem gueltigen Wert belegen
		this.vorname = vornameInp;
		this.nachname = nachnameInp;
		this.gebdatum = gebdatumInp; 
		this.matrNr = matrNrInp; 
		this.gewicht = gewichtInp;
	}
	//Constructor Chaining
	public Student() {
		this("Max", "Muster", "01.01.2000","175839",70);
	}
	public Student(String vornameInp) {
		this(vornameInp, "Muster", "01.01.2000","0283493", 70);
	}
	
	// Verhalten (Nachrichten): Veränderung des Objekts während der Laufzeit durch Methoden (Nachrichten) an das Objekt
	public void essen(double naehrwert) {
		this.gewicht += naehrwert;
	}
	
	//Getter / Setter
	//get -Methode (Accessoren)
	public String getVorname() {
		return this.vorname;
	}
	
	//set -Methode (Mutatoren) Parameter mit Inp
	public void setVorname(String vornameInp) {
		// Gueltigkeitspruefungen: Wir pruefen auf Fehler
		if(vornameInp == null || vornameInp.trim().isEmpty()) return;	//Da Fehler beenden wir die Methode
		this.vorname = vornameInp.trim();
	}
	
	// "Zustandsausgabe" via toString-Methode
	public String toString() {
		return "[" +
			this.vorname + ", " +
			this.nachname + ", " +
			this.gebdatum + ", " + 
			this.matrNr + ", " + 
			this.gewicht + 
			"]";
	}
	
}
