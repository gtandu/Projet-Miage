package modele;

import java.util.List;

public class Groupe {

	private Long id;

	private List<Enseignant> listeEnseignants;

	private List<Etudiant> listeEtudiants;

	private List<Projet> listeProjets;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
