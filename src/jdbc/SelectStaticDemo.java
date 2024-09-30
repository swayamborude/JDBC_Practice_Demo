package src.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectStaticDemo {
	
	public static void main(String[] args) throws Exception {
		// Print the only male employee name and salary
		Connection con = MySQLdbConncetion.getMySQLdbConncetion();
		
		String query = "select ename,salary from jdbcemployee where gender like 'm'";
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
			System.out.println(rs.getString("ename") + " " + rs.getInt("salary"));
		}
		
		rs.close();
		st.close();
		con.close();
		
	}

}
