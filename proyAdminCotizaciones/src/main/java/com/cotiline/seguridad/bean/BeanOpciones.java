/**
 * proyAdminCotizaciones 
 * BeanOpciones.java
 */
package com.cotiline.seguridad.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Gustavo A. Correa C.
 * gcorreageek@gmail.com  
 */
@Entity
@Table(name="opciones")
public class BeanOpciones implements Serializable{

	private static final long serialVersionUID = -7246961684985091371L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	private Integer idOpciones; 
	
	@ManyToOne
	@JoinColumn(name="id_menu", referencedColumnName = "id", insertable = false, updatable = false)
	private BeanMenu menu;
	
	@ManyToOne
	@JoinColumn(name="id_cargo", referencedColumnName = "id", insertable = false, updatable = false)
	private BeanCargo cargo;

	public Integer getIdOpciones() {
		return idOpciones;
	}

	public void setIdOpciones(Integer idOpciones) {
		this.idOpciones = idOpciones;
	}

	 

	public BeanMenu getMenu() {
		return menu;
	}

	public void setMenu(BeanMenu menu) {
		this.menu = menu;
	}

	public BeanCargo getCargo() {
		return cargo;
	}

	public void setCargo(BeanCargo cargo) {
		this.cargo = cargo;
	}
	
	
	
	 

	
	
	
	
	
	
}
