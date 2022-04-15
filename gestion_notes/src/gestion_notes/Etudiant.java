package gestion_notes;

public class Etudiant {
	private int id;
	private String nom;
	private double note;
	public Etudiant(int i, String n) {
		this.note=10;
		nom=n;
		id=i;
		
	}
	@Override
	public String toString() {
		return this.nom+ ":"+this.note;
	} 
}
