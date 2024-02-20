package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RetrieveRecord {

	static String dbURL = "jdbc:mysql://localhost:3306/firstdb";
	static Connection conn=null;
	static String username="root";
	static String password="root1234";
	
	public static void main(String[] args) {
		
		
		try {
			// Register or Load the Driver class
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			// Creating connection
			conn=DriverManager.getConnection(dbURL, username, password);
			
			//creating statement 
			 PreparedStatement	ps = conn.prepareStatement("select * from student where first_name=?");
				ps.setString(1, "Nicki");
				
					
				
				
				//execute the code
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()){	     
		        
			     System.out.println(rs.getInt("id") + "   " + rs.getString("first_name") + "   " + rs.getString("middle_name")+ "   " + rs.getString("last_name")+ "   " + rs.getString("location"));
				
			     //System.out.println(rs.getString(1) + "   " + rs.getString(2)  );
				
			      }
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
	
	}

}
