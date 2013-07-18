/**
 * proyAdminCotizaciones 
 * UsuarioServiceImpl.java
 */
package com.cotiline.seguridad.service;

import com.cotiline.dao.DAOFactory;
import com.cotiline.seguridad.bean.BeanUsuario;
import com.cotiline.seguridad.dao.UsuarioDAO;

/**
 * @author Gustavo A. Correa C.
 * gcorreageek@gmail.com  
 */
public class UsuarioServiceImpl implements UsuarioService {

	private UsuarioDAO dao;
	private DAOFactory fabrica = null;
	 
	public UsuarioServiceImpl(int jpa) {
		this.fabrica = DAOFactory.getDAOFactory(jpa);
		this.dao = this.fabrica.getUsuarioDAO();
	} 
	public BeanUsuario getUsuarioXusuario(String usuario) {
		return dao.getUsuarioXusuario(usuario);
	}

}
