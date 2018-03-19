package fr.polytech.Dimassa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class DimassaDaoImpl implements IDimassaDao {
	
	@PersistenceContext 
	private EntityManager em;
	

}
 