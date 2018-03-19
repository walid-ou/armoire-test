package fr.polytech.Dimassa.entities.Trraitement;

import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Traitement")
@DiscriminatorValue("TR")
public class Traitement extends Operation{


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idTraitement;
	private String titreTraitement;
	private String descriptionTraitement;
	private int dureeTraitement; 
	private Date dateDebutTraitement;
	
	@OneToMany(mappedBy="traitement")
	private Collection<Medicament> medicaments;
	
	@OneToOne
	private Pilulier pilulier;
	
	@OneToOne
	private Medecin medecin;
	
	
	
	public Traitement(String titreTraitement, String descriptionTraitement,
			int dureeTraitement, Date dateDebutTraitement) {
		super();
		this.titreTraitement = titreTraitement;
		this.descriptionTraitement = descriptionTraitement;
		this.dureeTraitement = dureeTraitement;
		this.dateDebutTraitement = dateDebutTraitement;
	}
	public Traitement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTitreTraitement() {
		return titreTraitement;
	}
	public void setTitreTraitement(String titreTraitement) {
		this.titreTraitement = titreTraitement;
	}
	public String getDescriptionTraitement() {
		return descriptionTraitement;
	}
	public void setDescriptionTraitement(String descriptionTraitement) {
		this.descriptionTraitement = descriptionTraitement;
	}
	public int getDureeTraitement() {
		return dureeTraitement;
	}
	public void setDureeTraitement(int dureeTraitement) {
		this.dureeTraitement = dureeTraitement;
	}
	public Date getDateDebutTraitement() {
		return dateDebutTraitement;
	}
	public void setDateDebutTraitement(Date dateDebutTraitement) {
		this.dateDebutTraitement = dateDebutTraitement;
	}
	public Collection<Medicament> getMedicaments() {
		return medicaments;
	}
	public void setMedicaments(Collection<Medicament> medicaments) {
		this.medicaments = medicaments;
	}
	public Pilulier getPilulier() {
		return pilulier;
	}
	public void setPilulier(Pilulier pilulier) {
		this.pilulier = pilulier;
	}
	public Medecin getMedecin() {
		return medecin;
	}
	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}
	
	
	
}
