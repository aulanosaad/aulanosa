package test.conection.datospersonales;

import dao.AlumnoDAO;
import dao.DatosPersonalesDAO;
import modelo.Alumno;
import modelo.DatosPersonales;

public class MainTestDAODatosPersonales {
	
	public static void main(String[] args) {
	
	AlumnoDAO alumnoDAO = new AlumnoDAO();
	Alumno alumno1 = alumnoDAO.findById(new Alumno(), 2);
	DatosPersonales datosPersonales= new DatosPersonales();
 	DatosPersonalesDAO datosDAO= new DatosPersonalesDAO();
	
	datosPersonales.setId(2);
	datosPersonales.setTelf("51515415");
	datosPersonales.setAlumno(alumno1);
	
//	datosPersonales.setIdAlumno(1);
	
	datosDAO.create(datosPersonales);
	
	System.out.println("FIN");

	}
}
