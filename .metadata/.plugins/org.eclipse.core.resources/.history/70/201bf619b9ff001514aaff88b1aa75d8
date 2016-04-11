package test;

import static org.junit.Assert.*;

import org.junit.Test;

import modele.MotCle;

public class TestMotCle {

	@Test
	public void testConstructeur() {
		
		//When
		String nomAttendu ="EGsasa";
		
		//Then
		MotCle mc = new MotCle(nomAttendu);
		
		String nomActuel = mc.getNom();
		
		//Given
		assertNotNull(mc);
		assertEquals(nomAttendu, nomActuel);
		
		
	}

}
