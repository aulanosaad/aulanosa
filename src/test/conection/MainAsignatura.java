package test.conection;

 
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import modelo.Asignatura;


public class MainAsignatura {
	public static void main(String[] args) {
		//leemos el fichero de configuracion
		Configuration cfg = new Configuration().configure();
		
		//creamos la factoria
		SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
		
		//abrimos una sesion
		Session session = sessionFactory.openSession();
		
		//completar con la query
		Query consulta = session.createQuery(" from Asignatura ");
		List<Asignatura> resultado = consulta.list();
		
		for (int x = 0; x < resultado.size(); x++) {
			
			System.out.println(""+resultado.get(x).toString());
		}
			
		//cerramos sesion
		session.close();
		System.out.println("FIN");

	}
}