package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import com.mysql.jdbc.PreparedStatement;
import java.sql.PreparedStatement;

public class Insert {

	static String dbURL = "jdbc:mysql://localhost:3306/firstdb";
	static String username = "root";
	static String password = "root1234";
	static Connection conn = null;

	public static void main(String[] args) {
		try {
            //load the driver
			Class.forName("com.mysql.jdbc.Driver");
			 
            //connection
            conn = DriverManager.getConnection(dbURL, username, password);//if we write here Connection conn then itwill be a local variable
			if (conn != null) {
			System.out.println("Connected");
			
			     //create statement
				PreparedStatement ps=conn.prepareStatement("insert into student values(?,?,?,?,?)");
			
				ps.setInt(1,1);
				ps.setString(2,"Md");
				ps.setString(3,"Rezwan");
				ps.setString(4,"Khan");
				ps.setString(5,"nk@gmail");
				
				//execute query
				int i=ps.executeUpdate();
				
				
				if(i>0){
					System.out.println("successfully inserted");
				}	
								
			}
		} catch (Exception ex) {
			ex.printStackTrace();
					
		} 
		
		
		finally {
			try {
				conn.close();
				
			} catch (SQLException e) {
				//e.printStackTrace();
				System.out.println("problem in closing connection");
			}

		}
	}

}
