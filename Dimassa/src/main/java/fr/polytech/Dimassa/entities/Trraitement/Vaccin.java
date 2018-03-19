package fr.polytech.Dimassa.entities.Trraitement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Vaccin")
public class Vaccin {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idVaccin;
	private String nomVaccin;
	private String descriptionVaccin;
	private int ageVaccin;
	
	@ManyToOne()
	@JoinColumn(name="idCarnetVaccin")
	private CarnetVaccin carnetVaccin;
	
	
	
	public Vaccin(Long idVaccin, String nomVaccin, String descriptionVaccin,
			int ageVaccin) {
		super();
		this.idVaccin = idVaccin;
		this.nomVaccin = nomVaccin;
		this.descriptionVaccin = descriptionVaccin;
		this.ageVaccin = ageVaccin;
	}
	public Vaccin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdVaccin() {
		return idVaccin;
	}
	public void setIdVaccin(Long idVaccin) {
		this.idVaccin = idVaccin;
	}
	public String getNomVaccin() {
		return nomVaccin;
	}
	public void setNomVaccin(String nomVaccin) {
		this.nomVaccin = nomVaccin;
	}
	public String getDescriptionVaccin() {
		return descriptionVaccin;
	}
	public void setDescriptionVaccin(String descriptionVaccin) {
		this.descriptionVaccin = descriptionVaccin;
	}
	public int getAgeVaccin() {
		return ageVaccin;
	}
	public void setAgeVaccin(int ageVaccin) {
		this.ageVaccin = ageVaccin;
	}
	public CarnetVaccin getCarnetVaccin() {
		return carnetVaccin;
	}
	public void setCarnetVaccin(CarnetVaccin carnetVaccin) {
		this.carnetVaccin = carnetVaccin;
	}
	
}

