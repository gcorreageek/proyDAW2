/**
 * proyAdminCotizaciones 
 * CargoDAOImpl.java
 */
package com.cotiline.seguridad.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.cotiline.seguridad.bean.BeanCargo;

/**
 * @author Gustavo A. Correa C.
 * gcorreageek@gmail.com  
 */
public class CargoDAOImpl implements CargoDAO {
	private EntityManagerFactory emf;
	private EntityManager em; 
	/**
	 * @param emf
	 */
	public void setEntityManagerFactory(EntityManagerFactory emf) {
		this.emf = emf;	
	}
	public List<BeanCargo> listar(BeanCargo cargo) {
		// TODO Auto-generated method stub
		return null;
	}
	public BeanCargo registrar(BeanCargo cargo) {
		// TODO Auto-generated method stub
		return null;
	}
	public BeanCargo optenerCargo(Integer idCargo) {
		em = emf.createEntityManager();
		Query q = em.createQuery("SELECT p FROM BeanCargo p WHERE p.idCargo=:ID_CARGO");
		q.setParameter("ID_CARGO",idCargo); 
		if(q.getResultList().isEmpty()){
			return null;
		}
		return (BeanCargo) q.getSingleResult();
	}
	
	

}
