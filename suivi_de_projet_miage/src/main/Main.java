package main;

import java.io.File;

import modele.Document;
import modele.Enseignant;
import modele.Etudiant;
import modele.Groupe;
import modele.Jalon;
import modele.Note;
import modele.Projet;
import modele.Tache;

public class Main {

	public static void main(String[] args) {

		// CREATION DE L'ENSEIGNANT
		Enseignant enseignant = new Enseignant("Benzakki", "Judith", "jBenzakki", "azerty");

		// CREATION DU PROJET PAR L'ENSEIGNANT
		Projet projet = enseignant.creerProjet("Projet 1", "Test projet", "Miage");

		// CREATION DES LANGAGES DE PROGRAMMATION PAR L'ENSEIGNANT
		enseignant.creerLangageDeProgrammation("J2EE", projet);
		enseignant.creerLangageDeProgrammation("HTML5", projet);

		// CREATION DES MOTS CLES PAR L'ENSEIGNANT
		enseignant.creerMotCle("#J2EE", projet);
		enseignant.creerMotCle("#MIAGE", projet);

		// CREATION D'UN GROUPE PAR L'ENSEIGNANT
		Groupe g1 = enseignant.creerGroupe("Groupe Tandu/ElGoff");

		// AFFICHE LES INFORMATIONS DE L'ENSEIGNANT
		System.out.println(enseignant + "\n");

		// CREATION DES ETUDIANTS PAR L'ENSEIGNANT
		Etudiant etu1 = enseignant.creerEtudiant("Tandu", "Glodie", "gTandu", "azerty");
		Etudiant etu2 = enseignant.creerEtudiant("El Goff", "Saher", "sElGoff", "azerty");

		// ENSEIGNANT AFFECTE LES ETUDIANTS AU GROUPE
		enseignant.affecterEtudiantGroupe(etu1, g1);
		enseignant.affecterEtudiantGroupe(etu2, g1);

		// AFFICHE LES INFORMATIONS DU GROUPE(NOM)
		System.out.println(g1);

		// AFFICHE LA COMPOSITION DU GROUPE (LISTE DES ETUDIANTS)
		System.out.println(g1.afficherCompoEtudiants());

		// AFFICHE LA LISTE DES PROJETS EXISTANTS
		System.out.println(enseignant.afficherListeDesProjets());
		// AFFECTE LE PROJET A UN GROUPE
		enseignant.affecterGroupeAuProjet(g1, projet.IDENTIFIANT);

		// AFFICHE LA LISTE DES GROUPES AUQUEL L'ETUDIANT EST AFFECTE
		System.out.println(etu1.afficherCompoGroupe());

		// ON RECUPERE LE PROJET DU GROUPE 1
		Projet projetDuGroupe1 = g1.getProjetByIdentifiant(projet.IDENTIFIANT);

		// L'ENSEIGNANT CREE UN JALON POUR LE PROJET
		Jalon jalon = enseignant.creerJalon("Jalon1", projetDuGroupe1);

		// L'ENSEIGNANT CREE UNE TACHE POUR LE JALON
		Tache tache1 = enseignant.creerTache(jalon, "TANDU", "Ajouter fichier txt");

		// AFFICHE LES INFORMATIONS DE LA TACHE 1
		System.out.println(tache1);

		// AFFICHE LES INFORMATIONS DU JALON
		System.out.println(jalon);

		// SIMULATION DE L'UPLOAD D'UN FICHIER
		File file = new File("/Users/Glodie/Documents/Projet-Miage/documentTest/test.txt");
		Document doc = new Document("Test.txt", file);

		// AJOUTE LE DOCUMENT AU JALON
		etu1.ajouterDocument(doc, jalon);

		// L'ENSEIGNANT VALIDE LA TACHE
		enseignant.validerTache(tache1);

		// L'ENSEIGNANT CREE UN DEUXIEME JALON
		Jalon jalon2 = enseignant.creerJalon("Jalon2", projetDuGroupe1);

		// L'ENSEIGNANT CREER UNE TACHE POUR LE JALON2
		Tache tache2 = enseignant.creerTache(jalon2, "EL GOFF", "Ajouter fichier txt");

		// AFFICHE LES INFORMATIONS DE LA TACHE 1
		System.out.println(tache2);

		// AFFICHE LES INFORMATIONS DU JALON
		System.out.println(jalon2);

		// L'ENSEIGNANT NOTE LES JALONS
		enseignant.noterJalon(jalon, new Note(18, projetDuGroupe1));
		enseignant.noterJalon(jalon2, new Note(6, projetDuGroupe1));

		// L'ENSEIGNANT CALCULE LA NOTE DE L'ETUDIANT 1
		enseignant.noterProjet(etu1, projetDuGroupe1);

		// AFFICHE LES INFORMATIONS DU PROJET
		System.out.println(projetDuGroupe1 + "\n");

		// AFFICHE LES INFORMATIONS DU JALON
		System.out.println(projetDuGroupe1.afficherInfosJalons() + "\n");

		// AFFICHE LA NOTE DU PROJET
		System.out.println(etu1.afficherNoteProjet(projetDuGroupe1));
		
	}

}
