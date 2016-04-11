package testUnitaire;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import java.util.HashSet;
import java.util.List;

import org.hamcrest.core.IsCollectionContaining;
import org.junit.Test;

import modele.Enseignant;
import modele.Etudiant;
import modele.Groupe;

public class TestEnseignant {

	@Test
	public void testConstructeur() {
		//When
		String nomAttendu = "Tandu";
		String prenomAttendu = "Glodie";
		String loginAttendu = "gtandu";
		String mdpAttendu = "jojo123";
		boolean adminAttendu = true;
		
		//Then
		Enseignant e = new Enseignant(nomAttendu, prenomAttendu, loginAttendu, mdpAttendu);
		
		String nomActuel = e.getNom();
		String prenomActuel = e.getPrenom();
		String loginActuel = e.getLogin();
		String mdpActuel = e.getMdp();
		Boolean adminActuel = e.isAdmin();
		
		//Given
		assertEquals(nomAttendu, nomActuel);
		assertEquals(prenomAttendu, prenomActuel);
		assertEquals(loginAttendu, loginActuel);
		assertEquals(mdpAttendu, mdpActuel);
		assertEquals(adminAttendu, adminActuel);
		assertNotNull(e);
	}
	
	@Test
	public void creerUnGroupe()
	{
		//When
		Enseignant enseignant = new Enseignant("Benzakki", "Judith", "jbenzakki", "azerty");
		
		//Given
		Groupe groupe = enseignant.creerGroupe();
		HashSet<Enseignant> enseignantsResponsables = groupe.getListeEnseignants();
		
		//Then
		assertNotNull(groupe);
		assertThat(enseignantsResponsables, contains(enseignant));
	}
	
	@Test
	public void affecterUnEtudiantAUnGroupe_echec()
	{
		//When
		Enseignant enseignant = new Enseignant("Benzakki", "Judith", "jbenzakki", "azerty");
		Groupe groupe = new Groupe();
		Etudiant etudiant = new Etudiant("Tandu", "Glodie", "gtandu","azerty");
		
		
		//Given
		boolean resultat = enseignant.affecterEtudiantGroupe(etudiant, groupe);
		HashSet<Etudiant> membresDuGroupe = groupe.getListeEtudiants();
		
		//Then
		assertFalse(resultat);
		assertThat(membresDuGroupe, not(contains(etudiant)));
	}
	
	@Test
	public void affecterUnEtudiantAUnGroupe()
	{
		//When
		Enseignant enseignant = new Enseignant("Benzakki", "Judith", "jbenzakki", "azerty");
		Groupe groupe = enseignant.creerGroupe();
		Etudiant etudiant = new Etudiant("Tandu", "Glodie", "gtandu","azerty");
		
		
		//Given
		enseignant.affecterEtudiantGroupe(etudiant, groupe);
		HashSet<Etudiant> membresDuGroupe = groupe.getListeEtudiants();
		
		//Then
		assertThat(membresDuGroupe, contains(etudiant));
	}
	
	@Test
	public void affecterDeuxFoisMemeEtudiantAUnGroupe()
	{
		//When
		Enseignant enseignant = new Enseignant("Benzakki", "Judith", "jbenzakki", "azerty");
		Groupe groupe = enseignant.creerGroupe();
		Etudiant etudiant = new Etudiant("Tandu", "Glodie", "gtandu","azerty");
		
		
		//Given
		enseignant.affecterEtudiantGroupe(etudiant, groupe);
		enseignant.affecterEtudiantGroupe(etudiant, groupe);
		HashSet<Etudiant> membresDuGroupe = groupe.getListeEtudiants();
		
		//Then
		assertThat(membresDuGroupe, contains(etudiant));
		assertThat(membresDuGroupe, hasSize(1));
	}
	
	@Test
	public void retirerUnEtudiantDUnGroupe_echec()
	{
		//When
		Enseignant enseignant = new Enseignant("Benzakki", "Judith", "jbenzakki", "azerty");
		Groupe groupe = new Groupe();
		Etudiant etudiant = new Etudiant("Tandu", "Glodie", "gtandu","azerty");
		enseignant.affecterEtudiantGroupe(etudiant, groupe);
		
		//Given
		boolean resultat = enseignant.retirerEtudiantGroupe(etudiant, groupe);
		HashSet<Etudiant> membresDuGroupe = groupe.getListeEtudiants();
		
		//Then
		assertFalse(resultat);
		assertThat(membresDuGroupe, not(contains(etudiant)));
	}
	
	@Test
	public void retirerUnEtudiantDUnGroupe()
	{
		//When
		Enseignant enseignant = new Enseignant("Benzakki", "Judith", "jbenzakki", "azerty");
		Groupe groupe = enseignant.creerGroupe();
		Etudiant etudiant = new Etudiant("Tandu", "Glodie", "gtandu","azerty");
		enseignant.affecterEtudiantGroupe(etudiant, groupe);
		
		//Given
		enseignant.retirerEtudiantGroupe(etudiant, groupe);
		HashSet<Etudiant> membresDuGroupe = groupe.getListeEtudiants();
		
		//Then
		assertThat(membresDuGroupe, not(contains(etudiant)));
	}
	
	

}
