package fr.polytech.Dimassa.entities.Trraitement;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import fr.polytech.Dimassa.entities.Armoire.Produit;


@Entity
@Table(name="Medicament")
@DiscriminatorValue("MED")
public class Medicament extends Produit {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idMedicament;
	private String nomMedicament;
	private TypeMedicament typeMedicament;
	private Date datePerumptionMedicament;
	private Boolean ordonanceMedicament;
	
	@ManyToOne
	@JoinColumn(name= "idTraitement" )
	private Traitement traitement;
	@OneToOne(mappedBy="medicament")
	private Prise prise;
	
	
	public Medicament(String nomMedicament, TypeMedicament typeMedicament,
			Date datePerumptionMedicament, Boolean ordonanceMedicament) {
		super();
		this.ordonanceMedicament= ordonanceMedicament;
		this.nomMedicament = nomMedicament;
		this.typeMedicament = typeMedicament;
		this.datePerumptionMedicament = datePerumptionMedicament;
	}
	public Medicament() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdMedicament() {
		return idMedicament;
	}
	public void setIdMedicament(Long idMedicament) {
		this.idMedicament = idMedicament;
	}
	
	public Boolean getOrdonanceMedicament() {
		return ordonanceMedicament;
	}
	public void setOrdonanceMedicament(Boolean ordonanceMedicament) {
		this.ordonanceMedicament = ordonanceMedicament;
	}
	public String getNomMedicament() {
		return nomMedicament;
	}
	public void setNomMedicament(String nomMedicament) {
		this.nomMedicament = nomMedicament;
	}
	public TypeMedicament getTypeMedicament() {
		return typeMedicament;
	}
	public void setTypeMedicament(TypeMedicament typeMedicament) {
		this.typeMedicament = typeMedicament;
	}
	public Date getDatePerumptionMedicament() {
		return datePerumptionMedicament;
	}
	public void setDatePerumptionMedicament(Date datePerumptionMedicament) {
		this.datePerumptionMedicament = datePerumptionMedicament;
	}
	public Traitement getTraitement() {
		return traitement;
	}
	public void setTraitement(Traitement traitement) {
		this.traitement = traitement;
	}
	public Prise getPrise() {
		return prise;
	}
	public void setPrise(Prise prise) {
		this.prise = prise;
	}
	
	

}
