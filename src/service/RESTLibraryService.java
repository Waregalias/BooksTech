package service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.spi.resource.Singleton;

import entities.*;
import model.LibraryCore;

@Path("/bibliotheque")
@Singleton
public class RESTLibraryService {
	private LibraryCore core;

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
	
	@GET
	@Path("/authors/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Author getAuthor(@PathParam(value="id") Long id){
		return core.getAuthor(id);
	}
	
	@GET
	@Path("/books")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Book> listBook(){
		return core.listBook();
	}
	
	@GET
	@Path("/categories")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Category> listCategory(){
		return core.listCategory();
	}

	
	@GET
	@Path("/loans")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Loan> listLoan(){
		return core.listLoan();
	}

	@GET
	@Path("/users")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<User> listUser(){
		return core.listUser();
	}


}
