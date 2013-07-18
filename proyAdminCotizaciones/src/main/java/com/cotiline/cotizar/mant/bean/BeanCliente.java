/**
 * proyAdminCotizaciones 
 * BeanCliente.java
 */
package com.cotiline.cotizar.mant.bean;

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
@Table(name="cliente")
public class BeanCliente implements Serializable{ 
	private static final long serialVersionUID = -50123108235967378L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	private Integer idCliente;
	@Column(name= "razon_social")
	private String razonSocial;
	@Column(name= "tipo_identificacion")
	private Integer tipoIdentificacion;
	@Column(name= "numero_identificacion")
	private String numeroIndentificacion; 
	private String correo;
	private String telefonos;
	private String direccion; 
	
	@ManyToOne
	@JoinColumn(name="id_ubigeo")  
	private BeanUbigeo ubigeo;
	
	
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public BeanUbigeo getUbigeo() {
		return ubigeo;
	}
	public void setUbigeo(BeanUbigeo ubigeo) {
		this.ubigeo = ubigeo;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public Integer getTipoIdentificacion() {
		return tipoIdentificacion;
	}
	public void setTipoIdentificacion(Integer tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}
	public String getNumeroIndentificacion() {
		return numeroIndentificacion;
	}
	public void setNumeroIndentificacion(String numeroIndentificacion) {
		this.numeroIndentificacion = numeroIndentificacion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefonos() {
		return telefonos;
	}
	public void setTelefonos(String telefonos) {
		this.telefonos = telefonos;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	} 
	
	
	
	
	
	

}
