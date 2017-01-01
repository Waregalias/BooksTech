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
