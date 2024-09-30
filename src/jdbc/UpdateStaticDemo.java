package src.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class UpdateStaticDemo {
	
	public static void main(String[] args) throws Exception {
		
		Connection con = MySQLdbConncetion.getMySQLdbConncetion();		
		String query = "update jdbcemployee set salary=1000 where ename like 'Ben'";
		
		Statement st = con.createStatement();
		int rows = st.executeUpdate(query);		
		System.out.println(rows + " record Updated");
		
		st.close();
		con.close();
	}

}
