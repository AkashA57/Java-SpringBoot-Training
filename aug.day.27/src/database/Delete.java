package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import com.mysql.jdbc.PreparedStatement;
import java.sql.PreparedStatement;

public class Delete {

	static String dbURL = "jdbc:mysql://localhost:3306/firstdb";
	static String username = "root";
	static String password = "root1234";
	static Connection conn = null;

	public static void main(String[] args) {
		try {
            Class.forName("com.mysql.jdbc.Driver");
			 conn = DriverManager.getConnection(dbURL, username, password);//if we write here Connection conn then itwill be a local variable
			if (conn != null) {
				System.out.println("Database Connected");
				PreparedStatement ps=conn.prepareStatement("delete from student where id=?" );
						
				ps.setInt(1, 4);
				
				
				int i=ps.executeUpdate();
				if(i>0){
					System.out.println("successfully deleted");
				}	
				else {
					System.out.println("data not found");
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				conn.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("problem in closing connection");
			}

		}
	}

}
