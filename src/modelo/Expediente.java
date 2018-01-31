package modelo;

import java.util.Date;


public class Expediente {
	private Integer id;
	private Date fecha;
	private String contido;
	private Alumno Alumno;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getContido() {
		return contido;
	}
	public void setContido(String contido) {
		this.contido = contido;
	}
	public Alumno getAlumno() {
		return Alumno;
	}
	public void setAlumno(Alumno alumno) {
		Alumno = alumno;
	}
	@Override
	public String toString() {
		return "Expediente [id=" + id + ", fecha=" + fecha + ", contido=" + contido +"]";
	}


	
	
}