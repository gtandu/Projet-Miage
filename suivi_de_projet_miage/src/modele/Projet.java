package modele;

import java.util.Date;
import java.util.HashSet;

public class Projet implements Comparable<Projet> {
		
	private String nom;
	
	private String description;
	
	private Date date;
	
	private String filiere;
	
	private HashSet<Groupe> listeGroupes;
	
	private boolean etat;
	
	private int note;
	
	private HashSet<Langage> listeLangages;
	
	private HashSet<Jalon> listeJalons;
	
	private HashSet<MotCle> listeMotsCles;
	
	public Projet(String nom, String description, String filiere)
	{
		this.nom = nom;
		this.description = description;
		this.date = new Date();
		this.filiere = filiere;
		this.listeGroupes = new HashSet<>();
		this.etat = true;
		this.note = 0;
		this.listeLangages = new HashSet<>();
		this.listeJalons = new HashSet<>();
		this.listeMotsCles = new HashSet<>();
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
	public HashSet<Groupe> getListeGroupes() {
		return listeGroupes;
	}
	public void setListeGroupes(HashSet<Groupe> listeGroupes) {
		this.listeGroupes = listeGroupes;
	}
	public boolean isEtat() {
		return etat;
	}
	public void setEtat(boolean etat) {
		this.etat = etat;
	}
	public HashSet<Langage> getListeLangages() {
		return listeLangages;
	}
	public void setListeLangages(HashSet<Langage> listeLangages) {
		this.listeLangages = listeLangages;
	}
	public HashSet<Jalon> getListeJalons() {
		return listeJalons;
	}
	public void setListeJalons(HashSet<Jalon> listeJalons) {
		this.listeJalons = listeJalons;
	}
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
	public HashSet<MotCle> getListeMotsCles() {
		return listeMotsCles;
	}
	public void setListeMotsCles(HashSet<MotCle> listeMotsCles) {
		this.listeMotsCles = listeMotsCles;
	}
	
	public boolean ajouterGroupe(Groupe groupe)
	{
		return this.listeGroupes.add(groupe);
	}
	
	public boolean retirerGroupe(Groupe groupe)
	{
		return this.listeGroupes.remove(groupe);
	}

	public boolean ajouterLangageDeProgrammation(Langage langage)
	{
		return this.listeLangages.add(langage);
	}
	
	public boolean supprimerLangageDeProgrammation(Langage langage)
	{
		return this.listeLangages.remove(langage);
	}
	
	public boolean ajouterJalon(Jalon jalon)
	{
		return this.listeJalons.add(jalon);
	}
	
	public boolean retirerJalon(Jalon jalon)
	{
		return this.listeJalons.remove(jalon);
	}
	
	public boolean ajouterMotCle(MotCle motCle)
	{
		return this.listeMotsCles.add(motCle);
	}
	
	public boolean retirerMotCle(MotCle motCle)
	{
		return this.listeMotsCles.remove(motCle);
	}
		
	@Override
	public int compareTo(Projet projet) {
		return this.date.compareTo(projet.getDate());
	}
	
	@Override
	public String toString() {
		return "Projet [nom=" + nom + ", description=" + description + ", date=" + date + ", filiere=" + filiere
				+ ", listeGroupes=" + listeGroupes + ", etat=" + etat + ", note=" + note + ", listeLangages="
				+ listeLangages + ", listeJalons=" + listeJalons + ", listeMotsCles=" + listeMotsCles + "]";
	}
	
	
	
	

}
