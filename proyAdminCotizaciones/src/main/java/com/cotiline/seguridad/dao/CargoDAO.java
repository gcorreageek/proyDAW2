/**
 * proyAdminCotizaciones 
 * CargoDAO.java
 */
package com.cotiline.seguridad.dao;

import java.util.List;

import com.cotiline.seguridad.bean.BeanCargo;

/**
 * @author Gustavo A. Correa C.
 * gcorreageek@gmail.com  
 */
public interface CargoDAO {
	
	List<BeanCargo> listar(BeanCargo cargo);
	BeanCargo registrar(BeanCargo cargo);
	BeanCargo optenerCargo(Integer idCargo);

}
