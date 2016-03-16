package test;

import static org.junit.Assert.*;

import org.junit.Test;

import modele.Enseignant;

public class TestEnseignant {

	@Test
	public void testConstructeur() {
		//When
		int idAttendu = 1;
		String nomAttendu = "Tandu";
		String prenomAttendu = "Glodie";
		String loginAttendu = "gtandu";
		String mdpAttendu = "jojo123";
		boolean adminAttendu = true;
		
		//Then
		Enseignant e = new Enseignant(nomAttendu, prenomAttendu, loginAttendu, mdpAttendu);
		
		int idActuel = e.getId();
		String nomActuel = e.getNom();
		String prenomActuel = e.getPrenom();
		String loginActuel = e.getLogin();
		String mdpActuel = e.getMdp();
		Boolean adminActuel = e.isAdmin();
		
		//Given
		assertEquals(idAttendu, idActuel);
		assertEquals(nomAttendu, nomActuel);
		assertEquals(prenomAttendu, prenomActuel);
		assertEquals(loginAttendu, loginActuel);
		assertEquals(mdpAttendu, mdpActuel);
		assertEquals(adminAttendu, adminActuel);
		assertNotNull(e);
	}

}