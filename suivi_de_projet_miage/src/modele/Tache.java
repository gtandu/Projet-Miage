package modele;

import java.util.Date;

public class Tache {

	
	private Long id;

	private Jalon jalonID;

	private String nomExecutant;

	private String description;

	private Date dateDebut;

	private Date dateFin;

	private Boolean etat;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Jalon getJalonID() {
		return jalonID;
	}

	public void setJalonID(Jalon jalonID) {
		this.jalonID = jalonID;
	}

	public String getNomExecutant() {
		return nomExecutant;
	}

	public void setNomExecutant(String nomExecutant) {
		this.nomExecutant = nomExecutant;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public Boolean getEtat() {
		return etat;
	}

	public void setEtat(Boolean etat) {
		this.etat = etat;
	}

}
