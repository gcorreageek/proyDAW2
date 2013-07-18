package com.cotiline.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cotiline.cotizar.mant.dao.ClienteDAO;
import com.cotiline.cotizar.mant.dao.ClienteDAOImpl;
import com.cotiline.cotizar.mant.dao.MarcaDAO;
import com.cotiline.cotizar.mant.dao.MarcaDAOImpl;
import com.cotiline.cotizar.mant.dao.ProductoDAO;
import com.cotiline.cotizar.mant.dao.ProductoDAOImpl;
import com.cotiline.cotizar.mant.dao.ProveedorDAO;
import com.cotiline.cotizar.mant.dao.ProveedorDAOImpl;
import com.cotiline.cotizar.mant.dao.UMedidaDAO;
import com.cotiline.cotizar.mant.dao.UMedidaDAOImpl;
import com.cotiline.cotizar.transaccion.dao.TranProductoMarcaDAO;
import com.cotiline.cotizar.transaccion.dao.TranProductoMarcaDAOImpl;
import com.cotiline.cotizar.transaccion.dao.TranProductoMarcaUmedDAO;
import com.cotiline.cotizar.transaccion.dao.TranProductoMarcaUmedDAOImpl;
import com.cotiline.cotizar.transaccion.dao.TranProductoPrecioDAO;
import com.cotiline.cotizar.transaccion.dao.TranProductoPrecioDAOImpl;
import com.cotiline.seguridad.dao.CargoDAO;
import com.cotiline.seguridad.dao.CargoDAOImpl;
import com.cotiline.seguridad.dao.MenuDAO;
import com.cotiline.seguridad.dao.MenuDAOImpl;
import com.cotiline.seguridad.dao.UsuarioDAO;
import com.cotiline.seguridad.dao.UsuarioDAOImpl;


public class JPADAOFactory extends DAOFactory {
	private EntityManagerFactory emf;
	
	public JPADAOFactory (){ 
		emf=Persistence.createEntityManagerFactory("JPA-Web");
	} 
	
	@Override
	public UsuarioDAO getUsuarioDAO() {
		UsuarioDAOImpl cd = new UsuarioDAOImpl();
		cd.setEntityManagerFactory(emf);
		return (UsuarioDAO)cd;
	}
 
	@Override
	public CargoDAO getCargoDAO() {
		CargoDAOImpl cd = new CargoDAOImpl();
		cd.setEntityManagerFactory(emf);
		return (CargoDAO)cd;
	}
 
	@Override
	public MenuDAO getMenuDAO() {
		MenuDAOImpl cd = new MenuDAOImpl();
		cd.setEntityManagerFactory(emf);
		return (MenuDAO)cd;
	}
 
	@Override
	public MarcaDAO getMarcaDAO() {
		MarcaDAOImpl cd = new MarcaDAOImpl();
		cd.setEntityManagerFactory(emf);
		return (MarcaDAO)cd;
	}
 
	@Override
	public ProductoDAO getProductoDAO() {
		ProductoDAOImpl cd = new ProductoDAOImpl();
		cd.setEntityManagerFactory(emf);
		return (ProductoDAO)cd;
	}
	
	@Override
	public UMedidaDAO getUMedidaDAO() {
		UMedidaDAOImpl cd = new UMedidaDAOImpl();
		cd.setEntityManagerFactory(emf);
		return (UMedidaDAO)cd;
	} 
 
	@Override
	public ProveedorDAO getProveedorDAO() {
		ProveedorDAOImpl cd = new ProveedorDAOImpl();
		cd.setEntityManagerFactory(emf);
		return (ProveedorDAO)cd;
	}
 
	@Override
	public ClienteDAO getClienteDAO() {
		ClienteDAOImpl cd = new ClienteDAOImpl();
		cd.setEntityManagerFactory(emf);
		return (ClienteDAO)cd;
	}
 
	@Override
	public TranProductoMarcaDAO getTranProductoMarcaDAO() {
		TranProductoMarcaDAOImpl cd = new TranProductoMarcaDAOImpl();
		cd.setEntityManagerFactory(emf);
		return (TranProductoMarcaDAO)cd;
	}
 
	@Override
	public TranProductoMarcaUmedDAO getTranProductoMarcaUmedDAO() {
		TranProductoMarcaUmedDAOImpl cd = new TranProductoMarcaUmedDAOImpl();
		cd.setEntityManagerFactory(emf);
		return (TranProductoMarcaUmedDAO)cd;
	}
 
	@Override
	public TranProductoPrecioDAO getTranProductoPrecioDAO() {
		TranProductoPrecioDAOImpl cd = new TranProductoPrecioDAOImpl();
		cd.setEntityManagerFactory(emf);
		return (TranProductoPrecioDAO)cd;
	}
 
	
 
}
