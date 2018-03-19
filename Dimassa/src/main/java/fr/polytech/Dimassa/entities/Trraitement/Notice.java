package fr.polytech.Dimassa.entities.Trraitement;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
 

@Entity
@Table(name="Notice")
public class Notice implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idNotice;
	private String posologie;
	private Modeadministration modeAdministration;
	private String descriptionNotice;
	
	@OneToOne
	private Medicament medicament;

	
	
	public Notice(String posologie, Modeadministration modeAdministration,
			String descriptionNotice) {
		super();
		this.posologie = posologie;
		this.modeAdministration = modeAdministration;
		this.descriptionNotice = descriptionNotice;
	}

	public Notice() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdNotice() {
		return idNotice;
	}

	public void setIdNotice(Long idNotice) {
		this.idNotice = idNotice;
	}

	public String getPosologie() {
		return posologie;
	}

	public void setPosologie(String posologie) {
		this.posologie = posologie;
	}

	public Modeadministration getModeAdministration() {
		return modeAdministration;
	}

	public void setModeAdministration(Modeadministration modeAdministration) {
		this.modeAdministration = modeAdministration;
	}

	public String getDescriptionNotice() {
		return descriptionNotice;
	}

	public void setDescriptionNotice(String descriptionNotice) {
		this.descriptionNotice = descriptionNotice;
	}

	public Medicament getMedicament() {
		return medicament;
	}

	public void setMedicament(Medicament medicament) {
		this.medicament = medicament;
	}
	
	
}
