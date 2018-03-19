package fr.polytech.Dimassa.entities.Trraitement;

import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CarnetSante")
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_Carnet",
discriminatorType= DiscriminatorType.STRING, length=4)

public class CarnetSante {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCarnet;
	private String nomCarnet;
	private GroupeSangin groupesangin;
	private Double poid;
	private Double taille;
	private Date dateNaissance;
	
	@ManyToOne
	@JoinColumn(name= "idUtilisateur" )
	private Utilisateur utilisateur;
	
	@OneToMany(mappedBy= "carnet")
	private Collection<Alerte> alertes;
	
	@OneToMany(mappedBy="carnetSante")
	private Collection<Operation> operations;
	
	
	
	public CarnetSante(Date dateNaissance,String nomCarnet, GroupeSangin groupesangin,
			Double poid, Double taille) {
		super();
		this.dateNaissance=dateNaissance;
		this.nomCarnet = nomCarnet;
		this.groupesangin = groupesangin;
		this.poid = poid;
		this.taille = taille;
	}
	public CarnetSante() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public Long getIdCarnet() {
		return idCarnet;
	}
	public void setIdCarnet(Long idCarnet) {
		this.idCarnet = idCarnet;
	}
	public String getNomCarnet() {
		return nomCarnet;
	}
	public void setNomCarnet(String nomCarnet) {
		this.nomCarnet = nomCarnet;
	}
	public GroupeSangin getGroupesangin() {
		return groupesangin;
	}
	public void setGroupesangin(GroupeSangin groupesangin) {
		this.groupesangin = groupesangin;
	}
	public Double getPoid() {
		return poid;
	}
	public void setPoid(Double poid) {
		this.poid = poid;
	}
	public Double getTaille() {
		return taille;
	}
	public void setTaille(Double taille) {
		this.taille = taille;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public Collection<Alerte> getAlertes() {
		return alertes;
	}
	public void setAlertes(Collection<Alerte> alertes) {
		this.alertes = alertes;
	}
	public Collection<Operation> getOperations() {
		return operations;
	}
	public void setOperations(Collection<Operation> operations) {
		this.operations = operations;
	}
	
	

}
