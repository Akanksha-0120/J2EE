package staticSqlprograms;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public class UpdatingValues {
   public static void main(String[] args) {
	   try{
	        Class.forName("org.postgresql.Driver");
	      
	        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb","postgres","Ab2012@Anna");
	        
	        Statement st =con.createStatement();
	        
	        int rows=st.executeUpdate("update users set name='Akanksha  Bharti' where userid=3");
	        
	        if(rows==0) {
	        	System.out.println("Updation failed! User id does not exist.");
	        }
	        
	        else {
	        	System.out.println(rows+" user details updated");
	        }
	        con.close();
	   }
	   catch(Exception e) {
		   System.out.println(e);
	   }   
	   
   }
}
