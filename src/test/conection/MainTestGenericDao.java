package test.conection;

import java.util.Iterator;
import java.util.List;

import dao.AsistenciaDAO;
import modelo.Asistencia;
 
/**
 * @author Pablo Belay
 * Clase de test para probar as operacions CRUD do GenericDAO
 *
 */
public class MainTestGenericDao {
	
	public static void main(String[] args) {
	/*	AlumnoDAO alumnoDAO  = new AlumnoDAO();
		List<Alumno> resultado = alumnoDAO.getAll(new Alumno());
		
		 Iterator<Alumno> iter = resultado.iterator();
		 while(iter.hasNext()) {
			 System.out.println( iter.next().toString() );
		 }
		 */
			AsistenciaDAO asistenciaDAO  = new AsistenciaDAO();
			List<Asistencia> resultado2 = asistenciaDAO.getAll(new Asistencia());
			
			 Iterator<Asistencia> iter2 = resultado2.iterator();
			 while(iter2.hasNext()) {
				 Asistencia item = iter2.next();
				 System.out.println( item.toString() );
//				 System.out.println( item.getAlumno().toString() );
			 }
		 
		 
		 
//		 
//		 //Test find by ID
//		 Departamento resultado2 = depDao.findById(new Departamento(), new Short((short) 10));
//		 System.out.println(resultado2.toString());
//		 
//		 //Update by id
//		 resultado2.setLocalizacion("Pontevedra");
//		 depDao.update(resultado2);
//		 System.out.println(resultado2.toString());
//		 
//		 //Crear un novo departamento
//		 Departamento depnovo = new Departamento();
//		 depnovo.setId((short)52);
//		 depnovo.setLocalizacion("Coruna ");
//		 depnovo.setNombre("AulaNosa");
//		 depDao.create(depnovo);
//		 
//		 //Borramos o obxecto
//		 depDao.delete(depnovo);
		 
		 //Borar dous
//		 Departamento dept51 = new Departamento((short) 51);
//		 depDao.delete(dept51);
 		 
	}

}
