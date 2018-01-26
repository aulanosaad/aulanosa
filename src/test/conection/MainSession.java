package test.conection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class MainSession {

	public static void main(String[] args) {
		//Lee o ficheiro de configuracion hibernate.cfg.xml
		 Configuration cfg = new Configuration().configure(); 
		 
		//Creamos a factoria
		 SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build()) ;

		 Session sesion =  sessionFactory.openSession();
		 
		 sesion.close();
		 System.out.println("FIN");
		 
<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> refs/remotes/origin/master
=======
		 
>>>>>>> refs/remotes/origin/master
	}

}
