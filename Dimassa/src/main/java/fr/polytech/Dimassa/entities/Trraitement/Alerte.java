package fr.polytech.Dimassa.entities.Trraitement;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;


@Entity
@Table(name="Alerte")
public class Alerte implements Serializable  {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idAlerte;
	private TypeAlerte titreAlerte;
	private String descriptionAlerte;
	
	@ManyToOne
	@JoinColumn(name= "idCarnet" )
	private CarnetSante carnet;

	public Long getIdAlerte() {
		return idAlerte;
	}

	public void setIdAlerte(Long idAlerte) {
		this.idAlerte = idAlerte;
	}

	public TypeAlerte getTitreAlerte() {
		return titreAlerte;
	}

	public void setTitreAlerte(TypeAlerte titreAlerte) {
		this.titreAlerte = titreAlerte;
	}

	public String getDescription() {
		return descriptionAlerte;
	}

	public void setDescription(String descriptionAlerte) {
		this.descriptionAlerte = descriptionAlerte;
	}

	public CarnetSante getCarnet() {
		return carnet;
	}

	public void setCarnet(CarnetSante carnet) {
		this.carnet = carnet;
	}

	public Alerte() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Alerte(TypeAlerte titreAlerte, String descriptionAlerte) {
		super();
		this.titreAlerte = titreAlerte;
		this.descriptionAlerte = descriptionAlerte;
	}
	
	

}
