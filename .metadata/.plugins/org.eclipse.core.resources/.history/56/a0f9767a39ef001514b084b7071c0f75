package modele;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Jalon {

	private int id;

	private Projet projet;

	private String nom;

	private Date dateDebut;

	private Date dateFin;

	private List<Tache> listeTaches;

	private List<Document> listeDocuments;

	private double note;
	
	public static int  ID = 0;

	public Jalon(String nom, Date dateDebut, Date dateFin, double note) {
		this.id = ++ID;
		this.nom = nom;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.listeTaches = new ArrayList<Tache>();
		this.listeDocuments = new ArrayList<Document>();
		this.note = note;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public List<Tache> getListeTaches() {
		return listeTaches;
	}

	public void setListeTaches(List<Tache> listeTaches) {
		this.listeTaches = listeTaches;
	}

	public List<Document> getListeDocuments() {
		return listeDocuments;
	}

	public void setListeDocuments(List<Document> listeDocuments) {
		this.listeDocuments = listeDocuments;
	}

	public double getNote() {
		return note;
	}

	public void setNote(double note) {
		this.note = note;
	}

}
