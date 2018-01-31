package modelo;

import java.util.Date;

public class Trimestre {

	private int id;
	private String nome;
	private Date fechaInicio;
	private Date fechaFin;
	private Alumno alumno;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	@Override
	public String toString() {
		return "Trimestre [id=" + id + ", nome=" + nome + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin
				+ ", alumno=" + alumno + "]";
	}
	
	
	
}
