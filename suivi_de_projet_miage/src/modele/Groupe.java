package modele;

import java.util.HashSet;
import java.util.Iterator;

public class Groupe {

	private String nom;

	private HashSet<Enseignant> listeEnseignants;

	private HashSet<Etudiant> listeEtudiants;

	private HashSet<Projet> listeProjets;

	public Groupe(String nom) {
		this.nom = nom;
		this.listeEnseignants = new HashSet<Enseignant>();
		this.listeEtudiants = new HashSet<Etudiant>();
		this.listeProjets = new HashSet<Projet>();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public HashSet<Enseignant> getListeEnseignants() {
		return listeEnseignants;
	}

	public void setListeEnseignants(HashSet<Enseignant> listeEnseignants) {
		this.listeEnseignants = listeEnseignants;
	}

	public HashSet<Etudiant> getListeEtudiants() {
		return listeEtudiants;
	}

	public void setListeEtudiants(HashSet<Etudiant> listeEtudiants) {
		this.listeEtudiants = listeEtudiants;
	}

	public HashSet<Projet> getListeProjets() {
		return listeProjets;
	}

	public void setListeProjets(HashSet<Projet> listeProjets) {
		this.listeProjets = listeProjets;
	}

	@SuppressWarnings("static-access")
	public Projet getProjetByIdentifiant(int idProjet) {

		for (Projet p : this.listeProjets) {
			if (p.IDENTIFIANT == idProjet) {
				return p;
			}
		}

		return null;
	}

	public boolean ajouterEnseignement(Enseignant enseignant) {
		return this.listeEnseignants.add(enseignant);
	}

	public boolean supprimerEnseignement(Enseignant enseignant) {
		return this.listeEnseignants.remove(enseignant);
	}

	public boolean ajouterEtudiant(Etudiant etudiant) {
		return this.listeEtudiants.add(etudiant);
	}

	public boolean supprimerEtudiant(Etudiant etudiant) {
		return this.listeEtudiants.remove(etudiant);
	}

	public boolean ajouterProjet(Projet projet) {
		Projet newProjet = new Projet(projet);
		return this.listeProjets.add(newProjet);
	}

	public boolean retirerProjet(Projet projet) {
		return this.listeProjets.remove(projet);
	}

	public boolean equals(Groupe groupe) {
		return this.nom.equals(groupe.getNom());
	}

	public int hashCode() {
		return this.nom.hashCode();
	}

	public String afficherCompoEtudiants() {
		String listeEtudiants = "";
		Iterator<Etudiant> it = this.listeEtudiants.iterator();
		while (it.hasNext()) {
			listeEtudiants += it.next().toString() + "\n----------------\n";
		}

		return "Listes des etudiants : \n" + listeEtudiants;
	}

	public String toString() {

		return this.nom;
	}

}
