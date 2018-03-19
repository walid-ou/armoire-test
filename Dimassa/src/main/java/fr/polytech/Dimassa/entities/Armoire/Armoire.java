package fr.polytech.Dimassa.entities.Armoire;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import fr.polytech.Dimassa.entities.Trraitement.Utilisateur;

@Entity
@Table(name="Armoire")
public class Armoire implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idArmoire;
	private String nomArmoire;
	private int nbArticle;

	@ManyToOne()
	@JoinColumn(name="idUtilisateur")
	private Utilisateur utilisateur;
	
	@OneToMany()
	private Collection<Produit> produits;

	
public Armoire() {
		super();
		// TODO Auto-generated constructor stub
	}

public Armoire(String nomArmoire, int nbArticle) {
	super();
	this.nomArmoire = nomArmoire;
	this.nbArticle = nbArticle;
}	
	public Long getIdArmoire() {
	return idArmoire;
}

public void setIdArmoire(Long idArmoire) {
	this.idArmoire = idArmoire;
}

	public String getNomArmoire() {
	return nomArmoire;
}
public void setNomArmoire(String nomArmoire) {
	this.nomArmoire = nomArmoire;
}
public int getNbArticle() {
	return nbArticle;
}
public void setNbArticle(int nbArticle) {
	this.nbArticle = nbArticle;
}
public Utilisateur getutilisateur() {
	return utilisateur;
}
public void setutilisateur(Utilisateur utilisateur) {
	this.utilisateur = utilisateur;
}
public Collection<Produit> getProduits() {
	return produits;
}
public void setProduits(Collection<Produit> produits) {
	this.produits = produits;
}



}
