import java.sql.Connection;
import java.sql.DriverManager;

public class CP {                     // Connection Class
	
	static Connection conc;
	 public  static Connection createC() {
		 
		try {
		
			// Loading The Driver
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Establishing Connection
			
			String url="jdbc:mysql://localhost:3306/library";
			conc=DriverManager.getConnection(url , "root", "1234");
		} 	
		catch (Exception e) {
			// TODO Auto-generated catch block
			
			System.out.println("Connection Not Established");
		}
		return conc;
	 }
}
