package staticSqlprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insertingValues {

	public static void main(String[] args) {
		
		try {
			  //load and register driver
			   Class.forName("org.postgresql.Driver");
			
			   //establish connection
			   Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb", "postgres", "Ab2012@Anna");
			
			   System.out.println("Connection Establish");
			   
			   //create statement using Statement inteface--acts like vehicle carry sql queries from java to db
			   
			   Statement st = con.createStatement();
			   
			   
			   //execute query
			   
			   st.execute("insert into users(userid,name,age) values(3,'Akku',21)");
			   System.out.println("user detailes inserted");
			   
			   //no result processs
			   
			   //close
			   
			   con.close();
		
		}
		catch(Exception e) {
			System.out.print(e);
		}

	}

}





/*
 * execute()---preffered for ddl give boolean type output
 * 
 * executeUpdate()---for dml-udate,delete,insert give int type output
 * 
 * executeQuery()--for select query give resultset type output which is interface
 * 
 * */
