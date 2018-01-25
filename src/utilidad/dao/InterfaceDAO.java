package utilidad.dao;

import java.util.List;

public interface InterfaceDAO<T> {

		/**
		 * @param t
		 * @return T
		 *  Creaci�n dun obxecto
		 */
		public T create(T t);

		/**
		 * @param t
		 * Borrado dun obxecto
		 * 
		 */
		public void delete(T t);

		/**
		 * @param t
		 * @return T
		 * Actualizaci�n dun obxecto
		 */
		public T update(T t);

		/**
		 * @param t
		 * @param id
		 * @return T
		 * Busqueda por ID
		 */
		public T findById(T t, Integer id);
	
		/**
		 * @param t
		 * @return List<T>
		 * Recupera todos os elementos
		 */
		public List<T>  getAll(T t);

}
