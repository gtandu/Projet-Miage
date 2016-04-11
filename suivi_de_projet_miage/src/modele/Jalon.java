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

	private double note;

	public Jalon(String nom, Projet projet) {
		this.nom = nom;
		this.projet = projet;
		this.dateDebut = new Date();
		this.dateFin = null;
		this.listeTaches = new HashSet<Tache>();
		this.listeDocuments = new HashSet<Document>();
		this.note = 0;
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
		//TODO EXCEPTION
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

	public double getNote() {
		return note;
	}

	public void setNote(double note) {
		this.note = note;
	}

	@Override
	public int compareTo(Jalon jalon) {
		return this.dateDebut.compareTo(jalon.getDateDebut());
	}
	
	@Override
	public String toString() {
		return "Jalon [nom=" + nom + ", projet=" + projet + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin
				+ ", listeTaches=" + listeTaches + ", listeDocuments=" + listeDocuments + ", note=" + note + "]";
	}

}
