package staticSqlprograms;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class EstablishConnection {

	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		//load and register driver
		
		Class.forName("org.postgresql.Driver");
		
		Connection c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb", "postgres", "Ab2012@Anna");
		
		System.out.println("Connection Establish");

	}

}
