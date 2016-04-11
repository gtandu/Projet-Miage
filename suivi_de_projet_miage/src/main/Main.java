package main;

import modele.Enseignant;
import modele.Etudiant;
import modele.Groupe;
import modele.Projet;

public class Main {

	public static void main(String[] args) {
		
		Projet p = new Projet("Projet 1", "Test projet", "Miage");
		
		Enseignant enseignant = new Enseignant("Benzakki", "Judith", "jBenzakki", "azerty");
		
		Groupe g1 = enseignant.creerGroupe("Groupe 1");
		
		Groupe g2 = enseignant.creerGroupe("Groupe 2");
		
		Etudiant etu1 = new Etudiant("Tandu", "Glodie", "gTandu", "azerty");
		
		Etudiant etu2 = new Etudiant("El Goff", "Saher", "sElGoff", "azerty");
		
		Etudiant etu3 = new Etudiant("Tandu", "Glodie", "gTandu", "azerty");
		
		Etudiant etu4 = new Etudiant("El Goff", "Saher", "sElGoff", "azerty");
		
		enseignant.affecterEtudiantGroupe(etu1, g1);
		
		enseignant.affecterEtudiantGroupe(etu2, g1);
		
		enseignant.affecterEtudiantGroupe(etu3, g2);
		
		enseignant.affecterEtudiantGroupe(etu4, g2);
		
		System.out.println(g1);
		System.out.println(g2);
		
		
		
		

	}

}
