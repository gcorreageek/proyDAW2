/**
 * proyAdminCotizaciones 
 * MenuDAO.java
 */
package com.cotiline.seguridad.dao;

import java.util.List;

import com.cotiline.seguridad.bean.BeanMenu;

/**
 * @author Gustavo A. Correa C.
 * gcorreageek@gmail.com  
 */
public interface MenuDAO {

	List<BeanMenu> listarMenuXidCargo(Integer idCargo);
}
