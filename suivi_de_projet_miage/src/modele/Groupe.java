package modele;

import java.util.List;

public class Groupe {
	
	
	private Long id;
	
	private List<Compte> listeComptes;
	
	private List<Projet> listeProjets;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Compte> getListeCompte() {
		return listeComptes;
	}
	public void setListeCompte(List<Compte> listeCompte) {
		this.listeComptes = listeCompte;
	}
	public List<Projet> getListeProjet() {
		return listeProjets;
	}
	public void setListeProjet(List<Projet> listeProjet) {
		this.listeProjets = listeProjet;
	}
	
	

}
