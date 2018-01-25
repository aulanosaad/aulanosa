package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import utilidad.HibernateUtil;
import utilidad.dao.GenericDao;
import modelo.Asignatura;

public class AsignaturaDAO extends GenericDao<Asignatura> {
	public List<Asignatura> getAsignaturasOrdenadasPorNombre() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query consulta = session.createQuery(" from Asignatura order by nomeAsignatura ");
		List<Asignatura> resultado = consulta.list();
		session.close();

		return resultado;
	}

}
