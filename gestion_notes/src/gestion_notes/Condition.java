package gestion_notes;

public interface Condition {
public boolean estVrai(Etudiant e);
public List<Etudiant> filtrer(Condition c)
{
	return Etudiant.c;
}
}
