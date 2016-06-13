package modele;

public class Langage {

	private String nom;

	public Langage(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	public boolean equals(Langage langage)
	{
		return this.nom.equals(langage.getNom());
	}
	
	public int hashCode()
	{
		return this.nom.hashCode();
	}
	
	public String toString()
	{
		return this.nom;
				
				
	}
}
