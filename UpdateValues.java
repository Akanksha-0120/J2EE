package dynamicSqlPrograms;

import java.util.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateValues {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb","postgres","Ab2012@Anna");
			
			PreparedStatement ps= con.prepareStatement("update users set name=? where userid=?");
			
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter user Id : ");
			int id=sc.nextInt();
			
			System.out.println("Enter Name : ");
			String name=sc.next();
			
			ps.setString(1, name);
			ps.setInt(2, id);
			
			ps.executeUpdate();
			
			System.out.println("Insertion Done");
			
			con.close();
		}
        catch(Exception e) {
        	System.out.println(e);
        }
	}

}
