package dynamicSqlPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeletingValues {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb","postgres","Ab2012@Anna");
			
			PreparedStatement ps= con.prepareStatement("delete from users where name=?");
			
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter Name : ");
			String name=sc.next();
			
			ps.setString(1, name);
			
			
			ps.executeUpdate();
			
			System.out.println("Deletion Done");
			
			con.close();
		}
		 catch(Exception e) {
	        	System.out.println(e);
	      }
	}

}
