package staticSqlprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchProcessingDemo {

	public static void main(String[] args) {
		try {
			  //load and register driver
			   Class.forName("org.postgresql.Driver");
			
			   //establish connection
			   Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb", "postgres", "Ab2012@Anna");
			
			   System.out.println("Connection Establish");
			   
			   //create statement using Statement inteface
			   
			   Statement st = con.createStatement();
			   
			   //set auto commit to false
			   con.setAutoCommit(false);
			   
			   //add queries to batch
			   st.addBatch("insert into users(userid,name,age) values(6,'Anna',23)");
			   st.addBatch("insert into users(userid,name,age) values(4,'Akanksha',25)");
			   st.addBatch("update users set name='Bharti'where userid=3");
			   
			   //execute the batch
			   st.executeBatch();
			   
			   System.out.println("Batch Execution Done");
			   
			   //commit changes
			   con.commit();
			   
			   //close connection
			   con.close();
			   
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
