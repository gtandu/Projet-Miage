package test;

import static org.junit.Assert.*;

import java.util.List;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import java.util.HashSet;
import org.junit.Test;

import modele.Enseignant;
import modele.Etudiant;
import modele.Groupe;
import modele.Projet;

public class TestGroupe {

	@Test
	public void testConstructeur() {
		// When
		Groupe groupe = new Groupe();
		HashSet<Enseignant> listeEnseignants = groupe.getListeEnseignants();
		HashSet<Etudiant> listeEtudiants = groupe.getListeEtudiants();
		HashSet<Projet> listeProjets = groupe.getListeProjets();

		assertNotNull(listeEnseignants);
		assertNotNull(listeEtudiants);
		assertNotNull(listeProjets);
	}
	public void ajouterEnseignant() {
		// WHEN
		Enseignant enseignant = new Enseignant("Benzakki", "Judith", "jBenzakki", "azerty");
		Groupe groupe = new Groupe();

		// GIVEN
		groupe.ajouterEnseignement(enseignant);
		HashSet<Enseignant> enseignantsResponsables = groupe.getListeEnseignants();

		// THEN
		assertThat(enseignantsResponsables, contains(enseignant));
	}
	
	@Test
	public void ajouterDeuxFoisMemeEnseignant() {
		// WHEN
		Enseignant enseignant = new Enseignant("Benzakki", "Judith", "jBenzakki", "azerty");
		Groupe groupe = new Groupe();

		// GIVEN
		groupe.ajouterEnseignement(enseignant);
		groupe.ajouterEnseignement(enseignant);
		HashSet<Enseignant> enseignantsResponsables = groupe.getListeEnseignants();

		// THEN
		assertThat(enseignantsResponsables, contains(enseignant));
		assertThat(enseignantsResponsables, hasSize(1));
	}

	@Test
	public void supprimerEnseignant() {
		// WHEN
		Enseignant enseignant = new Enseignant("Benzakki", "Judith", "jBenzakki", "azerty");
		Groupe groupe = new Groupe();
		groupe.ajouterEnseignement(enseignant);

		// GIVEN
		groupe.supprimerEnseignement(enseignant);
		HashSet<Enseignant> enseignantsResponsables = groupe.getListeEnseignants();

		// THEN
		assertThat(enseignantsResponsables, not(contains(enseignant)));
	}
	
	@Test
	public void ajouterEtudiant() {
		// WHEN
		Etudiant etudiant = new Etudiant("Tandu", "Glodie", "gtandu", "azerty");
		Groupe groupe = new Groupe();

		// GIVEN
		groupe.ajouterEtudiant(etudiant);
		HashSet<Etudiant> etudiantsDuGroupe = groupe.getListeEtudiants();

		// THEN
		assertThat(etudiantsDuGroupe, contains(etudiant));
	}
	
	@Test
	public void supprimerEtudiant() {
		// WHEN
		Etudiant etudiant = new Etudiant("Tandu", "Glodie", "gtandu", "azerty");
		Groupe groupe = new Groupe();
		groupe.ajouterEtudiant(etudiant);

		// GIVEN
		groupe.supprimerEtudiant(etudiant);
		HashSet<Etudiant> etudiantsDuGroupe = groupe.getListeEtudiants();

		// THEN
		assertThat(etudiantsDuGroupe, not(contains(etudiant)));
	}

}
