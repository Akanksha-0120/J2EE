package dynamicSqlPrograms;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class StoredProcedureDemo {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb", "postgres", "Ab2012@Anna");
			
			//Create a statement using CallableStatement
			
			CallableStatement cs=con.prepareCall("call add_user(12,'Lizy',13)");
			
			cs.execute();
			
			System.out.println("Insertion Done");
			
			con.close();
			
		}
         catch(Exception e) {
        	 e.printStackTrace();
         }
	}

}
