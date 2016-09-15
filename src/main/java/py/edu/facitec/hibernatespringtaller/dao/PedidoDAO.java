package py.edu.facitec.hibernatespringtaller.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import py.edu.facitec.hibernatespringtaller.model.Pedido;

@Repository
public class PedidoDAO extends DaoGenerico<Pedido> {

	@PersistenceContext
	private EntityManager entityManager;
	
	public PedidoDAO() {
		super(Pedido.class);
		
	}

	@Override
	protected EntityManager getEntityManager() {
		
		return entityManager;
	}
	
	

	
}
