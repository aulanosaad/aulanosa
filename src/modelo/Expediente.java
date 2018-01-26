package modelo;

import java.util.Date;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class Expediente {
	private Integer id;
	private Date fecha;
	private String contido;
	private Alumno idAlumno;

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

	public Alumno getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(Alumno idAlumno) {
		this.idAlumno = idAlumno;
	}

	@Override
	public String toString() {
		return "Expediente [id=" + id + ", fecha=" + fecha + ", contido=" + contido + ", idAlumno=" + idAlumno + "]";
	}

}