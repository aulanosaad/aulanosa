package test.conection.datospersonales;

import dao.DatosPersonalesDAO;
import modelo.Alumno;
import modelo.DatosPersonales;

public class MainTestDAODatosPersonales {
	
	public static void main(String[] args) {
	
	DatosPersonales datosPersonales= new DatosPersonales();
	Alumno alumno= new Alumno();
	DatosPersonalesDAO datosDAO= new DatosPersonalesDAO();
	
	datosPersonales.setId(100);
	datosPersonales.setTelf("51515415");
	datosPersonales.setIdAlumno(1);
	
	datosDAO.create(datosPersonales);
	
	System.out.println("FIN");

	}
}
