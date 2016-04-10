package modele;

import java.io.File;

public class Document {
	
	private String nom;
	
	private File document;
	
	public Document(String nom, File document)
	{
		this.nom = nom;
		this.document = document;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public File getDocument() {
		return document;
	}

	public void setDocument(File document) {
		this.document = document;
	}
	
	public String toString()
	{
		return "Nom du document :"+this.nom;
	}
	
	

}
