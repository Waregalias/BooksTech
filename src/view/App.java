package view;

import java.sql.*;

public class App {

	public App() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String [] args) {
		Connection con = null;
		try {
		  con = DriverManager.getConnection("jdbc:derby://localhost:1527/bookstech;create=true;user=user;password=123");
		  Statement sta = con.createStatement(); 
		  sta.executeUpdate("CREATE TABLE author (id INT, about VARCHAR(255)," + " nationality VARCHAR(255))");
		  System.out.println("Table created.");
		  sta.close();
	      con.close();
	    } 
	    catch (Exception e) {
	      System.err.println("Exception: "+e.getMessage());
	    }
  }
}