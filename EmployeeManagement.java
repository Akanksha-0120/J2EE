package jdbc_Practice;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeManagement {
    Scanner sc=new Scanner(System.in);
    
    public Connection getConnection() throws ClassNotFoundException, SQLException{
    	Class.forName("org.postgresql.Driver");
    	
    	Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/employee","postgres","Ab2012@Anna");
    	
    	return con;
    }
    
    public void addEmployee() throws SQLException,ClassNotFoundException{
    	Connection con=getConnection();
    	PreparedStatement ps=con.prepareStatement("insert into employee(empid,name,email,phoneno,salary,designation) values(?,?,?,?,?,?)");
    	
    	System.out.println("Enter Employee Id : ");
		int id=sc.nextInt();
		  
		System.out.println("Enter Employee Name : ");
		String name=sc.next();
		
		System.out.println("Enter Employee Email : ");
		String email=sc.next();
		
		System.out.println("Enter Employee Phone Number : ");
		int phone=sc.nextInt();
		
		System.out.println("Enter Employee Salary : ");
		int  sal=sc.nextInt();
		
		System.out.println("Enter Employee Designation : ");
		String desig=sc.next();
		
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, email);
		ps.setInt(4, phone);
		ps.setInt(5, sal);
		ps.setString(6, desig);
		
		ps.executeUpdate();
		
		System.out.println("Insertion Done");
		
		con.close();
		
    }
    
    public void viewEmp() throws SQLException,ClassNotFoundException{
    	Connection con=getConnection();
    	PreparedStatement ps=con.prepareStatement("select * from employee");
    	ResultSet rs = ps.executeQuery();
    	int count=0;
		
		System.out.println("Employee Details");
		while(rs.next()) {
			System.out.println(rs.getInt("empid")+" "+rs.getString("name")+" "+rs.getString("email")+rs.getInt("phoneno")+rs.getInt("salary")+rs.getString("designation"));
		    count++;
		}
		
		con.close();
    }
    
    public void searchEmpById() throws SQLException,ClassNotFoundException{
    	Connection con=getConnection();
    	PreparedStatement ps=con.prepareStatement("select * from employee where empid=?");
    	
    	System.out.println("Enter Employee Id : ");
    	int id=sc.nextInt();
    	
    	ResultSet rs = ps.executeQuery();
    	
    	System.out.println("Employee Details");
		while(rs.next()) {
			System.out.println(rs.getInt("empid")+" "+rs.getString("name")+" "+rs.getString("email")+rs.getInt("phoneno")+rs.getInt("salary")+rs.getString("designation"));
		    
		}
    	con.close();
    }
    
    public void updateEmp() throws SQLException,ClassNotFoundException{
	   Connection con=getConnection();
  	   PreparedStatement ps=con.prepareStatement("update employee set phoneno=?,salary=?,designation=? where empid=?");
  	  
  	   System.out.println("Enter Employee Id : ");
	   int id=sc.nextInt();
	
	   System.out.println("Enter Employee New Phone Number : ");
	   int phone=sc.nextInt();
	
	   System.out.println("Enter Employee New Salary : ");
	   int  sal=sc.nextInt();
	
	   System.out.println("Enter Employee New Designation : ");
	   String desig=sc.next();
	  
		ps.setInt(1, phone);
		ps.setInt(2, sal);
		ps.setString(3, desig);
		ps.setInt(4, id);
		
		ps.executeUpdate();
		
		System.out.println("Insertion Done");
		
		con.close();
    }
  
     public void deleteEmp() throws SQLException,ClassNotFoundException{
	    Connection con=getConnection();
  	    PreparedStatement ps=con.prepareStatement("delete from employee where empid=?");
  	    
  	    System.out.println("Enter Employee Id : ");
	    int id=sc.nextInt();
	    
	    ps.setInt(1, id);
	    
	    System.out.println("Are you sure? (Y/N):");
	    char choice=sc.next().charAt(0);
	    
	    if(choice=='Y' || choice=='y') {
	    	int rows=ps.executeUpdate();
	    	
	    	if(rows>0) System.out.println("Employee deleted successfully");
	    	else System.out.println("No Employee Found");
	    			
	    }
	    
	    else System.out.println("Deletion cancelled");
    }
     
     public void searchEmpByDesig() throws SQLException,ClassNotFoundException{
    	 Connection con=getConnection();
     	 PreparedStatement ps=con.prepareStatement("select * from employee where designation=?");
     	
     	 System.out.println("Enter Employee New Designation : ");
 	     String desig=sc.next();
 	     
         ResultSet rs = ps.executeQuery();
    	
    	 System.out.println("Employee Details");
		 while(rs.next()) {
			 System.out.println(rs.getInt("empid")+" "+rs.getString("name")+" "+rs.getString("email")+rs.getInt("phoneno")+rs.getInt("salary")+rs.getString("designation"));
		    
		 }
    	 con.close();
     }
     
     public void increaseSalary() throws SQLException,ClassNotFoundException{
    	 Connection con=getConnection();
     	 PreparedStatement ps=con.prepareStatement("update employee set salary=salary + ? where designation=?");
     	 
     	 System.out.println("Enter Employee New Designation : ");
	     String desig=sc.next();
	     
	     System.out.println("Enter Employee bonus : ");
	     int bonus=sc.nextInt();
	      
	     ps.setInt(1, bonus);
	     ps.setString(2, desig);
		
		ps.executeUpdate();
			
		System.out.println("Updation Done");
			
		con.close();
     }
    
}
