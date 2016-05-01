package main;

import java.io.File;

import modele.Document;
import modele.Enseignant;
import modele.Etudiant;
import modele.Groupe;
import modele.Jalon;
import modele.Langage;
import modele.MotCle;
import modele.Projet;

public class Main {

	public static void main(String[] args) {
		
		//TODO TACHE A JALON
		//TODO DOCUMENT A JALON
		
		Enseignant enseignant = new Enseignant("Benzakki", "Judith", "jBenzakki", "azerty");
		
		Projet projet = enseignant.creerProjet("Projet 1", "Test projet", "Miage");
		
		enseignant.creerLangageDeProgrammation("J2EE", projet);
		enseignant.creerLangageDeProgrammation("HTML5", projet);
			
		enseignant.creerMotCle("#J2EE", projet);
		enseignant.creerMotCle("#MIAGE", projet);
				
		Groupe g1 = enseignant.creerGroupe("Groupe Tandu/ElGoff");
				
		System.out.println(enseignant+"\n");
		
		
		
		Etudiant etu1 = new Etudiant("Tandu", "Glodie", "gTandu", "azerty");
		
		Etudiant etu2 = new Etudiant("El Goff", "Saher", "sElGoff", "azerty");
		
		
		enseignant.affecterEtudiantGroupe(etu1, g1);
		
		enseignant.affecterEtudiantGroupe(etu2, g1);
		
	
		
		System.out.println(g1);
		System.out.println(g1.afficherCompoEtudiants());
		
		
		enseignant.affecterGroupeAuProjet(g1, projet);
		
		
		//System.out.println(etu1.afficherCompoGroupe());
		
		Projet projetDuGroupe1 = g1.getProjetByIdentifiant(projet.IDENTIFIANT);
		
		
		Jalon jalon = enseignant.creerJalon("Jalon1", projetDuGroupe1);
		
		enseignant.creerTache(jalon, "TANDU","Ajouter fichier txt");
		File file = new File("/Users/Glodie/Documents/Projet-Miage/documentTest/test.txt");
		Document doc = new Document("Test.txt", file);
		etu1.ajouterDocument(doc, jalon);
		
		enseignant.noterJalon(jalon, 18);
		enseignant.noterProjet(etu1, projetDuGroupe1, g1);
		
		
		System.out.println(projetDuGroupe1);
		System.out.println(projetDuGroupe1.afficherInfosJalons());
		System.out.println(etu1.afficherNoteProjet(projetDuGroupe1));
		
		
		
		

		
	}

}
