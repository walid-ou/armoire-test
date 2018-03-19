package fr.polytech.Dimassa.entities.Armoire;

import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name="ParaPharma")
@DiscriminatorValue("PPH")
public class ParaPharma extends Produit {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idParaPharma;
	private String nomParaPharma;
	private Date dateExpirationParaPharma;
	
	
	public ParaPharma(String nomParaPharma, Date dateExpirationParaPharma) {
		super();
		this.nomParaPharma = nomParaPharma;
		this.dateExpirationParaPharma = dateExpirationParaPharma;
	}
	public ParaPharma() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdParaPharma() {
		return idParaPharma;
	}
	public void setIdParaPharma(Long idParaPharma) {
		this.idParaPharma = idParaPharma;
	}
	public String getNomParaPharma() {
		return nomParaPharma;
	}
	public void setNomParaPharma(String nomParaPharma) {
		this.nomParaPharma = nomParaPharma;
	}
	public Date getDateExpirationParaPharma() {
		return dateExpirationParaPharma;
	}
	public void setDateExpirationParaPharma(Date dateExpirationParaPharma) {
		this.dateExpirationParaPharma = dateExpirationParaPharma;
	}
	
	
	
	
}
