package modele;

public class Langage {

	private String nom;

	public static long ID = 0;

	public Langage(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
