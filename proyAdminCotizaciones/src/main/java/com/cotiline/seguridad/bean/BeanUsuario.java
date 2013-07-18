/**
 * proyAdminCotizaciones 
 * Usuario.java
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
@Table(name="usuario")
public class BeanUsuario  implements Serializable{  
	private static final long serialVersionUID = 4883944126175983419L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	private Integer idUsuario;
	private String nombres;
	private String usuario;
	private String pass;
	private String correo;
	@Column(name= "tipo_usuario")
	private String tipoUsuario;
	@Column(name= "id_cliente")
	private Integer idCliente;
	@Column(name= "id_proveedor")
	private Integer idProveedor;
	@ManyToOne
	@JoinColumn(name="id_cargo")  
	private BeanCargo cargos;
//	@Column(name= "idCargo")
//	private Integer idCargo; 
	
	
	
	public Integer getIdUsuario() {
		return idUsuario;
	}


	public BeanCargo getCargos() {
		return cargos;
	}


	public void setCargos(BeanCargo cargos) {
		this.cargos = cargos;
	}


	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public Integer getIdProveedor() {
		return idProveedor;
	}
	public void setIdProveedor(Integer idProveedor) {
		this.idProveedor = idProveedor;
	}
//	public Integer getIdCargo() {
//		return idCargo;
//	}
//	public void setIdCargo(Integer idCargo) {
//		this.idCargo = idCargo;
//	}
	
	
	
	
	
	
}
