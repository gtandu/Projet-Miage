package modele;

import java.util.ArrayList;
import java.util.List;

public class Groupe {

	private List<Enseignant> listeEnseignants;

	private List<Etudiant> listeEtudiants;

	private List<Projet> listeProjets;

	public Groupe() {

		this.listeEnseignants = new ArrayList<Enseignant>();
		this.listeEtudiants = new ArrayList<Etudiant>();
		this.listeProjets = new ArrayList<Projet>();

	}

	public List<Enseignant> getListeEnseignants() {
		return listeEnseignants;
	}

	public void setListeEnseignants(List<Enseignant> listeEnseignants) {
		this.listeEnseignants = listeEnseignants;
	}

	public List<Etudiant> getListeEtudiants() {
		return listeEtudiants;
	}

	public void setListeEtudiants(List<Etudiant> listeEtudiants) {
		this.listeEtudiants = listeEtudiants;
	}

	public List<Projet> getListeProjets() {
		return listeProjets;
	}

	public void setListeProjets(List<Projet> listeProjets) {
		this.listeProjets = listeProjets;
	}

}
