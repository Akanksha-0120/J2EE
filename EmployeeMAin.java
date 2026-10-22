package jdbc_Practice;

import java.util.Scanner;
import java.sql.*;

public class EmployeeMAin {

	public static void main(String[] args) {
		EmployeeManagement emp=new EmployeeManagement();
		
		Scanner sc=new Scanner(System.in);
		boolean running = true;
		
		while (running) {
	            System.out.println("--- EMPLOYEE MANAGEMENT SYSTEM ---");
	            System.out.println("1. Add Employee");
	            System.out.println("2. View All Employees");
	            System.out.println("3. Search Employee by Id");
	            System.out.println("4. Update Employee");
	            System.out.println("5. Delete Employee");
	            System.out.println("6. Search Employee by Designation");
	            System.out.println("7. Exit");
	            System.out.print("Enter your choice: ");
		
		
		   try   {
			 int option=sc.nextInt();
		     switch(option){
			   case 1: emp.addEmployee();
			        System.out.println("Add Employee functionality called.");
                    break;
                    
			   case 2: emp.viewEmp();
			       System.out.println("View Employees functionality called.");
                   break;
			   case 3: emp.searchEmpById();
			       System.out.println("SearchById Employee functionality called.");
                   break;
			   case 4: emp.updateEmp();
			       System.out.println("Update Employee functionality called.");
                   break;
			   case 5: emp.deleteEmp();
			        System.out.println("Delete Employee functionality called.");
                    break;
			   case 6: emp.searchEmpByDesig();
			       System.out.println("SearchByDesignation Employee functionality called.");
                   break;
			   case 7:
                   System.out.println("Exiting application. Goodbye!");
                   running = false;
                   break;
               default:
                   System.out.println("Invalid choice! Please enter a number between 1 and 7.");
		   }
		      
		}
		catch(Exception e1) {
			e1.printStackTrace();
			running=false;
		}	

	}
	sc.close();

 }
}
