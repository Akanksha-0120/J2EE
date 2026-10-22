package dynamicSqlPrograms;

import java.util.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertingDynamicValues {

	public static void main(String[] args) {
		try {
			//1. load and register driver done
			  Class.forName("org.postgresql.Driver");
			
			  //2.Connection done
			  Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb", "postgres", "Ab2012@Anna");
			
			  //3.Statement Creation
			    //3.1 PreparedStatement used for dynamic sql
			  PreparedStatement ps = con.prepareStatement("insert into users(userid,name,age) values(?,?,?)");
			  
			  //3.2 take input from user
			  
			  Scanner sc=new Scanner(System.in);
			  
			  System.out.println("Enter user Id : ");
			  int id=sc.nextInt();
			  
			  System.out.println("Enter user Name : ");
			  String name=sc.nextLine();
			  
			  System.out.println("Enter user Age : ");
			  int age =sc.nextInt();
			  
			  //3.3 set user given in place of placeholder
			  
			  ps.setInt(1, id);
			  ps.setString(2,name);
			  ps.setInt(3, age);
			  
			  //4 execute query
			  ps.executeUpdate();
			  
			  System.out.println("insertion done");
			  
			  //5 close connection is mandatory
			  con.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
			
		}

	}

}
