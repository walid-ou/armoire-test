package fr.polytech.Dimassa.entities.Trraitement;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Medecin")
public class Medecin implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idMedecin;
	private String nomMedecin;
	private String specialiteMedecin;
	
	
	public Medecin(String nomMedecin, String specialiteMedecin) {
		super();
		this.nomMedecin = nomMedecin;
		this.specialiteMedecin = specialiteMedecin;
	}
	public Medecin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdMedecin() {
		return idMedecin;
	}
	public void setIdMedecin(Long idMedecin) {
		this.idMedecin = idMedecin;
	}
	public String getNomMedecin() {
		return nomMedecin;
	}
	public void setNomMedecin(String nomMedecin) {
		this.nomMedecin = nomMedecin;
	}
	public String getSpecialiteMedecin() {
		return specialiteMedecin;
	}
	public void setSpecialiteMedecin(String specialiteMedecin) {
		this.specialiteMedecin = specialiteMedecin;
	}
	
	
	
	
}
