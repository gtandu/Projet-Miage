package test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import java.util.HashSet;

import org.junit.Test;

import modele.Jalon;
import modele.Langage;
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
		projet.supprimerLangageDeProgrammation(langage);
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
	
	

}
