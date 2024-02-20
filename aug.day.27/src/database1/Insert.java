package database1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {

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
				String sql="insert into student values(1,'Km','Anu','Adhikari','USA' )";
				//String sql="insert into users values(7,'Km','EI','Bahia','ei@gmail.com')";
				int i=st.executeUpdate(sql);
				if(i>0){
					System.out.println("successfully inserted");
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
