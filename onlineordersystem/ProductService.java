package onlineordersystem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class ProductService {
	Scanner sc = new Scanner(System.in);
	HashSet<Product> service = new HashSet<>();
	Product product1 = new Product(11, "Sugar", 40);
	Product product2 = new Product(101, "Tea", 80);
	Product product3 = new Product(10, "Rice", 80);
	Product product4 = new Product(45, "Bread", 80);
	int pid;
	String pname;
	float price;
	boolean found = false;

	public ProductService() {

		service.add(product1);
		service.add(product2);
		service.add(product3);
		service.add(product4);
	}

	public void addProduct() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Product Name");
		pname = sc.next();
		System.out.println("Enter the Product Id");
		pid = sc.nextInt();
		System.out.println("Enter the Product Price");
		price = sc.nextFloat();

		Product product = new Product(pid, pname, price);
		service.add(product);
		System.out.println("Contact Added Successfully");
		System.out.println(product);
	}

	public void displayProduct() {
		for (Product product : service) {
			System.out.println(product);
		}
	}
	public void addCart() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product Name");
		pname = sc.next();
		found = true;
		for(Product product : service ) {
			if(product.getPname() == pname) {
				System.out.println("Enter The product Name");
				pname = sc.next();
			}
		}
	}
	public void removeCartList() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id we Want to Delete");
		pid = sc.nextInt();
		boolean found = false;
		Product deleteProduct = null;
		for(Product product : service) {
			if(product.getPid()== pid) {
				deleteProduct = product;
				found = true;
			}
			}if(!found) {
				System.out.println("Product not Available");
			}else {
				service.remove(deleteProduct);
				System.out.println("Product Deleted Successfully");
			}
		}
	}

