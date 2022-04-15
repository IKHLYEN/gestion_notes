package gestion_notes;

import aiac.gi18.java.complexe.Complexe;

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
	public boolean equals(Object obj) {
		if (! (obj instanceof Etudiant) ){
			return false;
		}
	return	((Etudiant)obj).id==this.id ;
	}

}
