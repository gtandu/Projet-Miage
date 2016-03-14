package modele;

import java.util.Date;
import java.util.List;


public class Jalon {
	
	
	private Long id;
	
	private Projet projet;
	
	private String nom;
	
	private Date dateDebut;
	
	private Date dateFin;
	
	private List<Tache> listeTache;
	
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

	public List<Tache> getListeTache() {
		return listeTache;
	}

	public void setListeTache(List<Tache> listeTache) {
		this.listeTache = listeTache;
	}

	public double getNote() {
		return note;
	}

	public void setNote(double note) {
		this.note = note;
	}
	
	
	
	
	
	
	
	

}
