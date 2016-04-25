package testUnitaire;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import java.util.HashSet;

import org.junit.Test;

import modele.Jalon;
import modele.Langage;
import modele.MotCle;
import modele.Projet;

public class TestProjet {

	@Test
	public void ajouterLangageDeProgrammation() {
		//WHEN
		Langage langage = new Langage("Java");
		Projet projet = new Projet("TestProjet", "Projet test unitaire", "Miage");
		
		//GIVEN
		projet.ajouterLangageDeProgrammation(langage);
		HashSet<Langage> langagesProgrammations = projet.getListeLangages();
		
		//THEN
		assertThat(langagesProgrammations, contains(langage));		
				
	}
	
	@Test
	public void ajouterDeuxMemeLangageDeProgrammation() {
		//WHEN
		Langage langage = new Langage("Java");
		Projet projet = new Projet("TestProjet", "Projet test unitaire", "Miage");
		
		//GIVEN
		projet.ajouterLangageDeProgrammation(langage);
		projet.ajouterLangageDeProgrammation(langage);
		HashSet<Langage> langagesProgrammations = projet.getListeLangages();
		
		//THEN
		assertThat(langagesProgrammations, contains(langage));
		assertThat(langagesProgrammations, hasSize(1));
				
	}
	
	@Test
	public void retirerLangageDeProgrammation() {
		//WHEN
		Langage langage = new Langage("Java");
		Projet projet = new Projet("TestProjet", "Projet test unitaire", "Miage");
		projet.ajouterLangageDeProgrammation(langage);
		
		//GIVEN
		projet.retirerLangageDeProgrammation(langage);
		HashSet<Langage> langagesProgrammations = projet.getListeLangages();
		
		//THEN
		assertThat(langagesProgrammations, not(contains(langage)));		
				
	}
	
	@Test
	public void ajouterJalon()
	{
		//WHEN
		Projet projet = new Projet("TestProjet", "Projet test unitaire", "Miage");
		Jalon jalon = new Jalon("Jalon1", projet);
		
		//GIVEN
		projet.ajouterJalon(jalon);
		HashSet<Jalon> jalonsduProjet = projet.getListeJalons();
		
		//THEN
		assertThat(jalonsduProjet, contains(jalon));
	}
	
	@Test
	public void ajouterDeuxMemeJalon()
	{
		//WHEN
		Projet projet = new Projet("TestProjet", "Projet test unitaire", "Miage");
		Jalon jalon = new Jalon("Jalon1", projet);
		
		//GIVEN
		projet.ajouterJalon(jalon);
		projet.ajouterJalon(jalon);
		HashSet<Jalon> jalonsduProjet = projet.getListeJalons();
		
		//THEN
		assertThat(jalonsduProjet, contains(jalon));
		assertThat(jalonsduProjet, hasSize(1));
	}
	
	@Test
	public void retirerJalon()
	{
		//WHEN
		Projet projet = new Projet("TestProjet", "Projet test unitaire", "Miage");
		Jalon jalon = new Jalon("Jalon1", projet);
		projet.ajouterJalon(jalon);
		//GIVEN
		projet.retirerJalon(jalon);
		HashSet<Jalon> jalonsduProjet = projet.getListeJalons();
		
		//THEN
		assertThat(jalonsduProjet, not(contains(jalon)));
	}
	
	@Test
	public void ajouterMotCle()
	{
		//WHEN
		Projet projet = new Projet("TestProjet", "Projet test unitaire", "Miage");
		MotCle motCle = new MotCle("java");
		
		//GIVEN
		projet.ajouterMotCle(motCle);
		HashSet<MotCle> motClesDuProjet = projet.getListeMotsCles();
		
		//THEN
		assertThat(motClesDuProjet, contains(motCle));
	}
	
	@Test
	public void ajouterDeuxMemeMotCle()
	{
		//WHEN
		Projet projet = new Projet("TestProjet", "Projet test unitaire", "Miage");
		MotCle motCle = new MotCle("java");
		
		//GIVEN
		projet.ajouterMotCle(motCle);
		projet.ajouterMotCle(motCle);
		HashSet<MotCle> motClesDuProjet = projet.getListeMotsCles();
		
		//THEN
		assertThat(motClesDuProjet, contains(motCle));
		//assertThat(motClesDuProjet, hasSize(1));
	}
	
	@Test
	public void retirerMotCle()
	{
		//WHEN
		Projet projet = new Projet("TestProjet", "Projet test unitaire", "Miage");
		MotCle motCle = new MotCle("java");
		projet.ajouterMotCle(motCle);
		//GIVEN
		
		projet.retirerMotCle(motCle);
		HashSet<MotCle> motClesDuProjet = projet.getListeMotsCles();
		
		//THEN
		assertThat(motClesDuProjet, not(contains(motCle)));
		assertThat(motClesDuProjet, hasSize(0));
	}
	
	

}
