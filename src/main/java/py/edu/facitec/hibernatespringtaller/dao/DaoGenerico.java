package py.edu.facitec.hibernatespringtaller.dao;

import java.awt.List;

import javax.persistence.EntityManager;

public abstract class DaoGenerico<T> {

	private Class<T> entityClass;

						//recibe una clase x
	public DaoGenerico(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

	protected abstract EntityManager getEntityManager();

						//metodo para registrar objeto x
	public void insertar (T entity){
						//Convierte el objeto recibido en una sentencia sql
		getEntityManager().persist(entity);
	}

	public void actualizar(T entity){
		getEntityManager().merge(entity);
	}

	public T buscar(Object id){
		return getEntityManager().find(entityClass, id);
	}

	public void guardar(T entity, Object id){

		if (id == null || id == "") {
			insertar(entity);
		} else {

			if (buscar(id) == null) {
				insertar(entity);
			} else {
				actualizar(entity);
			}
		}

	}
	
	
	public void eliminar(T entity){
		
		getEntityManager().remove(getEntityManager().contains(entity)?
				
				entity:getEntityManager().merge(entity)
				
				);
	}
	
	public java.util.List<T> buscarTodos(){
		return getEntityManager().createQuery("from "+entityClass.getSimpleName(), entityClass).getResultList();
		
	}

}//END
