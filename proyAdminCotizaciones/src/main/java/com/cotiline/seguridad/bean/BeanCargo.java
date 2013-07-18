/**
 * proyAdminCotizaciones 
 * BeanCargo.java
 */
package com.cotiline.seguridad.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Gustavo A. Correa C.
 * gcorreageek@gmail.com  
 */
@Entity
@Table(name="cargo")
public class BeanCargo implements Serializable{
 
	private static final long serialVersionUID = -3159079418356015100L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	private Integer idCargo;
	@Column(name= "nombre")
	private String nomCargo;
	
	
	@OneToMany(mappedBy="cargos")
	private List<BeanUsuario> usuarios;
	
	
	
	public List<BeanUsuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(List<BeanUsuario> usuarios) {
		this.usuarios = usuarios;
	}
	public Integer getIdCargo() {
		return idCargo;
	}
	public void setIdCargo(Integer idCargo) {
		this.idCargo = idCargo;
	}
	public String getNomCargo() {
		return nomCargo;
	}
	public void setNomCargo(String nomCargo) {
		this.nomCargo = nomCargo;
	}
 
	
	
	
	
	
}
