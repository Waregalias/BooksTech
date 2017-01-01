package model;

import java.util.List;

import entities.*; 

public interface ILibraryCore {

	public List<Author> listAuthor();
	public Author addAuthor(Author a);
	public Author getAuthor(long id);
	public Author updateAuthor(Author a);
	public boolean deleteAuthor(long id);
	
	public List<Book> listBook();
	public Book addBook(Book b);
	public Book getBook(long id);
	public Book updateBook(Book b);
	public boolean deleteBook(long id);
	
	public List<Category> listCategory();
	public Category addCategory(Category c);
	public Category getCategory(long id);
	public Category updateCategory(Category c);
	public boolean deleteCategory(long id);
	
	public List<Loan> listLoan();
	public Loan addLoan(Loan l);
	public Loan getLoan(long id);
	public Loan updateLoan(Loan l);
	public boolean deleteLoan(long id);
	
	public List<User> listUser();
	public User addUser(User u);
	public User getUser(long id);
	public User updateUser(User u);
	public boolean deleteUser(long id);
	
}