package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entities.*;

@Stateless(name="library")
public class LibraryCore implements ILibraryCore {
	private Map<Long, Author> authors = new HashMap<Long, Author>();
	private Map<Long, Book> books = new HashMap<Long, Book>();
	private Map<Long, Category> categories = new HashMap<Long, Category>();
	private Map<Long, Loan> loans = new HashMap<Long, Loan>();
	private Map<Long, User> users = new HashMap<Long, User>();
	
//	@PersistenceContext(name="BooksTech")
//	EntityManager em;

	@Override
	public List<Author> listAuthor() {
//		Query req=em.createQuery("select a from DBAUTHOR a");
//		return req.getResultList();
		return new ArrayList<Author>(authors.values());
	}

	@Override
	public Author addAuthor(Author a) {
//		em.persist(a);
		authors.put(a.getId(), a);
		return a;
	}

	@Override
	public Author getAuthor(long id) {
//		Query req=em.createQuery("select a from DBAUTHOR a where a.id =: id");
//		req.setParameter("id", id);
//		return req.getResultList();
		return authors.get(id);
	}

	@Override
	public Author updateAuthor(Author a) {
		authors.put(a.getId(), a);
		return a;
	}

	@Override
	public boolean deleteAuthor(long id) {
//		Author a = em.find(Author.class, id);
//		em.remove(a);
		if (authors.get(id) != null) {
			authors.remove(id);
			return true;
		} else
			throw new RuntimeException("Auteur introuvable...");
	}

	@Override
	public List<Book> listBook() {
//		Query req=em.createQuery("select b from DBBOOK b");
//		return req.getResultList();
		return new ArrayList<Book>(books.values());
	}
	
	@Override
	public List<Book> listBookByCat(long id) {
//		Query req=em.createQuery("select b from DBBOOK b where b.category =: id");
//		req.setParameter("id", id);
//		return req.getResultList();
		List<Book> book = new ArrayList<Book>();
		for(Book b:books.values()){
			
			if(b.getCategory().getId() == id)			
				book.add(b);
		}
		return book;
	}
	
	@Override
	public List<Book> listBookByAut(long id) {
//		Query req=em.createQuery("select b from DBBOOK b where b.author =: id");
//		req.setParameter("id", id);
//		return req.getResultList();
		List<Book> book = new ArrayList<Book>();
		for(Book b:books.values()){
			
			if(b.getAuthor().getId() == id)			
				book.add(b);
		}
		return book;
	}

	@Override
	public Book addBook(Book b) {
//		em.persist(b);
		books.put(b.getId(), b);
		return b;
	}

	@Override
	public Book getBook(long id) {
//		Query req=em.createQuery("select b from DBBOOK b where b.id =: id");
//		req.setParameter("id", id);
//		return req.getResultList();
		return books.get(id);
	}

	@Override
	public Book updateBook(Book b) {
		books.put(b.getId(), b);
		return b;
	}

	@Override
	public boolean deleteBook(long id) {
//		Book b = em.find(Book.class, id);
//		em.remove(b);
		if (books.get(id) != null) {
			books.remove(id);
			return true;
		} else
			throw new RuntimeException("Livre introuvable...");
	}

	@Override
	public List<Category> listCategory() {
//		Query req=em.createQuery("select c from DBCATEGORY c");
//		return req.getResultList();
		return new ArrayList<Category>(categories.values());
	}

	@Override
	public Category addCategory(Category c) {
//		em.persist(c);
		categories.put(c.getId(), c);
		return c;
	}

	@Override
	public Category getCategory(long id) {
//		Query req=em.createQuery("select c from DBCATEGORY c where c.id =: id");
//		req.setParameter("id", id);
//		return req.getResultList();
		return categories.get(id);
	}

	@Override
	public Category updateCategory(Category c) {
		categories.put(c.getId(), c);
		return c;
	}

	@Override
	public boolean deleteCategory(long id) {
//		Category c = em.find(Category.class, id);
//		em.remove(c);
		if (categories.get(id) != null) {
			categories.remove(id);
			return true;
		} else
			throw new RuntimeException("Catégorie introuvable...");
	}

	@Override
	public List<Loan> listLoan() {
//		Query req=em.createQuery("select l from DBLOAN l");
//		return req.getResultList();
		return new ArrayList<Loan>(loans.values());
	}

	@Override
	public Loan addLoan(Loan l) {
//		em.persist(l);
		loans.put(l.getId(), l);
		return l;
	}

	@Override
	public Loan getLoan(long id) {
//		Query req=em.createQuery("select l from DBLOAN l where l.id =: id");
//		req.setParameter("id", id);
//		return req.getResultList();
		return loans.get(id);
	}

	@Override
	public Loan updateLoan(Loan l) {
		loans.put(l.getId(), l);
		return l;
	}

	@Override
	public boolean deleteLoan(long id) {
//		Loan l = em.find(Loan.class, id);
//		em.remove(l);
		if (loans.get(id) != null) {
			loans.remove(id);
			return true;
		} else
			throw new RuntimeException("Prêt introuvable...");
	}

	@Override
	public List<User> listUser() {
//		Query req=em.createQuery("select u from DBUSER u");
//		return req.getResultList();
		return new ArrayList<User>(users.values());
	}

	@Override
	public User addUser(User u) {
//		em.persist(u);
		users.put(u.getId(), u);
		return u;
	}

	@Override
	public User getUser(long id) {
//		Query req=em.createQuery("select u from DBUSER u where u.id =: id");
//		req.setParameter("id", id);
//		return req.getResultList();
		return users.get(id);
	}

	@Override
	public User updateUser(User u) {
		users.put(u.getId(), u);
		return u;
	}

	@Override
	public boolean deleteUser(long id) {
//		User u = em.find(User.class, id);
//		em.remove(u);
		if (users.get(id) != null) {
			users.remove(id);
			return true;
		} else
			throw new RuntimeException("Utilisateur introuvable...");
	}

	public void dataDemo() {
		addAuthor(new Author(1, "lastnameA", "surname", "M", "picture.jpg", "email@ynov.com", new java.util.Date(), "about", "nationality", TypeAuthor.AUTHOR));
		addAuthor(new Author(2, "lastnameA", "surname", "M", "picture.jpg", "email@ynov.com", new java.util.Date(), "about2", "nationality2", TypeAuthor.AUTHOR));
		addAuthor(new Author(3, "lastnameA", "surname", "M", "picture.jpg", "email@ynov.com", new java.util.Date(), "about3", "nationality3", TypeAuthor.AUTHOR));
		addUser(new User(1, "lastnameU", "surname", "M", "picture.jpg", "email@ynov.com", new java.util.Date(), "admin", "password", new java.util.Date(), AccountType.ACTIVE));
		addUser(new User(1, "lastnameU", "surname", "M", "picture.jpg", "email@ynov.com", new java.util.Date(), "customer", "customer", new java.util.Date(), AccountType.BLOCKED));
		addUser(new User(1, "lastnameU", "surname", "M", "picture.jpg", "email@ynov.com", new java.util.Date(), "assistant", "assistant", new java.util.Date(), AccountType.BLOCKED));
		addCategory(new Category(1, "category", "description"));
		addCategory(new Category(2, "category2", "description2"));
		addCategory(new Category(3, "category3", "description3"));
		addBook(new Book(1, "title", "summary", 5, "3679847811", "livre.jpg", new java.util.Date(), getCategory(1), getAuthor(1)));
		addBook(new Book(2, "title2", "summary2", 6, "3679847812", "livre2.jpg", new java.util.Date(), getCategory(1), getAuthor(1)));
		addBook(new Book(3, "title3", "summary3", 7, "3679847813", "livre3.jpg", new java.util.Date(), getCategory(2), getAuthor(3)));
		addLoan(new Loan(1, new java.util.Date(), 30, getBook(1), getUser(1)));
		addLoan(new Loan(2, new java.util.Date(), 15, getBook(2), getUser(1)));
		addLoan(new Loan(3, new java.util.Date(), 15, getBook(3), getUser(2)));
	}

}
