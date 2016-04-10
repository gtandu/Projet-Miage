package modele;

public class Enseignant extends Compte{
	
	private boolean admin;
	
	// TODO Liste de Groupe ?
	
	public Enseignant(String nom, String prenom, String login, String mdp) {
		super(nom, prenom, login, mdp);
		this.admin = true;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	
	public Groupe creerGroupe()
	{
		Groupe groupe = new Groupe();
		groupe.ajouterEnseignement(this);
		this.listeGroupes.add(groupe);
		return groupe;
	}
	
	public boolean affecterEtudiantGroupe(Etudiant etudiant, Groupe groupe)
	{
		if(this.listeGroupes.contains(groupe))
		{
			return groupe.ajouterEtudiant(etudiant);
		}
		return false;
		
	}
	
	public boolean retirerEtudiantGroupe(Etudiant etudiant, Groupe groupe)
	{
		if(this.listeGroupes.contains(groupe))
		{
			return groupe.supprimerEtudiant(etudiant);
		}
		return false;
		
	}
	
	
	

}
