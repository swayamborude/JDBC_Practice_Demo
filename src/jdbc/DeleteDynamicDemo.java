package src.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteDynamicDemo {
	
	public static void main(String[] args) throws Exception {
		
		Connection con = MySQLdbConncetion.getMySQLdbConncetion();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Eno:");
		int eno = sc.nextInt();
	
		String query = "delete from jdbcemployee where eno=?";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, eno);
		
		int rows = ps.executeUpdate();
		System.out.println(rows + " record Deleted");
		
		ps.close();
		con.close();
		sc.close();
		
	}

}
