package modele;




public class MotCle {
	
	private Long id;
	
	private Projet projet;
	
	private String nom;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Projet getProjetID() {
		return projet;
	}
	public void setProjetID(Projet projet) {
		this.projet = projet;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	

}
