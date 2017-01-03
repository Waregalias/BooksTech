package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import entities.*;

public class LibraryCore implements ILibraryCore {
	private Map<Long, Author> authors = new HashMap<Long, Author>();
	private Map<Long, Book> books = new HashMap<Long, Book>();
	private Map<Long, Category> categories = new HashMap<Long, Category>();
	private Map<Long, Loan> loans = new HashMap<Long, Loan>();
	private Map<Long, User> users = new HashMap<Long, User>();

	public void dataDemo(){
		addAuthor(new Author(1, "about", "nationality"));
		addAuthor(new Author(2, "about2", "nationality2"));
		addAuthor(new Author(3, "about3", "nationality3"));
		addBook(new Book(1, "title", "summary", 5, "3679847811", "livre.jpg", new java.util.Date()));
		addBook(new Book(2, "title2", "summary2", 6, "3679847812", "livre2.jpg", new java.util.Date()));
		addBook(new Book(3, "title3", "summary3", 7, "3679847813", "livre3.jpg", new java.util.Date()));
		addCategory(new Category(1, "category", "description"));
		addCategory(new Category(2, "category2", "description2"));
		addCategory(new Category(3, "category3", "description3"));
		addLoan(new Loan(1, new java.util.Date(), 30));
		addLoan(new Loan(2, new java.util.Date(), 15));
		addLoan(new Loan(3, new java.util.Date(), 15));
		addUser(new User(1, "admin", "password", new java.util.Date()));
		addUser(new User(1, "customer", "customer", new java.util.Date()));
		addUser(new User(1, "assistant", "assistant", new java.util.Date()));
	}	
	
	@Override
	public List<Author> listAuthor() {
		return new ArrayList<Author>(authors.values());
	}

	@Override
	public Author addAuthor(Author a) {
		authors.put(a.getId(), a);		
		return a;
	}

	@Override
	public Author getAuthor(long id) {
		return authors.get(id);
	}

	@Override
	public Author updateAuthor(Author a) {
		authors.put(a.getId(), a);
		return a;
	}

	@Override
	public boolean deleteAuthor(long id) {
		if(authors.get(id)!=null){
			authors.remove(id);
			return true;
		}
		else throw new RuntimeException("Auteur introuvable...");
	}

	@Override
	public List<Book> listBook() {
		return new ArrayList<Book>(books.values());
	}

	@Override
	public Book addBook(Book b) {
		books.put(b.getId(), b);		
		return b;
	}

	@Override
	public Book getBook(long id) {
		return books.get(id);
	}

	@Override
	public Book updateBook(Book b) {
		books.put(b.getId(), b);
		return b;
	}

	@Override
	public boolean deleteBook(long id) {
		if(books.get(id)!=null){
			books.remove(id);
			return true;
		}
		else throw new RuntimeException("Auteur introuvable...");
	}

	@Override
	public List<Category> listCategory() {
		return new ArrayList<Category>(categories.values());
	}

	@Override
	public Category addCategory(Category c) {
		categories.put(c.getId(), c);		
		return c;
	}

	@Override
	public Category getCategory(long id) {
		return categories.get(id);
	}

	@Override
	public Category updateCategory(Category c) {
		categories.put(c.getId(), c);
		return c;
	}

	@Override
	public boolean deleteCategory(long id) {
		if(categories.get(id)!=null){
			categories.remove(id);
			return true;
		}
		else throw new RuntimeException("Auteur introuvable...");
	}

	@Override
	public List<Loan> listLoan() {
		return new ArrayList<Loan>(loans.values());
	}

	@Override
	public Loan addLoan(Loan l) {
		loans.put(l.getId(), l);		
		return l;
	}

	@Override
	public Loan getLoan(long id) {
		return loans.get(id);
	}

	@Override
	public Loan updateLoan(Loan l) {
		loans.put(l.getId(), l);
		return l;
	}

	@Override
	public boolean deleteLoan(long id) {
		if(loans.get(id)!=null){
			loans.remove(id);
			return true;
		}
		else throw new RuntimeException("Auteur introuvable...");
	}

	@Override
	public List<User> listUser() {
		return new ArrayList<User>(users.values());
	}

	@Override
	public User addUser(User u) {
		users.put(u.getId(), u);		
		return u;
	}

	@Override
	public User getUser(long id) {
		return users.get(id);
	}

	@Override
	public User updateUser(User u) {
		users.put(u.getId(), u);
		return u;
	}

	@Override
	public boolean deleteUser(long id) {
		if(users.get(id)!=null){
			users.remove(id);
			return true;
		}
		else throw new RuntimeException("Auteur introuvable...");
	}

}
