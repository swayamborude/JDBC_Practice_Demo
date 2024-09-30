package src.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectStaticEx {
	
	public static void main(String[] args) throws Exception {
		
		Connection con = MySQLdbConncetion.getMySQLdbConncetion();
		
		String query1 = "select * from jdbcemployee where workmode='wfh'";
		String query2 = "select count(*) from jdbcemployee where workmode='wfh'";
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query1);
		
		Statement st1 = con.createStatement();
		ResultSet rs1 = st1.executeQuery(query2);
		
		while(rs.next()) {
			System.out.println(rs.getInt("eno") +" "+ rs.getString("ename") +" " + rs.getString("gender") +" " + rs.getInt("age") +" " + rs.getString("passport") +" " + rs.getString("workmode") +" " + rs.getInt("salary"));
		}
		
		if(rs1.next()) {
			System.out.println("Number of Employee Working from Home is: " + rs1.getInt(1));
		}
		
		st.close();
		con.close();
		rs.close();
		rs1.close();

		
	}

}
