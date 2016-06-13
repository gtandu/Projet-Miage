package modele;

import java.util.Date;

public class Enseignant extends Compte {

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

	public Projet creerProjet(String nom, String description, String filiere) {
		Projet projet = new Projet(nom, description, filiere);
		this.listeProjets.add(projet);
		return projet;
	}
	
	public Etudiant creerEtudiant(String nom, String prenom, String login, String mdp)
	{
		return new Etudiant(nom, prenom, login, mdp);
	}

	public Groupe creerGroupe(String nom) {
		Groupe groupe = new Groupe(nom);
		groupe.ajouterEnseignement(this);
		this.listeGroupes.add(groupe);
		return groupe;
	}

	public Jalon creerJalon(String nom, Projet projet) {
		Jalon jalon = new Jalon(nom, projet);
		projet.ajouterJalon(jalon);
		return jalon;
	}

	public boolean creerLangageDeProgrammation(String nom, Projet projet) {
		Langage langage = new Langage(nom);

		return projet.ajouterLangageDeProgrammation(langage);
	}

	public boolean creerMotCle(String nom, Projet projet) {
		MotCle motCle = new MotCle(nom);

		return projet.ajouterMotCle(motCle);
	}

	public Tache creerTache(Jalon jalon, String nomExecutant, String description) {
		Tache tache = new Tache(jalon, nomExecutant, description, new Date(), null);
		jalon.ajouterTache(tache);
		return tache;
	}
	
	public void validerTache(Tache t)
	{
		t.setEtat(true);
		System.out.println("Tache a faire ; "+t+"TACHE VALIDE PAR ENSEIGNANT\n");
	}
	
	
	//TODO CHANGER double en objet
	public void noterJalon(Jalon jalon, Note note) {
		jalon.setNote(note);
	}

	public void noterProjet(Etudiant etudiant, Projet projet) {
		double note = projet.calculerNote();
		etudiant.ajouterNote(note, projet);
		int projetIndex = this.rechercheProjetById(projet.IDENTIFIANT);
		listeProjets.set(projetIndex, projet);
		
	}

	public boolean affecterEtudiantGroupe(Etudiant etudiant, Groupe groupe) {
		if (this.listeGroupes.contains(groupe)) {
			etudiant.ajouterGroupe(groupe);
			return groupe.ajouterEtudiant(etudiant);
		}
		return false;

	}

	public boolean retirerEtudiantGroupe(Etudiant etudiant, Groupe groupe) {
		if (this.listeGroupes.contains(groupe)) {
			etudiant.retirerGroupe(groupe);
			return groupe.supprimerEtudiant(etudiant);
		}
		return false;

	}

	public boolean affecterGroupeAuProjet(Groupe groupe, int idProjet) {
		if (this.listeGroupes.contains(groupe)) {
			int IndexProjet = this.rechercheProjetById(idProjet);
			Projet projet = listeProjets.get(IndexProjet);
			if(projet != null)
			{
				projet.ajouterGroupe(groupe);
				return groupe.ajouterProjet(projet);
			}
			
		}
		return false;
	}

	public boolean retirerGroupeAuProjet(Groupe groupe, Projet projet) {
		if (this.listeGroupes.contains(groupe)) {
			projet.retirerGroupe(groupe);
			return groupe.retirerProjet(projet);
		}
		return false;
	}
	
	public int rechercheProjetById(int id)
	{
		for(int i=0; i<this.listeProjets.size(); i++)
		{
			if(this.listeProjets.get(i).IDENTIFIANT == id)
			{
				return i;
			}
		}
		
		return 0;
	}
	
	public String afficherListeDesProjets()
	{
		String s = "";
		
		for(int i=0; i<this.listeProjets.size(); i++)
		{
			Projet projet = this.listeProjets.get(i);
			s+= "ID Projet : "+projet.IDENTIFIANT +"\nNom du projet: "+projet.getNom()+"\n"+projet.getNote();
		}
		
		return s;
	}

}
