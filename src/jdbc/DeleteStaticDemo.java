package src.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class DeleteStaticDemo {
	
	public static void main(String[] args) throws Exception {
		
		Connection con = MySQLdbConncetion.getMySQLdbConncetion(); // Connect to the Database
		
		// Deleted record where eno=1
		String query = "delete from jdbcemployee where eno=5";
		Statement st = con.createStatement();
		int rows = st.executeUpdate(query);		
		System.out.println(rows + " record Deleted");
		
		st.close();
		con.close();
	}

}
