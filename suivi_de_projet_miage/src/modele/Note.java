package modele;

public class Note {
	
	private double valeurNote;
	
	private Projet projet;
	
	public Note()
	{
		this.valeurNote = 0;
		this.projet = null;
	}

	public Note (double note, Projet projet){
		
		this.valeurNote = note;
		this.projet = projet;
	}
	
	public double getValeurNote() {
		return valeurNote;
	}

	public void setNote(double note) {
		this.valeurNote = note;
	}

	public Projet getProjet() {
		return projet;
	}

	public void setProjet(Projet projet) {
		this.projet = projet;
	}
	
	public double getNoteByIdProjet(int idProjet)
	{
		if(projet.IDENTIFIANT == idProjet)
		{
			return this.valeurNote;
		}
		
		return 0;
	}
	
	public boolean equals(Note note)
	{
		return this.projet.IDENTIFIANT == note.getProjet().IDENTIFIANT && this.valeurNote == note.getValeurNote();
	}
	
	public int hashCode()
	{
		return this.projet.hashCode()+Double.valueOf(this.valeurNote).hashCode();
	}
	
	public String toString()
	{
		return "Note: " + this.valeurNote;
	}
	
}
