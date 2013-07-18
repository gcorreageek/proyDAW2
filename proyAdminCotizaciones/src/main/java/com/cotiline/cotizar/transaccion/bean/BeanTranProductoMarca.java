/**
 * proyAdminCotizaciones 
 * BeanTranProductoMarca.java
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

import com.cotiline.cotizar.mant.bean.BeanMarca;
import com.cotiline.cotizar.mant.bean.BeanProducto;

/**
 * @author Gustavo A. Correa C.
 * gcorreageek@gmail.com  
 */
@Entity
@Table(name="producto_marca")
public class BeanTranProductoMarca  implements Serializable{
	private static final long serialVersionUID = -5000029536497207844L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	private Integer idProductoMarca;
	
	@ManyToOne
	@JoinColumn(name="id_producto", referencedColumnName = "id", insertable = true, updatable = false)
	private BeanProducto producto;
	 
	@ManyToOne
	@JoinColumn(name="id_marca", referencedColumnName = "id", insertable = true, updatable = false)
	private BeanMarca marca;

	public Integer getIdProductoMarca() {
		return idProductoMarca;
	}

	public void setIdProductoMarca(Integer idProductoMarca) {
		this.idProductoMarca = idProductoMarca;
	}

	public BeanProducto getProducto() {
		return producto;
	}

	public void setProducto(BeanProducto producto) {
		this.producto = producto;
	}

	public BeanMarca getMarca() {
		return marca;
	}

	public void setMarca(BeanMarca marca) {
		this.marca = marca;
	}
	
	
	
	
	
	
	
	
	
	
}
