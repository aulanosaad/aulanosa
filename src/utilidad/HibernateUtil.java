package utilidad;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static final SessionFactory sessionFactory  = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		//Lee o ficheiro de configuracion hibernate.cfg.xml
		 Configuration cfg = new Configuration().configure(); 
		 
		//Creamos a factoria
		 SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build()) ;
		 return sessionFactory;
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	  
}
