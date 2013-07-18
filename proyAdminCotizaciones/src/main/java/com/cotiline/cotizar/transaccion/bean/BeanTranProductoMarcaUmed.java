/**
 * proyAdminCotizaciones 
 * BeanTranProductoMarcaUmed.java
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

import com.cotiline.cotizar.mant.bean.BeanUMedida;

/**
 * @author Gustavo A. Correa C.
 * gcorreageek@gmail.com  
 */
@Entity
@Table(name="producto_detalle")
public class BeanTranProductoMarcaUmed implements Serializable{
 
	private static final long serialVersionUID = -604737274704816543L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	private Integer idProductoMarcaUMed;
	@ManyToOne
	@JoinColumn(name="id_producto_marca", referencedColumnName = "id", insertable = true, updatable = false)
	private BeanTranProductoMarca productomarca;
	@ManyToOne
	@JoinColumn(name="id_umedida", referencedColumnName = "id", insertable = true, updatable = false)
	private BeanUMedida umedida;
	
	
	public Integer getIdProductoMarcaUMed() {
		return idProductoMarcaUMed;
	}
	public void setIdProductoMarcaUMed(Integer idProductoMarcaUMed) {
		this.idProductoMarcaUMed = idProductoMarcaUMed;
	}
	public BeanTranProductoMarca getProductomarca() {
		return productomarca;
	}
	public void setProductomarca(BeanTranProductoMarca productomarca) {
		this.productomarca = productomarca;
	}
	public BeanUMedida getUmedida() {
		return umedida;
	}
	public void setUmedida(BeanUMedida umedida) {
		this.umedida = umedida;
	}
	
	
	
	
}
