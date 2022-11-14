package practiceproject;

import java.util.Scanner;

public class Main {
	public void functionMenu() {
		Scanner sc = new Scanner(System.in);
		Function function = new Function();
		boolean check = false;
		do {
		System.out.println("Choice menu"
				+ "\n1. AddProduct"
				+ "\n2. Display Product"
				+ "\n3. Update product"
				+ "\n4. Remove product");
		int choice = sc.nextInt();
		switch(choice) {
		case 1 : function.addProduct();
		break;
		case 2 : function.displayProduct();
		break;
		case 3 : function.updateProduct();
		break;
		case 4 : function.removeProduct();
		break;
		default : System.out.println("Enter correct option");
		}
	}while(!check);
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Online Shopping System");
		Main main = new Main();
		main.functionMenu();

	}

}
