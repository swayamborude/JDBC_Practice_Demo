package src.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLdbConncetion {
	
	public static Connection getMySQLdbConncetion() throws Exception {
		
		String drivername = "com.mysql.cj.jdbc.Driver";
		String dburl = "jdbc:mysql://localhost:3306/jdbc_data";
		String dbusername = "root";
		String dbpassword = "Swayam@55";
		
		Class.forName(drivername);  // JDBC Driver
		Connection con = DriverManager.getConnection(dburl,dbusername,dbpassword); // JDBC URL connect to the database
		return con;
		
		// The Connection object represents the connection between your Java program and the database.
		// DriverManager.getConnection This method is called to create a connection to the database. It uses the JDBC Driver Manager to establish the connection.
		// jdbc:mysql -  JDBC protocol and mysql database
		// localhost - server where the MySQL database is running
		// 3306 - default port for mysql
		// swayam - name of the database
		// root - This is the username used to authenticate the connection to the database
		// Swayam@11 - This is the password for the root user to authenticate the connection.
	}

}
