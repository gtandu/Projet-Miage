package testUnitaire;

import static org.junit.Assert.*;

import org.junit.Test;

import modele.MotCle;

public class TestMotCle {

	@Test
	public void testConstructeur() {
		
		//When
		String nomAttendu ="EGsasa";
		
		//Then
		MotCle motcle = new MotCle(nomAttendu);
		
		String nomActuel = motcle.getNom();
		
		//Given
		assertNotNull(motcle);
		assertEquals(nomAttendu, nomActuel);
		
		
	}

}
