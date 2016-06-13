package modele;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

public class Projet implements Comparable<Projet> {
	
	private String nom;
	
	private String description;
	
	private Date date;
	
	private String filiere;
	
	private HashSet<Groupe> listeGroupes;
	
	private boolean etat;
	
	private HashSet<Langage> listeLangages;
	
	private HashSet<Jalon> listeJalons;
	
	private HashSet<MotCle> listeMotsCles;
	
	private Note note;
		
	public static int IDENTIFIANT = 0;
	
	
	
	public Projet(String nom, String description, String filiere)
	{
		IDENTIFIANT++; 
		this.nom = nom;
		this.description = description;
		this.date = new Date();
		this.filiere = filiere;
		this.listeGroupes = new HashSet<>();
		this.etat = true;
		this.listeLangages = new HashSet<>();
		this.listeJalons = new HashSet<>();
		this.listeMotsCles = new HashSet<>();
		this.note = new Note();
	}
	
	public Projet(Projet projet)
	{
		this.nom = projet.getNom();
		this.description = projet.getDescription();
		this.date = projet.getDate();
		this.filiere = projet.getFiliere();
		this.listeGroupes = projet.getListeGroupes();
		this.etat = projet.isEtat();
		this.listeLangages = projet.getListeLangages();
		this.listeJalons = projet.getListeJalons();
		this.listeMotsCles = projet.getListeMotsCles();
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
	public HashSet<MotCle> getListeMotsCles() {
		return listeMotsCles;
	}
	public void setListeMotsCles(HashSet<MotCle> listeMotsCles) {
		this.listeMotsCles = listeMotsCles;
	}
	
	public Note getNote() {
		return note;
	}

	public void setNote(Note note) {
		this.note = note;
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
	
	public boolean retirerLangageDeProgrammation(Langage langage)
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
	
	public double calculerNote()
	{
		double sommeJalon = 0;
		int i;
		Iterator<Jalon> it = this.listeJalons.iterator();
		
		for(i=0; it.hasNext(); i++)
		{
			Jalon jalon = (Jalon) it.next();
			
			sommeJalon+= jalon.getNote().getValeurNote();
		}
		
		return sommeJalon/=i;
	}
	
	public String afficherInfosJalons()
	{
		return "------ Listes des jalons------\n"+this.listeJalons;
	}
		
	@Override
	public int compareTo(Projet projet) {
		return this.date.compareTo(projet.getDate());
	}
	
	@Override
	public String toString() {
		return "Identifiant du projet: "+IDENTIFIANT+"\nNom du projet: " + nom + "\nDescription: " + description + "\nDate de creation: " + date + "\nFiliere: " + filiere
				+ "\nListes des groupes: " + listeGroupes + "\nEtat: " + etat + "\nLangages du projet: "
				+ listeLangages + "\nListe des mots cles : " + listeMotsCles;
	}
	
	
	
	

}
