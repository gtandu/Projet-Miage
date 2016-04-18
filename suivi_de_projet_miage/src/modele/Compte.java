package modele;

import java.util.HashSet;
import java.util.Iterator;

public abstract class Compte {

	protected HashSet<Groupe> listeGroupes;

	protected String nom;

	protected String prenom;

	protected String login;

	protected String mdp;
	
	
	public Compte(String nom, String prenom, String login, String mdp)
	{
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.mdp = mdp;
		this.listeGroupes = new HashSet<>();
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
	
	public boolean ajouterGroupe(Groupe groupe)
	{
		return this.listeGroupes.add(groupe);
	}
	
	public boolean retirerGroupe(Groupe groupe)
	{
		return this.listeGroupes.remove(groupe);
	}
	
	public boolean equals(Compte compte)
	{
		return this.nom.equals(compte.getNom()) && this.prenom.equals(compte.getPrenom());
	}
	
	public int hashCode()
	{
		return this.nom.hashCode()+this.prenom.hashCode();
	}
	
	public String afficherCompoGroupe()
	{
		String listeGroupe = "";
		Iterator<Groupe> it = this.listeGroupes.iterator();
		while (it.hasNext()) 
		{
			listeGroupe += "- "+it.next().toString()+"\n";
		}
		
		return "\nListes des groupes : \n"+listeGroupe;
	}
	
	public String toString()
	{
		return "Nom: "+this.nom+
				"\nPrenom: "+this.prenom+
				"\nLogin: "+this.login;
				
	}

}
