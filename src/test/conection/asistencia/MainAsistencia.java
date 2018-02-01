package test.conection.asistencia;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import dao.AlumnoDAO;
import dao.AsistenciaDAO;
import dao.ExpedienteDAO;
import modelo.Alumno;
import modelo.Asistencia;
import modelo.Expediente;

public class MainAsistencia {

	public static void main(String[] args) {
		AlumnoDAO alumnoDAO = new AlumnoDAO();
		Asistencia asistencia = new Asistencia();
		AsistenciaDAO asistenciaDAO = new AsistenciaDAO();

		Alumno alumno1 = alumnoDAO.findById(new Alumno(), 2);

		asistencia.setId(1);
		asistencia.setFecha(new Date());
		asistencia.setAsiste(false);
		asistencia.setAlumno(alumno1);

		// crear asistencia
	    // asistenciaDAO.create(asistencia);

		// Actualizar asistencia
		// asistenciaDAO.update(asistencia);

		// borrar asistencia
		 asistenciaDAO.delete(asistencia);

		// Mostrar todo los asistencia
		List<Asistencia> resultado = asistenciaDAO.getAll(new Asistencia());

		Iterator<Asistencia> iter = resultado.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next().toString());
		}

	}

}
