package com.cotiline.dao;

import com.cotiline.cotizar.cotizacion.dao.CotizacionDAO;
import com.cotiline.cotizar.cotizacion.dao.DetalleCotizacionDAO;
import com.cotiline.cotizar.mant.dao.ClienteDAO;
import com.cotiline.cotizar.mant.dao.MarcaDAO;
import com.cotiline.cotizar.mant.dao.ProductoDAO;
import com.cotiline.cotizar.mant.dao.ProveedorDAO;
import com.cotiline.cotizar.mant.dao.UMedidaDAO;
import com.cotiline.cotizar.transaccion.dao.TranProductoMarcaDAO;
import com.cotiline.cotizar.transaccion.dao.TranProductoMarcaUmedDAO;
import com.cotiline.cotizar.transaccion.dao.TranProductoPrecioDAO;
import com.cotiline.seguridad.dao.CargoDAO;
import com.cotiline.seguridad.dao.MenuDAO;
import com.cotiline.seguridad.dao.UsuarioDAO;

//Esta es una fabrica que crea DAOs especificos para  Mysql 
public class MySqlDAOFactory extends DAOFactory {

	@Override
	public UsuarioDAO getUsuarioDAO() {
		// TODO Auto-generated method stub
		return null;
	}
 
	@Override
	public CargoDAO getCargoDAO() {
		// TODO Auto-generated method stub
		return null;
	}
 
	@Override
	public MenuDAO getMenuDAO() {
		// TODO Auto-generated method stub
		return null;
	}
 
	@Override
	public MarcaDAO getMarcaDAO() {
		// TODO Auto-generated method stub
		return null;
	}
 
	@Override
	public ProductoDAO getProductoDAO() {
		// TODO Auto-generated method stub
		return null;
	}
 
	@Override
	public ProveedorDAO getProveedorDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	 
	@Override
	public ClienteDAO getClienteDAO() {
		// TODO Auto-generated method stub
		return null;
	}
 
	@Override
	public TranProductoMarcaDAO getTranProductoMarcaDAO() {
		// TODO Auto-generated method stub
		return null;
	}
 
	@Override
	public TranProductoMarcaUmedDAO getTranProductoMarcaUmedDAO() {
		// TODO Auto-generated method stub
		return null;
	}
 
	@Override
	public TranProductoPrecioDAO getTranProductoPrecioDAO() {
		// TODO Auto-generated method stub
		return null;
	}
 
	@Override
	public UMedidaDAO getUMedidaDAO() {
		// TODO Auto-generated method stub
		return null;
	}
 
	@Override
	public CotizacionDAO getCotizacionDAO() {
		// TODO Auto-generated method stub
		return null;
	}
 
	@Override
	public DetalleCotizacionDAO getDetalleCotizacionDAO() {
		// TODO Auto-generated method stub
		return null;
	}
 
	


}
