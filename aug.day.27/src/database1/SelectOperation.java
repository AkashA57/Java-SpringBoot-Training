package database1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectOperation {

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
				 Statement st=conn.createStatement();//note --no parameter
					String sql="select *from student where id=5";
					
					ResultSet rs=st.executeQuery(sql);
				 while(rs.next()){	     
				        
				     System.out.println(rs.getString("id") + "   " + rs.getString("location") );
					// System.out.println(rs.getString(1) + "   " + rs.getString(2)  );
					
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
