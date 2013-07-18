/**
 * proyAdminCotizaciones 
 * UsuarioAction.java
 */
package com.cotiline.seguridad.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
//import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.cotiline.seguridad.bean.BeanCargo;
import com.cotiline.seguridad.bean.BeanMenu;
import com.cotiline.seguridad.bean.BeanUsuario;
import com.cotiline.seguridad.service.ApplicationBusinessDelegate;
import com.cotiline.seguridad.service.CargoService;
import com.cotiline.seguridad.service.MenuService;
import com.cotiline.seguridad.service.UsuarioService;

/**
 * @author Gustavo A. Correa C.
 * gcorreageek@gmail.com  
 */
@RequestScoped
@ManagedBean
//@SessionScoped
public class UsuarioAction {

	ApplicationBusinessDelegate apb = new ApplicationBusinessDelegate();
	UsuarioService usuarioS = apb.getUsuarioService();
	MenuService menuS = apb.getMenuService();
	CargoService cargoS = apb.getCargoService();
	
	private String usuario;
	private String pass;
	private String msje;
	
	Map<String, Object>	laSuperSession;
	BeanCargo bCargo;
	BeanUsuario bUsuario;
	List<BeanMenu> listaMenu;
	 
	public UsuarioAction() {   } 
	
	public String logueo(){
		BeanUsuario bean= usuarioS.getUsuarioXusuario(usuario);
		if(bean!=null){ 
			if(!bean.getPass().equals(pass) || pass.isEmpty()){ 
				setMsje("Contraseña incorrecta");
			}else{ 
				List<BeanMenu> lstMenu = 
				menuS.listaMenusXidCargo(bean.getCargos().getIdCargo());
				for (BeanMenu beanMenu : lstMenu) {
					System.out.println("K Bueno:"+beanMenu.getIdMenu()+"|"+beanMenu.getNomMenu());
				}
				Map<String, Object>	lasesion= FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
				lasesion.put("s_usuario", bean);
				lasesion.put("s_listaopciones", lstMenu);
				lasesion.put("s_cargo", bean.getCargos());		
				laSuperSession=lasesion;
				
				
				return "/jsf/principal.jsf?faces-redirect=true";
			}
		}else{
			setMsje("Usuario incorrecto");
		} 
		return null;	
	}
	
	public String laSession(){
		Map<String, Object>	lasesionPrueba= FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		BeanUsuario usuario = (BeanUsuario) lasesionPrueba.get("s_usuario");
		List<BeanMenu> menu = (List<BeanMenu>) lasesionPrueba.get("s_listaopciones");
		BeanCargo cargo = (BeanCargo) lasesionPrueba.get("s_cargo");
		
		if(cargo==null || usuario==null || menu==null){
			System.out.println("Entra 1");
			return "/jsf/seguridad/login.jsf?faces-redirect=true";
		}else{
			System.out.println("Entra 2");
			bCargo = cargo;
			bUsuario = usuario;
			listaMenu = menu; 
			
			System.out.println("BeanUsuario::"+usuario.getNombres()+"|"+usuario.getCorreo());
			System.out.println("BeanMenu::"+menu.get(0).getIdMenu()+"|"+menu.get(0).getNomMenu());
			System.out.println("BeanCargo::"+cargo.getIdCargo()+"|"+cargo.getNomCargo());	
			return null;
		}
			
		
		
	}
	
	
 
 

	public BeanCargo getbCargo() {
		laSession(); 
		return bCargo;
	}

	public void setbCargo(BeanCargo bCargo) {
		this.bCargo = bCargo;
	}

	public BeanUsuario getbUsuario() {
		laSession(); 
		return bUsuario;
	}

	public void setbUsuario(BeanUsuario bUsuario) {
		this.bUsuario = bUsuario;
	}

	public List<BeanMenu> getListaMenu() {
		laSession(); 
		return listaMenu;
	}

	public void setListaMenu(List<BeanMenu> listaMenu) {
		this.listaMenu = listaMenu;
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
	public String getMsje() {
		return msje;
	}

	public void setMsje(String msje) {
		this.msje = msje;
	}

	public Map<String, Object> getLaSuperSession() {
		return laSuperSession;
	}

	public void setLaSuperSession(Map<String, Object> laSuperSession) {
		this.laSuperSession = laSuperSession;
	}
	
	
	
	
}
