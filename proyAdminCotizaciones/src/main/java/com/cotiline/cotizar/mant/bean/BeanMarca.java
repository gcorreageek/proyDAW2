/**
 * proyAdminCotizaciones 
 * BeanMarca.java
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
@Table(name="marca")
public class BeanMarca implements Serializable {
 
	private static final long serialVersionUID = 1370618474470876312L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	private Integer idMarca;
	@Column(name= "nombre")
	private String nomMarca;
	
//	@OneToMany(mappedBy="cargos")
//	private List<BeanUsuario> usuarios;
	
	public Integer getIdMarca() {
		return idMarca;
	}
	public void setIdMarca(Integer idMarca) {
		this.idMarca = idMarca;
	}
	public String getNomMarca() {
		return nomMarca;
	}
	public void setNomMarca(String nomMarca) {
		this.nomMarca = nomMarca;
	}

}
