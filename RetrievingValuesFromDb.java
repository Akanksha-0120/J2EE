package staticSqlprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrievingValuesFromDb {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb","postgres","Ab2012@Anna");
			
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery("select * from users");
			
			System.out.println("Users Details");
			while(rs.next()) {
				System.out.println(rs.getInt("userid")+" "+rs.getString("name")+" "+rs.getInt("age"));
			}
			
			con.close();
		}
        catch(Exception e) {
        	System.out.println(e);
        }
	}

}
