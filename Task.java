package staticSqlprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Task {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb","postgres","Ab2012@Anna");
			
			Statement st = con.createStatement();

			
			ResultSet rs = st.executeQuery("select name,age from users where age >=21");
			System.out.println("Users Details");
			while(rs.next()) {
				System.out.println(rs.getString("name")+" - "+rs.getInt("age"));
			}
			
			con.close();
		}
        catch(Exception e) {
        	System.out.println(e);
        }

	}

}
