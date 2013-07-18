/**
 * proyAdminCotizaciones 
 * MenuServiceImpl.java
 */
package com.cotiline.seguridad.service;

import java.util.List;

import com.cotiline.dao.DAOFactory;
import com.cotiline.seguridad.bean.BeanMenu;
import com.cotiline.seguridad.dao.MenuDAO;

/**
 * @author Gustavo A. Correa C.
 * gcorreageek@gmail.com  
 */
public class MenuServiceImpl implements MenuService {
	private MenuDAO dao;
	private DAOFactory fabrica = null; 

	public MenuServiceImpl(int jpa) {
		this.fabrica = DAOFactory.getDAOFactory(jpa);
		this.dao = this.fabrica.getMenuDAO();
	}
 
	public List<BeanMenu> listaMenusXidCargo(Integer idCargo) {
		return dao.listarMenuXidCargo(idCargo);
	}

}
