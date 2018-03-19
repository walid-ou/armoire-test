package fr.polytech.Dimassa.entities.Trraitement;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Prise")
public class Prise implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPrise;
	// unite et periode pour dire chaque 8H (periode=8,unite=H) ou chaque 24H...
	private TypeUnitePrise unitePrise;
	private int periodePrise;
	private Date heurPrise;
	private int nombrePrise;
	private Date debutPrise;
	private int dureePrise;
	
	@OneToOne(mappedBy="prise")
	private Medicament medicament;


	
	public Prise(TypeUnitePrise unitePrise, int periodePrise, int nombrePrise,
			Date debutPrise, int dureePrise) {
		super();
		this.unitePrise = unitePrise;
		this.periodePrise = periodePrise;
		this.nombrePrise = nombrePrise;
		this.debutPrise = debutPrise;
		this.dureePrise = dureePrise;
	}


	public Prise(Date heurPrise, int nombrePrise, Date debutPrise,
			int dureePrise) {
		super();
		this.heurPrise = heurPrise;
		this.nombrePrise = nombrePrise;
		this.debutPrise = debutPrise;
		this.dureePrise = dureePrise;
	}


	public Prise() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getIdPrise() {
		return idPrise;
	}


	public void setIdPrise(Long idPrise) {
		this.idPrise = idPrise;
	}


	public TypeUnitePrise getUnitePrise() {
		return unitePrise;
	}


	public void setUnitePrise(TypeUnitePrise unitePrise) {
		this.unitePrise = unitePrise;
	}


	public int getPeriodePrise() {
		return periodePrise;
	}


	public void setPeriodePrise(int periodePrise) {
		this.periodePrise = periodePrise;
	}


	public Date getHeurPrise() {
		return heurPrise;
	}


	public void setHeurPrise(Date heurPrise) {
		this.heurPrise = heurPrise;
	}


	public int getNombrePrise() {
		return nombrePrise;
	}


	public void setNombrePrise(int nombrePrise) {
		this.nombrePrise = nombrePrise;
	}


	public Date getDebutPrise() {
		return debutPrise;
	}


	public void setDebutPrise(Date debutPrise) {
		this.debutPrise = debutPrise;
	}


	public int getDureePrise() {
		return dureePrise;
	}


	public void setDureePrise(int dureePrise) {
		this.dureePrise = dureePrise;
	}


	public Medicament getMedicament() {
		return medicament;
	}


	public void setMedicament(Medicament medicament) {
		this.medicament = medicament;
	}
	
	

}
