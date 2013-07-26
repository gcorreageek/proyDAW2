/**
 * proyAdminCotizaciones 
 * BeanCotizacionDetalle.java
 */
package com.cotiline.cotizar.cotizacion.bean;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.cotiline.cotizar.transaccion.bean.BeanTranProductoMarcaUmed;
import com.cotiline.cotizar.transaccion.bean.BeanTranProductoPrecio;

/**
 * @author Gustavo A. Correa C.
 * gcorreageek@gmail.com  
 */
@Entity
@Table(name="cliente")
public class BeanCotizacionDetalle {

	private Integer idDetalleCotizacion;
	private Double precio;
	private Integer cantidad;
	private BeanCotizacion cotizacion;
	private BeanTranProductoMarcaUmed productoMarcaUmed;
	private BeanTranProductoPrecio productoPrecio;
	
	
	
	
}
