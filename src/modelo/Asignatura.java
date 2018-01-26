package modelo;

import java.util.List;

public class Asignatura {

	/**
	 *  @author Jose Prieto
	 *  Clase que representa la tabla "Asignatura"
	 *  Tiene correspondecia con el HBM Asignatura.hbm.xml
	 */
	
	private Short idAsignatura;
	private String nomeAsignatura;
	private String codigoExterno;
	private List <Alumno> listaAlumnos;
	
	/* Construct */
	
	public Asignatura() {
		super();
	}

	/*Getter and Setter*/
	
	public int getIdAsignatura() {
		return idAsignatura;
	}

	public void setIdAsignatura(Short idAsignatura) {
		this.idAsignatura = idAsignatura;
	}

	public String getNomeAsignatura() {
		return nomeAsignatura;
	}

	public void setNomeAsignatura(String nomeAsignatura) {
		this.nomeAsignatura = nomeAsignatura;
	}

	public String getCodigoExterno() {
		return codigoExterno;
	}

	public void setCodigoExterno(String codigoExterno) {
		this.codigoExterno = codigoExterno;
	}

	/* ToString */
	
	@Override
	public String toString() {
		return "Asignatura [idAsignatura=" + idAsignatura + ", nomeAsignatura=" + nomeAsignatura + ", codigoExterno="
				+ codigoExterno + ", listaAlumnos=" + listaAlumnos + "]";
	}
}
