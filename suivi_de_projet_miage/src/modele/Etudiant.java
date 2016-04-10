package modele;

import java.util.HashSet;

public class Etudiant extends Compte {
	
	private HashSet<Projet> listeProjets;
	
	public Etudiant(String nom, String prenom, String login, String mdp) {
		super(nom, prenom, login, mdp);
		this.listeProjets = new HashSet<Projet>();
	}

	public HashSet<Projet> getListeProjets() {
		return listeProjets;
	}

	public void setListeProjets(HashSet<Projet> listeProjets) {
		this.listeProjets = listeProjets;
	}
	

}
