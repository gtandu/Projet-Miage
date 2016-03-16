package modele;

public class Enseignant extends Compte{
	
	private boolean admin;
	
	public Enseignant(String nom, String prenom, String login, String mdp) {
		super(nom, prenom, login, mdp);
		this.admin = true;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	
	

}
