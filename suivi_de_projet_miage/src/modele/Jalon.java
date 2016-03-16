package modele;

import java.util.Date;
import java.util.List;

public class Jalon {

	private Long id;

	private Projet projet;

	private String nom;

	private Date dateDebut;

	private Date dateFin;

	private List<Tache> listeTaches;

	private List<Document> listeDocuments;

	private double note;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
