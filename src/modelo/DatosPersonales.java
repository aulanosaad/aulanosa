package modelo;

public class DatosPersonales {

	private int id;
	private String telf;
 	private Alumno alumno;
	
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
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
 
	@Override
	public String toString() {
		return "DatosPersonales [id=" + id + ", telf=" + telf   + "]";
	}




	
	
	
	
}
