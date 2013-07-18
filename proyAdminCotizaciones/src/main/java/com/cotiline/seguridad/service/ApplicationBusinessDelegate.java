package com.cotiline.seguridad.service;

import com.cotiline.dao.DAOFactory;

public class ApplicationBusinessDelegate {
 
	public UsuarioService getUsuarioService() {
		return new UsuarioServiceImpl( DAOFactory.JPA );
	} 
	public CargoService getCargoService() {
		return new CargoServiceImpl( DAOFactory.JPA );
	} 
	public MenuService getMenuService() {
		return new MenuServiceImpl( DAOFactory.JPA );
	}
}
