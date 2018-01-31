package modelo;

public class DatosPersonales {
	private int id;
  	private String telf;
 	private int idAlumno;
  	private Alumno alumno;
  	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTelf() {
		return telf;
	}
	public void setTelf(String telf) {
		this.telf = telf;
	}
	public int getIdAlumno() {
		return idAlumno;
	}
	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	@Override
	public String toString() {
		return "DatosPersonales [id=" + id + ", telf=" + telf + ", idAlumno=" + idAlumno + ", alumno=" + alumno + "]";
	}
 	

}
