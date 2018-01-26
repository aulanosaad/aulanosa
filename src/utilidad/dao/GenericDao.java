package utilidad.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import utilidad.HibernateUtil;

/**
 * @author Pablo Belay Fernández
 * @since 2018
 * @param <T>
 * Clase xenérica do DAO que implementa a interface GenericDAO
 */
public class GenericDao  <T> implements InterfaceDAO<T>{

	@Override
	public T create(T t) {
		Session sesion = HibernateUtil.getSessionFactory().openSession();
		Transaction transacion = sesion.beginTransaction();
		sesion.save(t);
		transacion.commit();
		sesion.close();
		return t;
	}

	@Override
	public void delete(T t) {
		Session sesion = HibernateUtil.getSessionFactory().openSession();
		Transaction transacion = sesion.beginTransaction();
		sesion.delete(t);
		transacion.commit();
		sesion.close();
	}

	@Override
	public T update(T t) {
		 Session sesion = HibernateUtil.getSessionFactory().openSession();
		 Transaction transacion = sesion.beginTransaction();
//		 sesion.update(t);
		 t = (T) sesion.merge(t);
		 transacion.commit();
		 sesion.close();
		 return t;
	}

	@Override
	public T findById(T t, Integer id) {
		// Busca como será findby
		
		    String hql = "from "+t.getClass().getName()+" where id=:id";
		    hql = hql.replace(":id", id.toString());
 		    
		    Session sesion = HibernateUtil.getSessionFactory().openSession();
		    Query consulta = sesion.createQuery(hql);
		    List<T> resultado = consulta.list(); 
		    T elementoBuscado = null;
		    if (resultado != null && !resultado.isEmpty()) {
		    	elementoBuscado = resultado.get(0);
		    }
		    
 		
		return elementoBuscado;
	}

	@Override
	public List<T> getAll(T t) {
		//Completar coa query
 		 Session sesion = HibernateUtil.getSessionFactory().openSession();
		 Query consulta = sesion.createQuery(" from  "+ t.getClass().getName());
		 List<T> resultado = consulta.list(); 
		 sesion.close();
		return resultado;
	}

	
	
	
}
