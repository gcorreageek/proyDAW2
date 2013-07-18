/**
 * proyAdminCotizaciones 
 * BeanProducto.java
 */
package com.cotiline.cotizar.mant.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Gustavo A. Correa C.
 * gcorreageek@gmail.com  
 */
@Entity
@Table(name="producto")
public class BeanProducto implements Serializable {
	 
	private static final long serialVersionUID = -3608588886637121999L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	private Integer idProducto;
	@Column(name= "nombre")
	private String nomProducto;
	
//	@OneToMany(mappedBy="cargos")
//	private List<BeanUsuario> usuarios;
	
	public Integer getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}
	public String getNomProducto() {
		return nomProducto;
	}
	public void setNomProducto(String nomProducto) {
		this.nomProducto = nomProducto;
	}  
}
