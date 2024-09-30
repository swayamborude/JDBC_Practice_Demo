package src.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class InsertDynamicDemo {
	
	public static void main(String[] args) throws Exception{
		
		Connection con = MySQLdbConncetion.getMySQLdbConncetion();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter eno: ");
		int eno = sc.nextInt();
		System.out.println("Enter ename: ");
		String ename = sc.next();
		System.out.println("Enter gender: ");
		String gender = sc.next();
		System.out.println("Enter age: ");
		String age = sc.next();
		System.out.println("Enter passport: ");
		String passport = sc.next();
		System.out.println("Enter workmode: ");
		String workmode = sc.next();
		System.out.println("Enter salary: ");
		int salary = sc.nextInt();
		
		String query =  "insert into jdbcemployee values (?,?,?,?,?,?,?)";
		
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, eno);
		ps.setString(2, ename);
		ps.setString(3, gender);
		ps.setString(4, age);
		ps.setString(5, passport);
		ps.setString(6, workmode);
		ps.setInt(7, salary);
		
	
//		System.out.println("Enter ename: ");
//		String ename = sc.next();
//		System.out.println("Enter gender: ");
//		String gender = sc.next();
//		System.out.println("Enter age: ");
//		String age = sc.next();
//		System.out.println("Enter passport: ");
//		String passport = sc.next();
//		System.out.println("Enter salary: ");
//		int salary = sc.nextInt();
//		
//		String query =  "insert into jdbcemployee (ename,gender,age,passport,salary) values (?,?,?,?,?)";
//		
//		PreparedStatement ps = con.prepareStatement(query);
//		
//		ps.setString(1, ename);
//		ps.setString(2, gender);
//		ps.setString(3, age);
//		ps.setString(4, passport);
//		ps.setInt(5, salary);
		
		int rows = ps.executeUpdate();
		System.out.println(rows + " Record Inserted");
		
		ps.close();
		con.close();
		sc.close();
	}

}
