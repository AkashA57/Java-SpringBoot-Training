package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import com.mysql.jdbc.PreparedStatement;
import java.sql.PreparedStatement;

public class Update {

	static String dbURL = "jdbc:mysql://localhost:3306/firstdb";
	static String username = "root";
	static String password = "root1234";
	static Connection conn = null;

	public static void main(String[] args) {
		try {
            Class.forName("com.mysql.jdbc.Driver");
			 conn = DriverManager.getConnection(dbURL, username, password);//if we write here Connection conn then itwill be a local variable
			if (conn != null) {
				System.out.println("Connected");
				PreparedStatement ps=conn.prepareStatement("UPDATE student SET first_name=?, last_name=? WHERE location=?");
						
				ps.setString(1,"Nicki");
				ps.setString(2,"Pompom");
				ps.setString(3, "Chitwan");
				
				int i=ps.executeUpdate();
				if(i>0){
					System.out.println("successfully updated");
				}	
				else {
					System.out.println("Database not updated");
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				conn.close();
				
			} catch (SQLException e) {
				//e.printStackTrace();
				System.out.println("problem in closing connection");
			}

		}
	}

}
