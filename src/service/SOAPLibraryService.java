package service;

import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import entities.*;
import model.ILibraryCore;

@WebService
public class SOAPLibraryService {
	@EJB
	private ILibraryCore core;
	
	@WebMethod
	public List<Author> listAuthor(){
		return core.listAuthor();
	}
	
	@WebMethod
	public Author addAuthor(Author a){
		return core.addAuthor(a);
	}
	
	@WebMethod
	public Author getAuthor(@WebParam(name="id") Long id){
		return core.getAuthor(id);
	}
	
	@WebMethod
	public Author updateAuthor(Author a){
		return core.updateAuthor(a);
	}
	
	@WebMethod
	public boolean deleteAuthor(@WebParam(name="id") Long id){
		return core.deleteAuthor(id);
	}
	
	@WebMethod
	public List<Book> listBook(){
		return core.listBook();
	}
	
	@WebMethod
	public List<Book> listBookByCat(@WebParam(name="id") Long id){
		return core.listBookByCat(id);
	}
	
	@WebMethod
	public List<Book> listBookByAut(@WebParam(name="id") Long id){
		return core.listBookByAut(id);
	}
	
	@WebMethod
	public Book addBook(Book b){
		return core.addBook(b);
	}
	
	@WebMethod
	public Book getBook(@WebParam(name="id") Long id){
		return core.getBook(id);
	}
	
	@WebMethod
	public Book updateBook(Book b){
		return core.updateBook(b);
	}
	
	@WebMethod
	public boolean deleteBook(@WebParam(name="id") Long id){
		return core.deleteBook(id);
	}
	
	@WebMethod
	public List<Category> listCategory(){
		return core.listCategory();
	}
	
	@WebMethod
	public Category addCategory(Category c){
		return core.addCategory(c);
	}
	
	@WebMethod
	public Category getCategory(@WebParam(name="id") Long id){
		return core.getCategory(id);
	}
	
	@WebMethod
	public Category updateCategory(Category c){
		return core.updateCategory(c);
	}
	
	@WebMethod
	public boolean deleteCategory(@WebParam(name="id") Long id){
		return core.deleteCategory(id);
	}

	@WebMethod
	public List<Loan> listLoan(){
		return core.listLoan();
	}
	
	@WebMethod
	public Loan addLoan(Loan l){
		return core.addLoan(l);
	}
	
	@WebMethod
	public Loan getLoan(@WebParam(name="id") Long id){
		return core.getLoan(id);
	}
	
	@WebMethod
	public Loan updateLoan(Loan l){
		return core.updateLoan(l);
	}
	
	@WebMethod
	public boolean deleteLoan(@WebParam(name="id") Long id){
		return core.deleteLoan(id);
	}

	@WebMethod
	public List<User> listUser(){
		return core.listUser();
	}

	@WebMethod
	public User addUser(User u){
		return core.addUser(u);
	}
	
	@WebMethod
	public User getUser(@WebParam(name="id") Long id){
		return core.getUser(id);
	}
	
	@WebMethod
	public User updateUser(User u){
		return core.updateUser(u);
	}
	
	@WebMethod
	public boolean deleteUser(@WebParam(name="id") Long id){
		return core.deleteUser(id);
	}
	
}