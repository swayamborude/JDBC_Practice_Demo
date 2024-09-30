package src.jdbc;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.Statement;

public class InsertStaticDemo {
	
	public static void main(String[] args) throws Exception{
		
//		String drivername = "com.mysql.cj.jdbc.Driver";
//		String dburl = "jdbc:mysql://localhost:3306/swayam";
//		String dbusername = "root";
//		String dbpassword = "Swayam@11";
//		
//		Class.forName(drivername);  // JDBC Driver
//		Connection con = DriverManager.getConnection(dburl,dbusername,dbpassword); // JDBC URL connect to the database
		Connection con = MySQLdbConncetion.getMySQLdbConncetion(); // Connect to the Database
		
		// Insert record
		String query = "insert into jdbcemployee values(1,'Alice','f',28,'D147852','hybrid',800)"; // Static Query
		Statement st = con.createStatement();
		int rows = st.executeUpdate(query);		
		System.out.println(rows + " record Inserted");
		
		st.close();
		con.close();
		
	}
	

}
