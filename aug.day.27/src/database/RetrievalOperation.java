package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RetrievalOperation {
	static String dbURL = "jdbc:mysql://localhost:3306/firstdb";
	static String username = "root";
	static String password = "root1234";
	static Connection conn = null;
	

	public static void main(String[] args) {
		
		      
			try {
				// Register or Load the Driver class
				Class.forName("com.mysql.jdbc.Driver");
			
				
		try {
			// Creating connection
			conn = DriverManager.getConnection(dbURL, username, password);
			if (conn != null) {
				System.out.println("Connected");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		try {
			// creating statement
			PreparedStatement ps = conn.prepareStatement("select * from student  where id=? ");
			ps.setInt(1, 3);
			
			
			// execute query
			ResultSet rs = ps.executeQuery();
			while(rs.next()){	     
		        
			     System.out.println(rs.getInt("id") + "   " + rs.getString("first_name") + "   " + rs.getString("middle_name")+ "   " + rs.getString("last_name")+ "   " + rs.getString("location"));
				
			     //System.out.println(rs.getString(1) + "   " + rs.getString(2)  );
				
			      }
			
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
			
			
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
			
			finally {
			try {
				//closing the connection
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			}
		
		
		
		
		
		
		
		

	}

}