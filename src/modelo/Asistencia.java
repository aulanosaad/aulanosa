package modelo;

import java.util.Date;

public class Asistencia {
	private Integer id;
	private Date fecha;
	private Boolean asiste;
	private Alumno alumno;
	
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
	public Boolean getAsiste() {
		return asiste;
	}
	public void setAsiste(Boolean asiste) {
		this.asiste = asiste;
	}
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	@Override
	public String toString() {
		return "Asistencia [id=" + id + ", fecha=" + fecha + ", asiste=" + asiste + "]";
	}
	
	
	
	
	

}
