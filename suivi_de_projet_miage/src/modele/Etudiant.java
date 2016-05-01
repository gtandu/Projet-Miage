package modele;

import java.util.HashSet;

public class Etudiant extends Compte {
	
	private HashSet<Projet> listeProjets;
	protected HashSet<Note> listeNotes;
	
	public Etudiant(String nom, String prenom, String login, String mdp) {
		super(nom, prenom, login, mdp);
		this.listeProjets = new HashSet<Projet>();
		this.listeNotes = new HashSet<>();
	}

	public HashSet<Projet> getListeProjets() {
		return listeProjets;
	}

	public void setListeProjets(HashSet<Projet> listeProjets) {
		this.listeProjets = listeProjets;
	}
	
	public HashSet<Note> getListeNotes() {
		return listeNotes;
	}

	public void setListeNotes(HashSet<Note> listeNotes) {
		this.listeNotes = listeNotes;
	}
	
	public boolean ajouterNote(Note note)
	{
		return this.listeNotes.add(note);
	}
	
	public boolean retirerNote(Note note)
	{
		return this.listeNotes.remove(note);
	}

	
	public void ajouterDocument(Document doc, Jalon jalon)
	{
		
		jalon.ajouterDocument(doc);
	}
	
	public boolean ajouterNote(double noteProjet, Projet projet, Groupe groupe)
	{
		Note note = new Note(noteProjet, projet, groupe);
		return this.listeNotes.add(note);
		
	}
	
	public String afficherNoteProjet(Projet projet)
	{
		Double noteDuProjet = 0.0;
		for(Note note : this.listeNotes)
		{
			noteDuProjet = note.getNoteByProjet(projet.IDENTIFIANT);
		}
		return "Note finale du projet: "+noteDuProjet;
	}

}
