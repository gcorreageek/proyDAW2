/**
 * proyAdminCotizaciones 
 * CargoServiceImpl.java
 */
package com.cotiline.seguridad.service;

import com.cotiline.dao.DAOFactory;
import com.cotiline.seguridad.bean.BeanCargo;
import com.cotiline.seguridad.dao.CargoDAO;

/**
 * @author Gustavo A. Correa C.
 * gcorreageek@gmail.com  
 */
public class CargoServiceImpl implements CargoService {

	private CargoDAO dao;
	private DAOFactory fabrica = null; 
	
	public CargoServiceImpl(int jpa) {
		this.fabrica = DAOFactory.getDAOFactory(jpa);
		this.dao = this.fabrica.getCargoDAO();
	}
 
	public BeanCargo getCargo(Integer idCargo) {
		return dao.optenerCargo(idCargo);
	}

}
