package fr.polytech.Dimassa.entities.Localisation;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import fr.polytech.Dimassa.entities.Trraitement.Utilisateur;

@Entity
@Table(name="Localisation")
public class Localisation implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idLocalisation;
	private Double latitude;
	private Double longitude;
	
	@ManyToOne
	@JoinColumn(name= "idetablissement" )
	private Etablissement etbalissement;
	
	
	
	public Localisation(Double latitude, Double longitude) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
	}
	public Localisation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdLocalisation() {
		return idLocalisation;
	}
	public void setIdLocalisation(Long idLocalisation) {
		this.idLocalisation = idLocalisation;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Etablissement getEtbalissement() {
		return etbalissement;
	}
	public void setEtbalissement(Etablissement etbalissement) {
		this.etbalissement = etbalissement;
	}
	
	
}
