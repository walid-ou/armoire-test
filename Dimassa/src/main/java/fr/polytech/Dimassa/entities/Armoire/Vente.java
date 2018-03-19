package fr.polytech.Dimassa.entities.Armoire;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import fr.polytech.Dimassa.entities.Localisation.Etablissement;

public class Vente implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idVanet;
	private Double prixVente;
	
	@OneToOne()
	private Produit produit;
	
	@OneToOne()
	private Etablissement pharmacie;

	
	
	
	public Vente(Double prixVente) {
		super();
		this.prixVente = prixVente;
	}

	public Vente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdVanet() {
		return idVanet;
	}

	public void setIdVanet(Long idVanet) {
		this.idVanet = idVanet;
	}

	public Double getPrixVente() {
		return prixVente;
	}

	public void setPrixVente(Double prixVente) {
		this.prixVente = prixVente;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Etablissement getPharmacie() {
		return pharmacie;
	}

	public void setPharmacie(Etablissement pharmacie) {
		this.pharmacie = pharmacie;
	}
	
	
	
	
	

}
