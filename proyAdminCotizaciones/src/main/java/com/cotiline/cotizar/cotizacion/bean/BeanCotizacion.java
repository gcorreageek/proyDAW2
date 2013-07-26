/**
 * proyAdminCotizaciones 
 * BeanCotizacion.java
 */
package com.cotiline.cotizar.cotizacion.bean;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.cotiline.cotizar.mant.bean.BeanCliente;
import com.cotiline.seguridad.bean.BeanUsuario;

/**
 * @author Gustavo A. Correa C.
 * gcorreageek@gmail.com  
 */
@Entity
@Table(name="cotizacion")
public class BeanCotizacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	private Integer idCotizacion;
	@Column(name= "nro_cotizacion")
	private String nroCotizacion;
	@Column(name= "tipo_cotizacion")
	private Integer tipoCotizacion;
	private Date fecha;
	private Integer version;
	private BeanCliente cliente;
	private BeanUsuario usuario;
	
	
	
	
}
