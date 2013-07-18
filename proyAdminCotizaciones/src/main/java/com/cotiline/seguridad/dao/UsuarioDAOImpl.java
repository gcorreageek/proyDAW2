/**
 * proyAdminCotizaciones 
 * UsuarioDAOImpl.java
 */
package com.cotiline.seguridad.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.cotiline.seguridad.bean.BeanUsuario;

/**
 * @author Gustavo A. Correa C.
 * gcorreageek@gmail.com  
 */
public class UsuarioDAOImpl implements UsuarioDAO {
	private EntityManagerFactory emf;
	private EntityManager em; 
	public void setEntityManagerFactory(EntityManagerFactory emf) {
		this.emf = emf;		
	} 
	public BeanUsuario getUsuarioXusuario(String usuario) {
		em = emf.createEntityManager();
//		Query q = em.createQuery("SELECT p FROM MdcoreProject p");
//		List<MdcoreProject> proyectos = q.getResultList(); 
		Query q = em.createQuery("SELECT p FROM BeanUsuario p WHERE p.usuario=:USUARIO_LOGUEO");
		q.setParameter("USUARIO_LOGUEO",usuario); 
		if(q.getResultList().isEmpty()){
			return null;
		}
		return (BeanUsuario) q.getSingleResult();
	}

}
