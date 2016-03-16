package modele;

import java.util.List;

public class Etudiant extends Compte {
	
	private List<Projet> listeProjets;

	public List<Projet> getListeProjets() {
		return listeProjets;
	}

	public void setListeProjets(List<Projet> listeProjets) {
		this.listeProjets = listeProjets;
	}

}
