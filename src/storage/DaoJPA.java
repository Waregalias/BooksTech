package storage;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import model.*;

@Stateless
public class DaoJPA<T> implements Dao<T> {

	@PersistenceContext(name="bookstech")
	private EntityManager em;
	public DaoJPA() {
		System.out.println("=============== OUTPUT Source::JPA ===============");
	}
	
	@Override
	public void insert(T obj) {
		em.persist(obj);
	}
	
	@Override
	public T select(int id) {
		return (T) em.createNamedQuery("produit.Select").setParameter("cle",id).getSingleResult();
	}

	@Override
	public List<T> selectAll() {
		return em.createNamedQuery("produit.All").getResultList();
	}

	@Override
	public void edit(T obj) {
		em.merge(obj);
	}

	@Override
	public void delete(T obj) {
		em.remove(obj);

	}

}