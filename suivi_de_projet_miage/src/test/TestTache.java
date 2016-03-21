package test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import modele.Jalon;
import modele.Tache;

public class TestTache {

	@Test
	public void testConstructeur() {

		// When
		Jalon jalon = new Jalon("EL GOFF", new Date(), new Date(), 20);
		String nomExecutantAttendu = "EL GOFF";
		String descriptionAttendu = "Rien à signalé";
		boolean etatAttendu = true;

		// Then
		Tache t = new Tache(jalon, "EL GOFF", "Rien à signalé", new Date(), new Date());
		String nomExecutantActuel = t.getNomExecutant();
		String descriptionActuel = t.getDescription();
		Boolean etatActuel = t.getEtat();

		// Given
		assertNotNull(t);
		assertEquals(nomExecutantAttendu, nomExecutantActuel);
		assertEquals(descriptionAttendu, descriptionActuel);
		assertEquals(etatAttendu, etatActuel);
		

	}

}
