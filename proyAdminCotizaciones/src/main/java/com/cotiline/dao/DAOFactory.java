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


public abstract class DAOFactory {
    
    public static final int MYSQL = 1;
    public static final int ORACLE = 2;
    public static final int DB2 = 3;
    public static final int SQLSERVER = 4;
    public static final int XML = 5;
    public static final int MEMORY = 6;
    public static final int JPA = 7;
    
    // Existirá un método por cada DAO que pueda ser creado.
    // registramos nuestros daos
    public abstract UsuarioDAO getUsuarioDAO(); 
    public abstract CargoDAO getCargoDAO(); 
    public abstract MenuDAO getMenuDAO(); 
    public abstract MarcaDAO getMarcaDAO();
    public abstract ProductoDAO getProductoDAO();
    public abstract UMedidaDAO getUMedidaDAO();
    public abstract ProveedorDAO getProveedorDAO();
    public abstract ClienteDAO getClienteDAO();
    public abstract TranProductoMarcaDAO getTranProductoMarcaDAO();
    public abstract TranProductoMarcaUmedDAO getTranProductoMarcaUmedDAO();
    public abstract TranProductoPrecioDAO getTranProductoPrecioDAO(); 
    public abstract CotizacionDAO getCotizacionDAO();
    public abstract DetalleCotizacionDAO getDetalleCotizacionDAO();
    
    
    public static DAOFactory getDAOFactory(int whichFactory) {
       switch(whichFactory){
      	case MYSQL:
       	    return new MySqlDAOFactory();
/*       	case XML:
       	    return new XmlDAOFactory();
       	case ORACLE:
       	    return new OracleDAOFactory();
       	case DB2:
       	    return new Db2DAOFactory();
       	case SQLSERVER:
       	    return new SqlServerDAOFactory();
       	case XML:
       	    return new XmlDAOFactory(); 
       	case MEMORY:
       	    return new MemoryDAOFactory();*/
    	case JPA:
       	    return new JPADAOFactory();

       	    
       	default:
       	    return null;
       }
    }
    
    
}
