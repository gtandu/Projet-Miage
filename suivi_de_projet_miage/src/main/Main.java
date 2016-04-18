package main;

import modele.Enseignant;
import modele.Etudiant;
import modele.Groupe;
import modele.Projet;

public class Main {

	public static void main(String[] args) {
		
		
		Enseignant enseignant = new Enseignant("Benzakki", "Judith", "jBenzakki", "azerty");
		
		Projet projet = enseignant.creerProjet("Projet 1", "Test projet", "Miage");
		
		Groupe g1 = enseignant.creerGroupe("Groupe Tandu ElGOff");
		
		Groupe g2 = enseignant.creerGroupe("Groupe Toto Tata");
		
		System.out.println(enseignant+"\n");
		
		
		
		Etudiant etu1 = new Etudiant("Tandu", "Glodie", "gTandu", "azerty");
		
		Etudiant etu2 = new Etudiant("El Goff", "Saher", "sElGoff", "azerty");
		
		Etudiant etu3 = new Etudiant("Toto", "titi", "tTiti", "azerty");
		
		Etudiant etu4 = new Etudiant("Tata", "tutu", "tTutu", "azerty");
		
		enseignant.affecterEtudiantGroupe(etu1, g1);
		
		enseignant.affecterEtudiantGroupe(etu2, g1);
		
		enseignant.affecterEtudiantGroupe(etu3, g2);
		
		enseignant.affecterEtudiantGroupe(etu4, g2);
		
		System.out.println(g1);
		System.out.println(g1.afficherCompoEtudiants());
		System.out.println(g2);
		System.out.println(g2.afficherCompoEtudiants());
		
		enseignant.affecterGroupeAuProjet(g1, projet);
		
		enseignant.affecterGroupeAuProjet(g2, projet);
		
		System.out.println(etu1.afficherCompoGroupe());
		System.out.println(etu3.afficherCompoGroupe());
		
		
		//TODO ENSEIGNANT QUI CREE LE PROJET
		//TODO AFFECTER GROUPE AU PROJET
		//TODO TOSTRING PROJET FINAL

		
		System.out.println(projet);
		
		
		
		

	}

}
