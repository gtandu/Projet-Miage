package modele;


public class Langage {
	

	private Long id;
	
	private String nom;
	
	public static long  ID = 0;
	
	public Langage(Long id, String nom) {
		
		this.id = ++ID;
		this.nom = nom;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

}
