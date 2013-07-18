/**
 * proyAdminCotizaciones 
 * BeanTranProductoPrecio.java
 */
package com.cotiline.cotizar.transaccion.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.cotiline.cotizar.mant.bean.BeanProveedor;


/**
 * @author Gustavo A. Correa C.
 * gcorreageek@gmail.com  
 */
@Entity
@Table(name="producto_proveedor")
public class BeanTranProductoPrecio implements Serializable{
	 
	private static final long serialVersionUID = 2151191680036089829L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	private Integer idProductoPrecio;
	@ManyToOne
	@JoinColumn(name="id_producto_detalle", referencedColumnName = "id", insertable = true, updatable = false)
	private BeanTranProductoMarcaUmed productoMarcaUmed;
	@ManyToOne
	@JoinColumn(name="id_proveedor", referencedColumnName = "id", insertable = true, updatable = false)
	private BeanProveedor proveedor;
	private Double precio;
	@Column(name= "porcentaje_ganancia")
	private Double porcentajeGanancia;
	public Integer getIdProductoPrecio() {
		return idProductoPrecio;
	}
	public void setIdProductoPrecio(Integer idProductoPrecio) {
		this.idProductoPrecio = idProductoPrecio;
	}
	public BeanTranProductoMarcaUmed getProductoMarcaUmed() {
		return productoMarcaUmed;
	}
	public void setProductoMarcaUmed(BeanTranProductoMarcaUmed productoMarcaUmed) {
		this.productoMarcaUmed = productoMarcaUmed;
	}
	public BeanProveedor getProveedor() {
		return proveedor;
	}
	public void setProveedor(BeanProveedor proveedor) {
		this.proveedor = proveedor;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Double getPorcentajeGanancia() {
		return porcentajeGanancia;
	}
	public void setPorcentajeGanancia(Double porcentajeGanancia) {
		this.porcentajeGanancia = porcentajeGanancia;
	}
	
	
	
	
	
	
	
	
	
}
