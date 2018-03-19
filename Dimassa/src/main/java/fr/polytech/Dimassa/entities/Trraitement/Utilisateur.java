package fr.polytech.Dimassa.entities.Trraitement;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import fr.polytech.Dimassa.entities.Armoire.Armoire;


@Entity
@Table(name="Utilisateur")
public class Utilisateur implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idUser;
	private String nomUser;
	private String adressUser;
	private String telUser;
	
	@OneToMany(mappedBy="utilisateur")
	private Collection<Armoire> armoires;
	
	@OneToMany(mappedBy ="utilisateur")
	private Collection<CarnetSante> carnetSantes;
	
	
	
	
	
	
	
	public Utilisateur(String nomUser, String adressUser, String telUser) {
		super();
		this.nomUser = nomUser;
		this.adressUser = adressUser;
		this.telUser = telUser;
	}
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public String getNomUser() {
		return nomUser;
	}
	public void setNomUser(String nomUser) {
		this.nomUser = nomUser;
	}
	public String getAdressUser() {
		return adressUser;
	}
	public void setAdressUser(String adressUser) {
		this.adressUser = adressUser;
	}
	public String getTelUser() {
		return telUser;
	}
	public void setTelUser(String telUser) {
		this.telUser = telUser;
	}
	public Collection<Armoire> getArmoires() {
		return armoires;
	}
	public void setArmoires(Collection<Armoire> armoires) {
		this.armoires = armoires;
	}
	public Collection<CarnetSante> getCarnetSantes() {
		return carnetSantes;
	}
	public void setCarnetSantes(Collection<CarnetSante> carnetSantes) {
		this.carnetSantes = carnetSantes;
	}
	
	
	
}
