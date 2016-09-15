package py.edu.facitec.hibernatespringtaller.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import py.edu.facitec.hibernatespringtaller.model.Cliente;

@Repository//clase encarga de la manipulacion de datos
//posiblilita utilizar posteriormente @Autowired
public class ClienteDAO extends DaoGenerico<Cliente>{


	@PersistenceContext
	private EntityManager manager;

	public ClienteDAO() {
		super(Cliente.class);

	}

	@Override
	protected EntityManager getEntityManager() {

		return manager;
	}


	public void save(Cliente cliente){
		manager.persist(cliente);
	}


}
