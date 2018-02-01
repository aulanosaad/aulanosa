package modelo;

import java.util.Set;

public class Alumno {
	
	private Integer id; 
	private String nome;
	private String email;
	private Set<Asignatura> listaAsignaturas;
	
	
	public Set<Asignatura> getListaAsignaturas() {
		return listaAsignaturas;
	}
	public void setListaAsignaturas(Set<Asignatura> listaAsignaturas) {
		this.listaAsignaturas = listaAsignaturas;
	}
	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nome=" + nome + ", email=" + email + "]";
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	
}
