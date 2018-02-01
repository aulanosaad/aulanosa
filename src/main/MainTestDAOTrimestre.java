package main;

import java.util.Date;

import dao.AlumnoDAO;
import dao.TrimestreDAO;
import modelo.Alumno;
import modelo.Trimestre;

public class MainTestDAOTrimestre {
	
	public static void main(String[] args) {
	
	Trimestre trimestre= new Trimestre();
	AlumnoDAO alumnoDao= new AlumnoDAO();
	Alumno alumno= alumnoDao.findById( new Alumno(), 5);
	TrimestreDAO trimestreDao= new TrimestreDAO();
	
	alumnoDao.findById(alumno, 5);
	
	trimestre.setId(1);
	trimestre.setNome("Andres");
	trimestre.setFechaInicio(new Date(02-10-2006));
	trimestre.setFechaFin(new Date());
	trimestre.setAlumno(alumno);
	
	trimestreDao.create(trimestre);
	
	System.out.println("FIN");
	
	}
}
