package modele;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Jalon {
	
	@Id
	@Column(name="ID")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name ="PROJETID")
	private Projet projet;
	
	@Column(name="NOM")
	private String nom;
	
	@Column(name="DATEDEBUT")
	private Date dateDebut;
	
	@Column(name="DATEFIN")
	private Date dateFin;
	
	@OneToMany(mappedBy ="jalonID", orphanRemoval = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Tache> listeTache;
	
	@Column(name="NOTE")
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
