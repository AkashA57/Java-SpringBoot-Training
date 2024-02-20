package database;

import java.sql.Connection;
import java.sql.DriverManager;
//import com.mysql.jdbc.PreparedStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectOperation {

	static String dbURL = "jdbc:mysql://localhost:3306/firstdb";
	static String username = "root";
	static String password = "root1234";
	static Connection conn = null;

	public static void main(String[] args) {

		try {

			// Register or Load the Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Creating connection
			conn = DriverManager.getConnection(dbURL, username, password);// if we write here Connection conn then
																			// itwill be a local variable
			if (conn != null) {
				System.out.println("Connected");

				// creating statement
				PreparedStatement ps = conn.prepareStatement("select * from student where id=?");
				ps.setInt(1, 1);

				// execute query
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {

				System.out.println(rs.getString("id") + " " + rs.getString("first_name")); 

					//System.out.println(rs.getString(1) + "   " + rs.getString(2) + " " + rs.getString(3) + " "
							//+ rs.getString(4) + " " + rs.getString(5));

				}

			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				conn.close();

			} catch (SQLException e) {
				// e.printStackTrace();
				System.out.println("problem in closing connection");
			}

		}
	}

}
