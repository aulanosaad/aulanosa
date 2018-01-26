package utilidad.dao;

import java.util.List;

public interface InterfaceDAO<T> {

		/**
		 * @param t
		 * @return T
		 *  Creación dun obxecto
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
		 * Actualización dun obxecto
		 */
		public T update(T t);

		/**
		 * @param t
		 * @param id
		 * @return T
		 * Busqueda por ID
		 */
<<<<<<< HEAD
<<<<<<< HEAD
		public T findById(T t, Short id);
=======
		public T findById(T t, Integer id);
>>>>>>> refs/remotes/origin/master
=======
		public T findById(T t, Integer id);
>>>>>>> refs/remotes/origin/master
	
		/**
		 * @param t
		 * @return List<T>
		 * Recupera todos os elementos
		 */
		public List<T>  getAll(T t);

}
