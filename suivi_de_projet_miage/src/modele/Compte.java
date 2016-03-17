package modele;

import java.util.List;

public abstract class Compte {

	protected int id;

	protected List<Groupe> listeGroupes;

	protected String nom;

	protected String prenom;

	protected String login;

	protected String mdp;
	
	public static int  ID = 0;
	
	public Compte(String nom, String prenom, String login, String mdp)
	{
		this.id = ++ID;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.mdp = mdp;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Groupe> getListeGroupes() {
		return listeGroupes;
	}

	public void setListeGroupes(List<Groupe> listeGroupes) {
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
	
	public String toString()
	{
		return "Id: "+this.id+
				"\nNom: "+this.nom+
				"\nPrenom: "+this.prenom+
				"\nLogin: "+this.login+
				"\nMdp: "+this.mdp+
				"\n"+this.listeGroupes.toString();
	}

}
