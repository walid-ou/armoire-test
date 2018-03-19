package fr.polytech.Dimassa.entities.Trraitement;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="Vaccination")
public class Vaccination {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idVaccination;
	private Date dateVaccin;
	
	@OneToOne()
	private Vaccin vaccin;
	
	@OneToOne()
	private CarnetVaccin carnetvaccin;
	
	
	public Date getDateVaccin() {
		return dateVaccin;
	}
	public void setDateVaccin(Date dateVaccin) {
		this.dateVaccin = dateVaccin;
	}
	public Vaccin getVaccin() {
		return vaccin;
	}
	public void setVaccin(Vaccin vaccin) {
		this.vaccin = vaccin;
	}
	public CarnetVaccin getCarnetvaccin() {
		return carnetvaccin;
	}
	public void setCarnetvaccin(CarnetVaccin carnetvaccin) {
		this.carnetvaccin = carnetvaccin;
	}
	public Vaccination() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vaccination(Date dateVaccin, Vaccin vaccin, CarnetVaccin carnetvaccin) {
		super();
		this.dateVaccin = dateVaccin;
		this.vaccin = vaccin;
		this.carnetvaccin = carnetvaccin;
	}
	
	
}
