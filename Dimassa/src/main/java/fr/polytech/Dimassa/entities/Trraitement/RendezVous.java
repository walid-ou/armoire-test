package fr.polytech.Dimassa.entities.Trraitement;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="RendezVous")
@DiscriminatorValue("RV")
public class RendezVous extends Operation {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idRdv;
	private Date dateRdv;
	private String motifRdv;
	
	@ManyToOne
	@JoinColumn(name= "idMedecin" )
	private Medecin medecin;
	
	public RendezVous() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Medecin getMedecin() {
		return medecin;
	}
	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}
	
	public Date getDateRdv() {
		return dateRdv;
	}
	public void setDateRdv(Date dateRdv) {
		this.dateRdv = dateRdv;
	}
	public String getMotifRdv() {
		return motifRdv;
	}
	public void setMotifRdv(String motifRdv) {
		this.motifRdv = motifRdv;
	}
	
	
	

}
