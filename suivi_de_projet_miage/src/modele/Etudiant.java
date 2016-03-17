package modele;

import java.util.ArrayList;
import java.util.List;

public class Etudiant extends Compte {
	
	private List<Projet> listeProjets;
	
	public Etudiant(String nom, String prenom, String login, String mdp) {
		super(nom, prenom, login, mdp);
		this.listeProjets = new ArrayList<Projet>();
	}

	public List<Projet> getListeProjets() {
		return listeProjets;
	}

	public void setListeProjets(List<Projet> listeProjets) {
		this.listeProjets = listeProjets;
	}

}
