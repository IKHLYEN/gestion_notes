package gestion_notes;

public class Main {

	public static void main(String[] args) {
		Etudiant e1 = new Etudiant(1,"hamid");
		Etudiant e2 = new Etudiant(2,"driss");
		Etudiant e3= new Etudiant(3,"youssef");
		e1.note=15;
		e2.note=12;
		e3.note=16;
		ListEtudiants mesEtudiants=new ListEtudiants();
		mesEtudiants.add(e3);
		mesEtudiants.add(e2);
		mesEtudiants.add(e1);
		System.out.println(mesEtudiants);
		e1.filtrer(13);
	}

}
