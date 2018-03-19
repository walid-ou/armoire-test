package fr.polytech.Dimassa.entities.Armoire;

import fr.polytech.Dimassa.entities.Localisation.Etablissement;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Produit")
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_Produit",
discriminatorType= DiscriminatorType.STRING)


public class Produit implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idProduit;
	private String nomProd;
	private Date dateExpiration;
	
	@ManyToMany(mappedBy="produits")
	private Collection<Etablissement> etablissements;
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}

	public String getNomProd() {
		return nomProd;
	}

	public void setNomProd(String nomProd) {
		this.nomProd = nomProd;
	}

	public Date getDateExpiration() {
		return dateExpiration;
	}

	public void setDateExpiration(Date dateExpiration) {
		this.dateExpiration = dateExpiration;
	}

	public Collection<Etablissement> getEtablissements() {
		return etablissements;
	}

	public void setEtablissements(Collection<Etablissement> etablissements) {
		this.etablissements = etablissements;
	}

	
	
	
}
