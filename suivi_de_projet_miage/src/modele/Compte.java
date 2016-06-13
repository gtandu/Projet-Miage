package modele;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public abstract class Compte {

	protected String nom;

	protected String prenom;

	protected String login;

	protected String mdp;
	
	protected HashSet<Groupe> listeGroupes;

	protected ArrayList<Projet> listeProjets;
	

	public Compte(String nom, String prenom, String login, String mdp)
	{
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.mdp = mdp;
		this.listeGroupes = new HashSet<>();
		this.listeProjets = new ArrayList<Projet>();
		
	}

	public HashSet<Groupe> getListeGroupes() {
		return listeGroupes;
	}

	public void setListeGroupes(HashSet<Groupe> listeGroupes) {
		this.listeGroupes = listeGroupes;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	

	public ArrayList<Projet> getListeProjets() {
		return listeProjets;
	}

	public void setListeProjets(ArrayList<Projet> listeProjets) {
		this.listeProjets = listeProjets;
	}

	public boolean ajouterGroupe(Groupe groupe) {
		return this.listeGroupes.add(groupe);
	}

	public boolean retirerGroupe(Groupe groupe) {
		return this.listeGroupes.remove(groupe);
	}
	
	
	public boolean equals(Compte compte) {
		return this.nom.equals(compte.getNom()) && this.prenom.equals(compte.getPrenom());
	}

	public int hashCode() {
		return this.nom.hashCode() + this.prenom.hashCode();
	}

	public String afficherCompoGroupe() {
		String listeGroupe = "";
		Iterator<Groupe> it = this.listeGroupes.iterator();
		while (it.hasNext()) {
			listeGroupe += "- " + it.next().toString() + "\n";
		}

		return "\nListes des groupes de "+this.nom+" : \n" + listeGroupe;
	}

	public String toString() {
		return "Nom: " + this.nom + "\nPrenom: " + this.prenom + "\nLogin: " + this.login;

	}

}
