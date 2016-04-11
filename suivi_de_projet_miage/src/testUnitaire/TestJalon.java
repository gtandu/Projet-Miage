package testUnitaire;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import java.io.File;
import java.util.Date;
import java.util.HashSet;

import org.junit.Test;

import modele.Document;
import modele.Jalon;
import modele.Projet;
import modele.Tache;


public class TestJalon {
	
	@Test
	public void ajouterTache()
	{
		//When
		String nomJalon = "Jalon1";
		String nomExecutant = "Glodie";
		String description = "Premier jalon de test";
		Date dateDebut = new Date();
		Date dateFin = new Date();
		
		Projet p = new Projet("Projet1","Projet test unitaire","Miage");
		Jalon j = new Jalon(nomJalon, p);
		Tache t = new Tache(j, nomExecutant, description, dateDebut, dateFin);
		
		//Given
		j.ajouterTache(t);	
		HashSet<Tache> listeTachesActuel = j.getListeTaches();
		
		//Then
		assertThat(listeTachesActuel, contains(t));
	}
	
	@Test
	public void ajouterDocument()
	{
		//When
		String nomJalon = "Jalon1";
		
		String nomDocument = "NomDocument1";
		File file = new File("");
		
		Document document = new Document(nomDocument, file);
		Projet p = new Projet("Projet1","Projet test unitaire","Miage");
		Jalon j = new Jalon(nomJalon, p);
		
		//Given
		j.ajouterDocument(document);	
		HashSet<Document> listeDocumentActuel = j.getListeDocuments();
		
		//Then
		assertThat(listeDocumentActuel, contains(document));
	}
	
	@Test
	public void supprimerDocument()
	{
		//When
		String nomJalon = "Jalon1";
		
		String nomDocument = "NomDocument1";
		File file = new File("");
		
		Document document = new Document(nomDocument, file);
		Projet p = new Projet("Projet1","Projet test unitaire","Miage");
		Jalon j = new Jalon(nomJalon, p);
		
		//Given
		j.ajouterDocument(document);	
		j.supprimerDocument(document);
		HashSet<Document> listeDocumentActuel = j.getListeDocuments();
		
		//Then
		assertThat(listeDocumentActuel, empty());
		assertThat(listeDocumentActuel, not(contains(document)));
	}

}
