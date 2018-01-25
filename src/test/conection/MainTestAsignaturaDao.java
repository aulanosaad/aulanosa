package test.conection;

import java.util.List;

import dao.AsignaturaDAO;
import modelo.Asignatura;

public class MainTestAsignaturaDao {

	public static void main(String[] args) {

		AsignaturaDAO asignaturaDAO = new AsignaturaDAO();
		Asignatura asignatura = new Asignatura();

		List<Asignatura> resultado = asignaturaDAO.getAll(asignatura);

		System.out.println("SIZE "+resultado.size());
//		
		for (int x = 0; x < resultado.size(); x++) {
			System.out.println(resultado.get(x).toString());
		}
	}
}
