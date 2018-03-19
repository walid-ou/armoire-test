package fr.polytech.Dimassa.entities.Trraitement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Pilulier")
public class Pilulier {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPilulier;
	private String numeroTelPilulier;
	public Long getIdPilulier() {
		return idPilulier;
	}
	public void setIdPilulier(Long idPilulier) {
		this.idPilulier = idPilulier;
	}
	public String getNumeroTelPilulier() {
		return numeroTelPilulier;
	}
	public void setNumeroTelPilulier(String numeroTelPilulier) {
		this.numeroTelPilulier = numeroTelPilulier;
	}
	public Pilulier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pilulier(String numeroTelPilulier) {
		super();
		this.numeroTelPilulier = numeroTelPilulier;
	}
	
	

}
