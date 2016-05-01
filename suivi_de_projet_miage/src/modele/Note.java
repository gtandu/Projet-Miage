package modele;

public class Note {
	
	private double note;
	
	private Projet projet;
	
	private Groupe groupe;
	

	public Note (double note, Projet projet, Groupe groupe){
		
		this.note = note;
		this.projet = projet;
		this.groupe = groupe;
	}
	
	public double getNote() {
		return note;
	}

	public void setNote(double note) {
		this.note = note;
	}

	public Projet getProjet() {
		return projet;
	}

	public void setProjet(Projet projet) {
		this.projet = projet;
	}

	public Groupe getGroupe() {
		return groupe;
	}

	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}
	
	public double getNoteByProjet(int idProjet)
	{
		if(projet.IDENTIFIANT == idProjet)
		{
			return this.note;
		}
		
		return 0;
	}
	
	
	
	

}
