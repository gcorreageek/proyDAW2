/**
 * proyAdminCotizaciones 
 * MenuDAOImpl.java
 */
package com.cotiline.seguridad.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.cotiline.seguridad.bean.BeanMenu;

/**
 * @author Gustavo A. Correa C.
 * gcorreageek@gmail.com  
 */
public class MenuDAOImpl implements MenuDAO {
	private EntityManagerFactory emf;
	private EntityManager em; 
	 
	public void setEntityManagerFactory(EntityManagerFactory emf) {
		this.emf=emf;
	}
 
	@SuppressWarnings("unchecked")
	public List<BeanMenu> listarMenuXidCargo(Integer idCargo) {
		em = emf.createEntityManager();
//		Query q = em.createQuery("SELECT p FROM MdcoreProject p");
//		List<MdcoreProject> proyectos = q.getResultList(); 
//		SELECT DISTINCT a FROM Author a INNER JOIN a.books b WHERE b.publisher.name = 'XYZ Press'
		Query q = em.createQuery("SELECT m FROM BeanOpciones p INNER JOIN p.menu m INNER JOIN p.cargo c "
				+ " WHERE c.idCargo=:ID_CARGON ORDER BY m.orden");
		q.setParameter("ID_CARGON",idCargo); 
		if(idCargo==null){
			return null;
		}
		return (List<BeanMenu>) q.getResultList();
	}

}
