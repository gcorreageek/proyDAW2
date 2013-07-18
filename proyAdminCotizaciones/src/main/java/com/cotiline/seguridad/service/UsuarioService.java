/**
 * proyAdminCotizaciones 
 * UsuarioService.java
 */
package com.cotiline.seguridad.service;

import com.cotiline.seguridad.bean.BeanUsuario;

/**
 * @author Gustavo A. Correa C.
 * gcorreageek@gmail.com  
 */
public interface UsuarioService {

	BeanUsuario getUsuarioXusuario(String usuario);
	
}
