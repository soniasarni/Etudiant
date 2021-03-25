package gestionEtudiant;

public class Etudiant {
String nom,prenom;

int codeId;

public Etudiant(String nom, String prenom, int codeId) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.codeId = codeId;
}

@Override
public String toString() {
	return "Etudiant " + nom + ", " + prenom + " "+ codeId +"" ;
}
public void travailler() {
	System.out.println("etudiant "+nom+""+prenom+" travaille");
}
public void serepose() {
	System.out.println("etudiant "+nom+""+prenom+" se repose");
}

}
