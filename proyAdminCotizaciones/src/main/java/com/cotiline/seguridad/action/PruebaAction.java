/**
 * proyAdminCotizaciones 
 * PruebaAction.java
 */
package com.cotiline.seguridad.action;

import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.cotiline.seguridad.bean.BeanCargo;
import com.cotiline.seguridad.bean.BeanMenu;
import com.cotiline.seguridad.bean.BeanUsuario;

/**
 * @author Gustavo A. Correa C.
 * gcorreageek@gmail.com  
 */
@ManagedBean
//
public class PruebaAction {

	BeanUsuario beanUsuario;
	/**
	 * 
	 */
	public PruebaAction() {
		prueba();
		
	}
	
	public String prueba(){
		Map<String, Object>	lasesionPrueba= FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		BeanUsuario usuario = (BeanUsuario) lasesionPrueba.get("s_usuario");
		List<BeanMenu> menu = (List<BeanMenu>) lasesionPrueba.get("s_listaopciones");
		BeanCargo cargo = (BeanCargo) lasesionPrueba.get("s_cargo");
		beanUsuario=  usuario;
		System.out.println("BeanUsuario::"+usuario.getNombres()+"|"+usuario.getCorreo());
		System.out.println("BeanMenu::"+menu.get(0).getIdMenu()+"|"+menu.get(0).getNomMenu());
		System.out.println("BeanCargo::"+cargo.getIdCargo()+"|"+cargo.getNomCargo());
		
		return null;
	}

	public BeanUsuario getBeanUsuario() {
		return beanUsuario;
	}

	public void setBeanUsuario(BeanUsuario beanUsuario) {
		this.beanUsuario = beanUsuario;
	}
	
	
	
	
}
