package src.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class SelectDynamicDemo {
	
	public static void main(String[] args) throws Exception {
		
		Connection con = MySQLdbConncetion.getMySQLdbConncetion();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Workmode:");
		String mode = sc.next();
		
		String query = "select count(*) from jdbcemployee where workmode=?";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setString(1, mode);
		
		int rows = ps.executeUpdate();
		System.out.println("Number of Employee Working from Home is: " + rows);
		
		ps.close();
		con.close();
		sc.close();
	}

}
