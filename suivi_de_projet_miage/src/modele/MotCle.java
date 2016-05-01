package modele;

public class MotCle {

	private String nom;

	public MotCle(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public boolean equals(MotCle motcle)
	{
		return this.nom.equals(motcle.getNom());
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
