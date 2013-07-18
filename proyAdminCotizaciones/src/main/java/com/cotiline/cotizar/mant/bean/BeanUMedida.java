/**
 * proyAdminCotizaciones 
 * BeanUMedida.java
 */
package com.cotiline.cotizar.mant.bean;

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
@Table(name="umedida")
public class BeanUMedida {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	private Integer idUMedida;
	@Column(name= "nombre")
	private String nomUMedida;
//	@OneToMany(mappedBy="cargos")
//	private List<BeanUsuario> usuarios;
	
	public Integer getIdUMedida() {
		return idUMedida;
	}
	public void setIdUMedida(Integer idUMedida) {
		this.idUMedida = idUMedida;
	}
	public String getNomUMedida() {
		return nomUMedida;
	}
	public void setNomUMedida(String nomUMedida) {
		this.nomUMedida = nomUMedida;
	}
	
	
	
	
	
	
}
