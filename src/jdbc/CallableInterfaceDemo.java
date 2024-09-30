package src.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.Scanner;

public class CallableInterfaceDemo {
    
    public static void main(String[] args) throws Exception {
        
        Connection con = MySQLdbConncetion.getMySQLdbConncetion();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter eno: ");
        int eno = sc.nextInt();
        System.out.println("Enter ename: ");
        String ename = sc.next();
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        System.out.println("Enter gender: ");
        String gender = sc.next();
        System.out.println("Enter passport: ");
        String passport = sc.next();
        System.out.println("Enter workmode: ");
        String workmode = sc.next();
        System.out.println("Enter salary: ");
        String salary = sc.next();
        
        // Corrected the order of parameters
        String query = "{call emppro3 (?,?,?,?,?,?,?,?)}";
        CallableStatement cs = con.prepareCall(query);
        cs.setInt(1, eno);
        cs.setString(2, ename);
        cs.setInt(3, age);
        cs.setString(4, gender);
        cs.setString(5, salary);
        cs.setString(6, workmode);
        cs.setString(7, passport); 
        
        cs.registerOutParameter(8, java.sql.Types.VARCHAR);
        cs.executeUpdate();
        
        String result = cs.getString(8);
        if(result.equals("inserted")) { 
            System.out.println("Record Inserted");
        } else {
            System.out.println("Record Not Inserted");
        }
        
        con.close();
        cs.close();
        sc.close();
    }
}
