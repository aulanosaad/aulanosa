package test.conection.expediente;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import dao.AlumnoDAO;
import dao.ExpedienteDAO;
import modelo.Alumno;
import modelo.Expediente;

public class MainExpediente {

	public static void main(String[] args) {
		Expediente expediente = new Expediente();
		ExpedienteDAO expedienteDAO = new ExpedienteDAO();
		AlumnoDAO alumnoDAO = new AlumnoDAO();
		
		
		Alumno idAlum = alumnoDAO.findById(new Alumno(), (short) 1);
		expediente.setFecha(new Date());
		expediente.setContido("Hostia al profesor");
		expediente.setIdAlumno(idAlum);
		expedienteDAO.create(expediente);
		
		
//		List<Alumno> resultado = alumnoDAO.getAll(new Alumno());
//		
//		Iterator<Alumno> iterator = resultado.iterator();
//				while(iterator.hasNext()) {
//					System.out.println(iterator.next().toString());
//				}
//		ExpedienteDAO expedienteDAO = new ExpedienteDAO();
//		List<Expediente> resultado2 = expedienteDAO.getAll(new Expediente());
//		
//		Iterator<Expediente> iter2 = resultado2.iterator();
//		while(iter2.hasNext()) {
//			Expediente item = iter2.next();
//			System.out.println(item.toString());
//			System.out.println(item.getIdAlumno().toString());
//		}
		
		
		
		
	}

}
