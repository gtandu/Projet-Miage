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
	
	public Projet creerProjet(String nom, String description, String filiere)
	{
		Projet projet = new Projet(nom, description, filiere);
		
		return projet;
	}
	
	public Groupe creerGroupe(String nom)
	{
		Groupe groupe = new Groupe(nom);
		groupe.ajouterEnseignement(this);
		this.listeGroupes.add(groupe);
		return groupe;
	}
	
	public Jalon creerJalon(String nom, Projet projet)
	{
		Jalon jalon = new Jalon(nom, projet);
		return jalon;
	}
	
	public Langage creerLangageDeProgrammation(String nom)
	{
		Langage langage = new Langage(nom);
		
		return langage;
	}
	
	public MotCle creerMotCle(String nom)
	{
		MotCle motCle = new MotCle(nom);
		
		return motCle;
	}
	
	public boolean affecterEtudiantGroupe(Etudiant etudiant, Groupe groupe)
	{
		if(this.listeGroupes.contains(groupe))
		{
			etudiant.ajouterGroupe(groupe);
			return groupe.ajouterEtudiant(etudiant);
		}
		return false;
		
	}
	
	public boolean retirerEtudiantGroupe(Etudiant etudiant, Groupe groupe)
	{
		if(this.listeGroupes.contains(groupe))
		{
			etudiant.retirerGroupe(groupe);
			return groupe.supprimerEtudiant(etudiant);
		}
		return false;
		
	}
	
	public boolean affecterGroupeAuProjet(Groupe groupe, Projet projet)
	{
		if(this.listeGroupes.contains(groupe))
		{
			projet.ajouterGroupe(groupe);
			return groupe.ajouterProjet(projet);
		}
		return false;
	}
	
	public boolean retirerGroupeAuProjet(Groupe groupe, Projet projet)
	{
		if(this.listeGroupes.contains(groupe))
		{
			projet.retirerGroupe(groupe);
			return groupe.retirerProjet(projet);
		}
		return false;
	}
	public boolean ajouterLangageDuProjet(Projet projet, Langage langage)
	{
		return projet.ajouterLangageDeProgrammation(langage);
	}
	public boolean retirerLangageDuProjet(Projet projet, Langage langage)
	{
		return projet.retirerLangageDeProgrammation(langage);
	}
	public boolean ajouterMotCleDuProjet(Projet projet, MotCle motCle)
	{
		return projet.ajouterMotCle(motCle);
	}
	public boolean retirerMotCleDuProjet(Projet projet, MotCle motCle)
	{
		return projet.retirerMotCle(motCle);
	}
	public boolean ajouterJalonDuProjet(Projet projet, Jalon jalon)
	{
		return projet.ajouterJalon(jalon);
	}
	public boolean retirerJalonDuProjet(Projet projet, Jalon jalon)
	{
		return projet.retirerJalon(jalon);
	}
	
	

}
