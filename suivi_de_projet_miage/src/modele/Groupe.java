package modele;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Groupe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToMany(targetEntity = Compte.class, mappedBy="listeGroupes", cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, fetch = FetchType.LAZY)
	private List<Compte> listeComptes;
	
	@OneToMany(mappedBy="groupe", cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, fetch = FetchType.LAZY)
	private List<Projet> listeProjets;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Compte> getListeCompte() {
		return listeComptes;
	}
	public void setListeCompte(List<Compte> listeCompte) {
		this.listeComptes = listeCompte;
	}
	public List<Projet> getListeProjet() {
		return listeProjets;
	}
	public void setListeProjet(List<Projet> listeProjet) {
		this.listeProjets = listeProjet;
	}
	
	

}
