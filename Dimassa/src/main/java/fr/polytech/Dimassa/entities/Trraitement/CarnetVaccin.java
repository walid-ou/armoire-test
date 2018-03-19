package fr.polytech.Dimassa.entities.Trraitement;

import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.OneToMany;

@Entity
@Table(name="CarnetVaccin")
@DiscriminatorValue("CV")
public class CarnetVaccin extends CarnetSante {

	@OneToMany(mappedBy="carnetVaccin")
	private Collection<Vaccin> vaccins;

	public Collection<Vaccin> getVaccins() {
		return vaccins;
	}

	public void setVaccins(Collection<Vaccin> vaccins) {
		this.vaccins = vaccins;
	}
	

}
