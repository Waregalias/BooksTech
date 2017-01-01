package view;
import java.sql.*;

public class App {

	public App() {
		// TODO Auto-generated constructor stub
	}

  public static void main(String [] args) {
    Connection con = null;
    try {
      con = DriverManager.getConnection("jdbc:derby://localhost:1527/BooksTech;create=true;user=user;password=123");
      Statement sta = con.createStatement(); 
      int count = sta.executeUpdate("CREATE TABLE HY_Address (ID INT, StreetName VARCHAR(20)," + " City VARCHAR(20))");
      System.out.println("Table created.");
      sta.close();        

      con.close();        
    } catch (Exception e) {
      System.err.println("Exception: "+e.getMessage());
    }
  }
}
