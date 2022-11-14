package empolyeemanegementsystem;

import java.util.Scanner;

public class EmpolyeeMain {

	  EmpolyeeService service = new EmpolyeeService();
	static boolean ordering = true;
	public static void menu() {
		System.out.println("=============Welcome to Empolyee Manegement System"
				+ "\n 1. Add Empolyee"
				+ "\n 2. View Empolyee"
				+ "\n 3. Update Empolyee"
				+ "\n 4. Delete Empolyee"
				+ "\n 5. View All Employee"
				+ "\n 6. Exist");
	}
	
	
	public static void main(String[] args) {
		EmpolyeeMain empolyeemain = new EmpolyeeMain();
		EmpolyeeService service = new EmpolyeeService();
		empolyeemain.menu();
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:  
				System.out.println("Add Employee");
			    service.addEmp();
			    break;
			case 2: 
				System.out.println("View Employee");
				service.viewEmp();
			case 3:
				System.out.println("Update Employee");
				service.UpdateEmployee();
			case 4:
				System.out.println("Delete Employee");
				service.deleteEmp();
			case 5:
				System.out.println("View All Employee");
				service.viewAllEmp();
				
			default:
			System.out.println("Thank you for Using Application");
			System.out.println(0);
			    }
			}while(ordering);
		        }
	}

