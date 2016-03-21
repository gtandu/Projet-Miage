package test;

import static org.junit.Assert.*;

import java.util.List;

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
		List<Enseignant> listeEnseignants = groupe.getListeEnseignants();
		List<Etudiant> listeEtudiants = groupe.getListeEtudiants();
		List<Projet> listeProjets = groupe.getListeProjets();

		assertNotNull(listeEnseignants);
		assertNotNull(listeEtudiants);
		assertNotNull(listeProjets);

	}

}
