package fr.polytech.Dimassa.entities.Localisation;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import fr.polytech.Dimassa.entities.Armoire.Produit;

 
@Entity
@Table(name="Etablissement")
public class Etablissement implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idEtablissement;
	private String nomEtablissement;
	private TypeEtablissement typeEtablissement;
	private Date horaireServiceEtablissement;
	
	@OneToMany(mappedBy="etablissement")
	private Collection<Localisation> localisations;

	@ManyToMany(mappedBy="etablissements")
	private Collection<Produit> produits;
	
	
	public Etablissement(String nomEtablissement,
			TypeEtablissement typeEtablissement,
			Date horaireServiceEtablissement) {
		super();
		this.nomEtablissement = nomEtablissement;
		this.typeEtablissement = typeEtablissement;
		this.horaireServiceEtablissement = horaireServiceEtablissement;
	}

	public Etablissement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdEtablissement() {
		return idEtablissement;
	}

	public void setIdEtablissement(Long idEtablissement) {
		this.idEtablissement = idEtablissement;
	}

	public String getNomEtablissement() {
		return nomEtablissement;
	}

	public void setNomEtablissement(String nomEtablissement) {
		this.nomEtablissement = nomEtablissement;
	}

	public TypeEtablissement getTypeEtablissement() {
		return typeEtablissement;
	}

	public void setTypeEtablissement(TypeEtablissement typeEtablissement) {
		this.typeEtablissement = typeEtablissement;
	}

	public Date getHoraireServiceEtablissement() {
		return horaireServiceEtablissement;
	}

	public void setHoraireServiceEtablissement(Date horaireServiceEtablissement) {
		this.horaireServiceEtablissement = horaireServiceEtablissement;
	}


	
	
	
	

}
