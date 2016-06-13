package modele;

import java.util.Date;
import java.util.HashSet;
import java.util.List;

public class Jalon implements Comparable<Jalon> {

	private String nom;
	
	private Projet projet;

	private Date dateDebut;

	private Date dateFin;

	private HashSet<Tache> listeTaches;

	private HashSet<Document> listeDocuments;

	private Note note;

	public Jalon(String nom, Projet projet) {
		this.nom = nom;
		this.projet = projet;
		this.dateDebut = new Date();
		this.dateFin = null;
		this.listeTaches = new HashSet<Tache>();
		this.listeDocuments = new HashSet<Document>();
		this.note = new Note(0, projet);
	}
	
	public boolean ajouterTache(Tache t)
	{
		// TODO EXCEPTION
		return this.listeTaches.add(t);
	}
	
	public boolean supprimerTache(Tache t)
	{
		return this.listeTaches.remove(t);
	}
	
	public boolean ajouterDocument(Document doc)
	{
		return this.listeDocuments.add(doc);
	}
	
	public boolean supprimerDocument(Document doc)
	{
		return this.listeDocuments.remove(doc);
	}

	public Projet getProjet() {
		return projet;
	}

	public void setProjet(Projet projet) {
		this.projet = projet;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public HashSet<Tache> getListeTaches() {
		return listeTaches;
	}

	public void setListeTaches(HashSet<Tache> listeTaches) {
		this.listeTaches = listeTaches;
	}

	public HashSet<Document> getListeDocuments() {
		return listeDocuments;
	}

	public void setListeDocuments(HashSet<Document> listeDocuments) {
		this.listeDocuments = listeDocuments;
	}

	public Note getNote() {
		return note;
	}

	public void setNote(Note note) {
		this.note = note;
	}
	
	//TODO equals + hashcode

	@Override
	public int compareTo(Jalon jalon) {
		return this.dateDebut.compareTo(jalon.getDateDebut());
	}
	
	public String afficherListesDesTaches()
	{
		return "------ Listes des taches ------\n" + listeTaches;
	}
	
	@Override
	public String toString() {
		return "Nom du jalon: "+nom + "\nNom du projet : " + projet.getNom() + "\nDate de debut: " + dateDebut + "\nDate de fin: " + dateFin
				+"\nNombres de taches: "+this.listeTaches.size()+"\nListe des documents: " + listeDocuments + "\nNote du jalon: " + note.getValeurNote()+"\n";
	}

}
