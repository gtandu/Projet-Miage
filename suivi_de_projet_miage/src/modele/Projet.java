package modele;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Projet {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private Long id;
	
	@Column(name="NOM")
	private String nom;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="DATE")
	private Date date;
	
	@Column(name="FILIERE")
	private String filiere;
	
	@OneToOne
	@JoinColumn(name="GROUPEID")
	private Groupe groupe;
	
	@Column(name="ETAT")
	private boolean etat;
	
	@Column(name="NOTE")
	private int note;
	
	@OneToMany(mappedBy="projet", cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, fetch = FetchType.LAZY)
	private List<Langage> listeLangages;
	
	@OneToMany(mappedBy="projet", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Jalon> listeJalons;
	
	@OneToMany(mappedBy="projet", cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, fetch = FetchType.LAZY)
	private List<MotCle> listeMotsCles;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getFiliere() {
		return filiere;
	}
	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}
	public Groupe getGroupe() {
		return groupe;
	}
	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}
	public boolean isEtat() {
		return etat;
	}
	public void setEtat(boolean etat) {
		this.etat = etat;
	}
	public List<Langage> getListeLangages() {
		return listeLangages;
	}
	public void setListeLangages(List<Langage> listeLangages) {
		this.listeLangages = listeLangages;
	}
	public List<Jalon> getListeJalons() {
		return listeJalons;
	}
	public void setListeJalons(List<Jalon> listeJalons) {
		this.listeJalons = listeJalons;
	}
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
	public List<MotCle> getListeMotsCles() {
		return listeMotsCles;
	}
	public void setListeMotsCles(List<MotCle> listeMotsCles) {
		this.listeMotsCles = listeMotsCles;
	}

	
	

}
