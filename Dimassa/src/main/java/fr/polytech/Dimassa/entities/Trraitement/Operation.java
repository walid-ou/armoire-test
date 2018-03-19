package fr.polytech.Dimassa.entities.Trraitement;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.InheritanceType;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_OPERATION",
discriminatorType= DiscriminatorType.STRING)
public class Operation implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idOperation;
	
	
	@ManyToOne
	@JoinColumn(name= "idCarnetSante" )
	private CarnetSante carnetSante;

	public Long getIdOperation() {
		return idOperation;
	}

	public void setIdOperation(Long idOperation) {
		this.idOperation = idOperation;
	}


	public CarnetSante getCarnetSante() {
		return carnetSante;
	}

	public void setCarnetSante(CarnetSante carnetSante) {
		this.carnetSante = carnetSante;
	}

	public Operation() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

}
