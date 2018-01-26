package modelo;

import java.util.List;
import java.util.Set;

public class Asignatura {

	/**
	 * @author Jose Prieto Clase que representa la tabla "Asignatura" Tiene
	 *         correspondecia con el HBM Asignatura.hbm.xml
	 */

	private Integer id;
	private String nome;
	private String codigoexterno;
	private Set<Alumno> listaAlumnos;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigoexterno() {
		return codigoexterno;
	}

	public void setCodigoexterno(String codigoexterno) {
		this.codigoexterno = codigoexterno;
	}

	public Set<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}

	public void setListaAlumnos(Set<Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}

	@Override
	public String toString() {
		return "Asignatura [id=" + id + ", nome=" + nome + ", codigoexterno=" + codigoexterno + ", listaAlumnos="
				+ listaAlumnos + "]";
	}

}

/* Construct */
