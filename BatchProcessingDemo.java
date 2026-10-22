package dynamicSqlPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class BatchProcessingDemo {

	public static void main(String[] args) {
		
		try {
			//1. load and register driver done
			  Class.forName("org.postgresql.Driver");
			
			  //2.Connection done
			  Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb", "postgres", "Ab2012@Anna");
			
			  con.setAutoCommit(false);	
			  
			  //3.Statement Creation
			    //3.1 PreparedStatement used for dynamic sql
			  PreparedStatement ps = con.prepareStatement("insert into users(userid,name,age) values(?,?,?)");
			  
			  //3.2 take input from user
			  
			  for(int i=0;i<3;i++) {
				  
				Scanner sc=new Scanner(System.in); 
				  
			    System.out.println("Enter user Id : ");
			    int id=sc.nextInt();
			  
			    System.out.println("Enter user Name : ");
			    String name=sc.nextLine();
			  
			    System.out.println("Enter user Age : ");
			    int age =sc.nextInt();
			  
			  //3.3 set user given in place of placeholder
			  
			    ps.setInt(1, id);
			    ps.setString(2,name);
			    ps.setInt(3, age);
			  
			    System.out.println(i+1+" users details updated");
			  
			  }
			  
			  //4 execute query
			  ps.executeBatch();
			  
			  System.out.println("Batch processing done");
			  
			  con.commit();
			  
			
			  con.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}

	}

}
