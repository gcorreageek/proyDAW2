/**
 * proyAdminCotizaciones 
 * UsuarioDAO.java
 */
package com.cotiline.seguridad.dao;

import com.cotiline.seguridad.bean.BeanUsuario;

/**
 * @author Gustavo A. Correa C.
 * gcorreageek@gmail.com  
 */
public interface UsuarioDAO {
	BeanUsuario getUsuarioXusuario(String usuario);
}
