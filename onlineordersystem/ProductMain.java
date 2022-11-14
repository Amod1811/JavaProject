package onlineordersystem;

import java.util.Scanner;

public class ProductMain {
	
 public void choiceMenu() {
	 
	ProductService productSevice = new ProductService();
	System.out.println("Choice menu of Product");
	Scanner sc = new Scanner(System.in);
	boolean check = false;
	do{

		System.out.println("Enter Your Choice" 
		        + "\n 1.Add Product"
				+ "\n 2.Show Product" 
		        + "\n 3.Add Cart Product"
				+ "\n 4.Remove Product from Cart");
		
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			productSevice.addProduct();
			break;
		case 2:
			productSevice.displayProduct();
			System.out.println("Product List");
			break;
		case 3 : 
			productSevice.addCart();
			break;
		case 4 :
			productSevice.removeCartList();
			break;
		default:
			System.out.println("Enter the correct option");
		}
	}while(!check);
 }
	public static void main(String[] args) {
		System.out.println("===========Welcome to Online Shopping System============");
		ProductMain product = new ProductMain();
		product.choiceMenu();
	}
}
