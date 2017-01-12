package service;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.spi.resource.Singleton;

import entities.*;
import model.ILibraryCore;
import model.LibraryCore;

@Singleton
@Path("/library")
public class RESTLibraryService {
	@EJB
	private ILibraryCore core;
	
	public RESTLibraryService() {
		core = new LibraryCore();
		core.dataDemo();
	}
	
	@GET
	@Path("/authors")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Author> listAuthor(){
		return core.listAuthor();
	}
	
	@POST
	@Path("/authors")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Author addAuthor(Author a){
		return core.addAuthor(a);
	}
	
	@GET
	@Path("/authors/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Author getAuthor(@PathParam(value="id") Long id){
		return core.getAuthor(id);
	}
	
	@PUT
	@Path("/authors")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Author updateAuthor(Author a){
		return core.updateAuthor(a);
	}
	
	@DELETE
	@Path("/authors/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public boolean deleteAuthor(@PathParam(value="id") Long id){
		return core.deleteAuthor(id);
	}
	
	@GET
	@Path("/books")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Book> listBook(){
		return core.listBook();
	}
	
	@GET
	@Path("/books/categories/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Book> listBookByCat(@PathParam(value="id") Long id){
		return core.listBookByCat(id);
	}
	
	@GET
	@Path("/books/authors/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Book> listBookByAut(@PathParam(value="id") Long id){
		return core.listBookByAut(id);
	}
	
	@POST
	@Path("/books")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Book addBook(Book b){
		return core.addBook(b);
	}
	
	@GET
	@Path("/books/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Book getBook(@PathParam(value="id") Long id){
		return core.getBook(id);
	}
	
	@PUT
	@Path("/books")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Book updateBook(Book b){
		return core.updateBook(b);
	}
	
	@DELETE
	@Path("/books/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public boolean deleteBook(@PathParam(value="id") Long id){
		return core.deleteBook(id);
	}
	
	@GET
	@Path("/categories")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Category> listCategory(){
		return core.listCategory();
	}
	
	@POST
	@Path("/categories")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Category addCategory(Category c){
		return core.addCategory(c);
	}
	
	@GET
	@Path("/categories/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Category getCategory(@PathParam(value="id") Long id){
		return core.getCategory(id);
	}
	
	@PUT
	@Path("/categories")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Category updateCategory(Category c){
		return core.updateCategory(c);
	}
	
	@DELETE
	@Path("/categories/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public boolean deleteCategory(@PathParam(value="id") Long id){
		return core.deleteCategory(id);
	}

	@GET
	@Path("/loans")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Loan> listLoan(){
		return core.listLoan();
	}
	
	@POST
	@Path("/loans")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Loan addLoan(Loan l){
		return core.addLoan(l);
	}
	
	@GET
	@Path("/loans/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Loan getLoan(@PathParam(value="id") Long id){
		return core.getLoan(id);
	}
	
	@PUT
	@Path("/loans")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Loan updateLoan(Loan l){
		return core.updateLoan(l);
	}
	
	@DELETE
	@Path("/loans/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public boolean deleteLoan(@PathParam(value="id") Long id){
		return core.deleteLoan(id);
	}

	@GET
	@Path("/users")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<User> listUser(){
		return core.listUser();
	}

	@POST
	@Path("/users")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public User addUser(User u){
		return core.addUser(u);
	}
	
	@GET
	@Path("/users/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public User getUser(@PathParam(value="id") Long id){
		return core.getUser(id);
	}
	
	@PUT
	@Path("/users")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public User updateUser(User u){
		return core.updateUser(u);
	}
	
	@DELETE
	@Path("/users/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public boolean deleteUser(@PathParam(value="id") Long id){
		return core.deleteUser(id);
	}

}
