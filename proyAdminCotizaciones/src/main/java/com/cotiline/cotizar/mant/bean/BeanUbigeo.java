/**
 * proyAdminCotizaciones 
 * BeanUbigeo.java
 */
package com.cotiline.cotizar.mant.bean;

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
@Table(name="ubigeo")
public class BeanUbigeo implements Serializable {
	
	 
	private static final long serialVersionUID = 497822127456482652L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	private Integer idUbigeo;
	@Column(name= "id_departamento")
	private String idDepartamento;
	@Column(name= "id_provincia")
	private String idProvincia;
	@Column(name= "id_distrito")
	private String idDistrito;
	private String nombre;
	
	@OneToMany(mappedBy="ubigeo")
	private List<BeanCliente> cliente;
	@OneToMany(mappedBy="ubigeo")
	private List<BeanProveedor> proveedor;
	
	
	
	public List<BeanProveedor> getProveedor() {
		return proveedor;
	}
	public void setProveedor(List<BeanProveedor> proveedor) {
		this.proveedor = proveedor;
	}
	public List<BeanCliente> getCliente() {
		return cliente;
	}
	public void setCliente(List<BeanCliente> cliente) {
		this.cliente = cliente;
	}
	public Integer getIdUbigeo() {
		return idUbigeo;
	}
	public void setIdUbigeo(Integer idUbigeo) {
		this.idUbigeo = idUbigeo;
	}
	public String getIdDepartamento() {
		return idDepartamento;
	}
	public void setIdDepartamento(String idDepartamento) {
		this.idDepartamento = idDepartamento;
	}
	public String getIdProvincia() {
		return idProvincia;
	}
	public void setIdProvincia(String idProvincia) {
		this.idProvincia = idProvincia;
	}
	public String getIdDistrito() {
		return idDistrito;
	}
	public void setIdDistrito(String idDistrito) {
		this.idDistrito = idDistrito;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
	

}
