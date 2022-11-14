package empolyeemanegementsystem;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

public class EmpolyeeService {
	HashSet<Empolyee> empset = new HashSet<>();
	Empolyee emp1 = new Empolyee(101, "Amod", 24, "IT", "Developer",25000);
	Empolyee emp2 = new Empolyee(102, "Neha", 25, "CT", "Tester",29000);
	Empolyee emp3 = new Empolyee(103, "Ad", 20, "EE", "Systesm Analyst",30000);
	Empolyee emp4 = new Empolyee(104, "CD", 67, "ME", "Devops eng",40000);
	
	Scanner sc = new Scanner(System.in);
	int id;
	String name;
	int age;
	String department;
	String designation;
	double sal;
	 boolean found = false;
	public EmpolyeeService() {
		empset.add(emp1);
		empset.add(emp2);
		empset.add(emp3);
		empset.add(emp4);
	}

	public void addEmp() {
		 System.out.println("Enter id ");
		 id = sc.nextInt();
		 
		System.out.println("Enter the name");
		name = sc.next();
		
		
		System.out.println("Enter Age");
		age = sc.nextInt();
		
		System.out.println("Enter Department");
		department = sc.next();
		
		System.out.println("Enter the Designation");
		designation = sc.next();
		
		System.out.println("Enter the Salary");
		sal = sc.nextDouble();
		
		Empolyee emp = new Empolyee(id, name, age, department, designation, sal);
		
		empset.add(emp);
		System.out.println(emp);
		System.out.println("Employee Added Successfully");
		
}
	public void viewAllEmp() {
		for(Empolyee emp : empset) {
			System.out.println(emp);
		}
	}
	public void viewEmp() {
		System.out.println("Enter id:");
		id = sc.nextInt();
		for(Empolyee emp : empset) {
			if(emp.getId() == id) {
				System.out.println(emp);
				found = true;
			}
	}if(!found) {
		System.out.println("Employee with this id not present");
	}
	}	
	
	public void UpdateEmployee() {
		System.out.println("Enter id:");
		id = sc.nextInt();
		found = false;
		for(Empolyee emp : empset) {
			if(emp.getId() == id) {
				System.out.println("Enter Name:");
				name = sc.next();
				System.out.println("Enter New salary:");
				sal = sc.nextDouble();
				System.out.println("Uptaed Deatails of  Empolyee are:");
				emp.setName(name);
				emp.setSal(sal);
				System.out.println("Updated Details of employee are:");
				System.out.println(emp);
				found = true;
			}if(!found) {
				System.out.println("Employee not Present");
			}else {
				System.out.println("Employee Details Updated Successfully");
			}
		}
		
	}
	public void deleteEmp() {
		
	System.out.println("Enter the id:");
	id = sc.nextInt();
	boolean found = false;
	Empolyee deleteEmp =null;
	for(Empolyee emp : empset) {
		if(emp.getId() == id) {
			 deleteEmp = emp;
			 found = true;
		}
	}if(!found) {
		System.out.println("Employee is not Present");
	}else {
		empset.remove(deleteEmp);
		System.out.println("Empolyee is deleted Successfully");
	}
	}
	
}
