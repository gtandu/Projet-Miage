package modele;

import java.util.Date;
import java.util.List;

public class Projet {
	
	
	
	private Long id;
	
	private String nom;
	
	private String description;
	
	private Date date;
	
	private String filiere;
	
	private Groupe groupe;
	
	private boolean etat;
	
	private int note;
	
	private List<Langage> listeLangages;
	
	private List<Jalon> listeJalons;
	
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
