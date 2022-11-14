package practiceproject;

import java.util.HashSet;
import java.util.Scanner;

public class Function {
	Scanner sc = new Scanner(System.in);
	HashSet<Service> service = new HashSet<>();
	Service product1 = new Service(101, "Shirt", 1000);
	Service product2 = new Service(102, "T-Shirt", 500);
	Service product3 = new Service(103, "SweatShirt", 700);
	Service product4 = new Service(104, "Jocket", 1500);
	int pId;
	String pname;
	float price;
	boolean found = false;
	public Function(){
		service.add(product1);
		service.add(product2);
		service.add(product3);
		service.add(product4);
	}
	public void addProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Product id ");
		pId = sc.nextInt();
		System.out.println("Enter the Product Name ");
		pname = sc.next();
		System.out.println("Enter the Product Price ");
		
		Service product = new Service(pId, pname, price);
		service.add(product);
		}
	public void displayProduct() {
		for(Service pr : service) {
			System.out.println(pr);
		}
	}
	public void updateProduct() {
		Scanner sc = new Scanner(System.in);
		boolean found = false;
		System.out.println("Enter the id we want update");
		pId = sc.nextInt();
		for(Service pr : service) {
			if(pr.getpId()==pId) {
				System.out.println("Enter the id");
				pId = sc.nextInt();
				System.out.println("Enter the product name");
				pname = sc.next();
				System.out.println("Enter the price");
				price = sc.nextFloat();
				pr.setpId(pId);
				pr.setPname(pname);
				pr.setPrice(price);
				found = true;
				
		}if(!found) {
			System.out.println("Product not found");
			}
		}
		
	}
	public void removeProduct() {
		boolean found = false;
		System.out.println("Enter the id we want to delete");
		pId = sc.nextInt();
		Service deleteId = null;
		for(Service pr : service) {
			if(pr.getpId()==pId) {
				deleteId = pr;
				found = true;
			}
		}if(!found) {
			System.out.println("Product not found");
		}else {
			service.remove(deleteId);
			System.out.println("Product deleted successfully");
		}
	}
}

