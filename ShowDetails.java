package dynamicSqlPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ShowDetails {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb","postgres","Ab2012@Anna");
			
			PreparedStatement ps= con.prepareStatement("select * from users where age>?");
			
			Scanner sc= new Scanner(System.in);
			
			 System.out.println("Enter user Age : ");
			 int age =sc.nextInt();
			
			ps.setInt(1,age);
			
            ResultSet rs = ps.executeQuery();
			
			System.out.println("Users Details");
			while(rs.next()) {
				System.out.println(rs.getInt("age"));
			}   
		
			
			con.close();
		}
        catch(Exception e) {
        	System.out.println(e);
        }

	}

}
