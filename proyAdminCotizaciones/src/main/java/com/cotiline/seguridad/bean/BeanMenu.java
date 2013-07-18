/**
 * proyAdminCotizaciones 
 * BeanMenu.java
 */
package com.cotiline.seguridad.bean;

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
@Table(name="menu")
public class BeanMenu implements Serializable{

	private static final long serialVersionUID = -4055180735028574743L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	private Integer idMenu;
	@Column(name= "nombre")
	private String nomMenu;
	@Column(name= "url")
	private String urlMenu;
	@Column(name= "icono")
	private String iconoMenu;
	@Column(name= "tipo_menu")
	private Integer tipoMenu;
	@Column(name= "id_submenu")
	private Integer idSubMenu; 
	private Integer orden;
	private Integer iniciofin;
	
	
	public Integer getIniciofin() {
		return iniciofin;
	}
	public void setIniciofin(Integer iniciofin) {
		this.iniciofin = iniciofin;
	}
	public Integer getOrden() {
		return orden;
	}
	public void setOrden(Integer orden) {
		this.orden = orden;
	}
	public Integer getIdMenu() {
		return idMenu;
	}
	public void setIdMenu(Integer idMenu) {
		this.idMenu = idMenu;
	}
	public String getNomMenu() {
		return nomMenu;
	}
	public void setNomMenu(String nomMenu) {
		this.nomMenu = nomMenu;
	}
	public String getUrlMenu() {
		return urlMenu;
	}
	public void setUrlMenu(String urlMenu) {
		this.urlMenu = urlMenu;
	}
	public String getIconoMenu() {
		return iconoMenu;
	}
	public void setIconoMenu(String iconoMenu) {
		this.iconoMenu = iconoMenu;
	}
	public Integer getTipoMenu() {
		return tipoMenu;
	}
	public void setTipoMenu(Integer tipoMenu) {
		this.tipoMenu = tipoMenu;
	}
	public Integer getIdSubMenu() {
		return idSubMenu;
	}
	public void setIdSubMenu(Integer idSubMenu) {
		this.idSubMenu = idSubMenu;
	}
	
	
	
	
	
	

}
