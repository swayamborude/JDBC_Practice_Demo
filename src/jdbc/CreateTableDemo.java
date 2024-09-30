package src.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class CreateTableDemo {
	
	public static void main(String[] args) throws Exception {	

		// Class.forName("com.mysql.cj.jdbc.Driver");  // Driver
		// Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_data","root","Swayam@55"); // JDBC URL connect to the database
		// The Connection object represents the connection between your Java program and the database.
		// DriverManager.getConnection This method is called to create a connection to the database. It uses the JDBC Driver Manager to establish the connection.
		// jdbc:mysql -  JDBC protocol and mysql database
		// localhost - server where the MySQL database is running
		// 3306 - default port for mysql
		// swayam - name of the database
		// root - This is the username used to authenticate the connection to the database
		// Swayam@11 - This is the password for the root user to authenticate the connection.
		
		Connection con = MySQLdbConncetion.getMySQLdbConncetion();
		
		// Creating table using JDBC connection
		String query = "create table jdbcemployee(\r\n"
				+ "eno int(5) primary key auto_increment,\r\n"
				+ "ename varchar(10) not null,\r\n"
				+ "gender varchar(1) not null check(gender in('m','f')),\r\n"
				+ "age int(3) not null check(age>=18),\r\n"
				+ "passport varchar(10) unique,\r\n"
				+ "workmode varchar(10) default 'wfh',\r\n"
				+ "salary int(5) check(salary>0))";
		Statement st = con.createStatement();
		st.execute(query);
		System.out.println("Table Created");
		
		st.close();
		con.close();
		
	}

}
