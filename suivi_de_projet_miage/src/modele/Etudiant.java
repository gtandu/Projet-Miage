package modele;

import java.util.Date;
import java.util.HashSet;

public class Etudiant extends Compte {

	private HashSet<Note> listeNotes;

	public Etudiant(String nom, String prenom, String login, String mdp) {
		super(nom, prenom, login, mdp);
		this.listeNotes = new HashSet<>();
	}

	public HashSet<Note> getListeNotes() {
		return listeNotes;
	}

	public void setListeNotes(HashSet<Note> listeNotes) {
		this.listeNotes = listeNotes;
	}

	public boolean ajouterNote(Note note) {
		return this.listeNotes.add(note);
	}

	public boolean retirerNote(Note note) {
		return this.listeNotes.remove(note);
	}

	public void ajouterDocument(Document doc, Jalon jalon) {

		jalon.setDateFin(new Date());
		jalon.ajouterDocument(doc);
	}
	
	public void retirerDocument(Document doc, Jalon jalon) {

		jalon.supprimerDocument(doc);
	}

	public boolean ajouterNote(double noteProjet, Projet projet) {
		Note note = new Note(noteProjet, projet);
		projet.setNote(note);
		return this.listeNotes.add(note);
	}

	public String afficherNoteProjet(Projet projet) {
		Double noteDuProjet = 0.0;
		for (Note note : this.listeNotes) {
			noteDuProjet = note.getNoteByIdProjet(projet.IDENTIFIANT);
		}
		return "Note finale du projet: " + noteDuProjet+"\n";
	}

}
