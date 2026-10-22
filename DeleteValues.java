package staticSqlprograms;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public class DeleteValues {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb","postgres","Ab2012@Anna");
			
			Statement st=con.createStatement();
			
			int delData = st.executeUpdate("delete from users where age=25");
			
			if(delData==0) {
				System.out.println("Deletion failed! Users not found");
			}
			else {
				System.out.println(delData+" user has been deleted");
			}
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
