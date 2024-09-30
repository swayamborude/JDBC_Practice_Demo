package src.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateDynamicDemo {
	
	public static void main(String[] args) throws Exception {
		// Update table from take in
		Connection con = MySQLdbConncetion.getMySQLdbConncetion();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Eno:");
		int row = sc.nextInt();
		System.out.println("Enter New Salary:");
		int newSalary = sc.nextInt();
		System.out.println("Enter New WorkMode:");
		String newMode = sc.next();
		
		String query = "update jdbcemployee set salary=?, workmode=? where eno=?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, newSalary);
		ps.setString(2, newMode);
		ps.setInt(3, row);
		
		int rows = ps.executeUpdate();
		System.out.println(rows + " record Updated");
		
		ps.close();
		con.close();
		sc.close();
		
	}

}
