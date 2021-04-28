package br.com.fiap.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.model.User;
import br.com.fiap.util.EntityManagerFacade;

public class UserDAO {
	
	private EntityManager manager = EntityManagerFacade.getEntityManager();

	public void save(User user) {
		manager.getTransaction().begin();
		manager.persist(user);
		manager.getTransaction().commit();
		
		manager.clear();
		
	}

	public List<User> getAll() {
		String jpql = "SELECT u FROM User u";
		TypedQuery<User> query = manager.createQuery(jpql, User.class);
		return query.getResultList();
		
	}

}
