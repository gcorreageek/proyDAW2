/**
 * proyAdminCotizaciones 
 * MenuService.java
 */
package com.cotiline.seguridad.service;

import java.util.List;

import com.cotiline.seguridad.bean.BeanMenu;

/**
 * @author Gustavo A. Correa C.
 * gcorreageek@gmail.com  
 */
public interface MenuService {

	List<BeanMenu> listaMenusXidCargo(Integer idCargo);
}
