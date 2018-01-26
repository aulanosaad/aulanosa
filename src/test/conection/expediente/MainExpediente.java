package test.conection.expediente;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import dao.AlumnoDAO;
import dao.DatosPersonalesDAO;
import dao.ExpedienteDAO;
import modelo.Alumno;
import modelo.DatosPersonales;
import modelo.Expediente;

public class MainExpediente {

	public static void main(String[] args) {
		AlumnoDAO alumnoDAO = new AlumnoDAO();
		Expediente expediente = new Expediente();
		ExpedienteDAO expedienteDAO = new ExpedienteDAO();

		
		Alumno alumno1 = alumnoDAO.findById(new Alumno(), 2);

		expediente.setId(1);
		expediente.setFecha(new Date());
		expediente.setContido("Hostia a Novo");
		expediente.setAlumno(alumno1);
//		expedienteDAO.create(expediente);
//		expedienteDAO.update(expediente);
		expedienteDAO.delete(expediente);

		System.out.println("FIN");
		
		
	List<Expediente> resultado = expedienteDAO.getAll(new Expediente());
		
		
		Iterator<Expediente> iter = resultado.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next().toString());
		}
		
		
		
		
		
	}

}
