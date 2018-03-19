package fr.polytech.Dimassa.Metier;

import javax.transaction.Transactional;

import fr.polytech.Dimassa.dao.IDimassaDao;

@Transactional
public class DimassaMetierImpl implements IDimassaMetier{

	private IDimassaDao dao;

	public void setDao(IDimassaDao dao) {
		this.dao = dao;
	}
	
}
