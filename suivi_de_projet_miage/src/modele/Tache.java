package modele;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Tache {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	@OneToOne
	@JoinColumn(name = "JALONID")
	private Jalon jalonID;

	@Column(name="NOMEXECUTANT")
	private String nomExecutant;

	@Column(name="DESCRIPTION")
	private String description;

	@Column(name="DATEDEBUT")
	private Date dateDebut;

	@Column(name="DATEFIN")
	private Date dateFin;

	@Column(name="ETAT")
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
