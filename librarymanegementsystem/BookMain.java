package librarymanegementsystem;

import java.util.Scanner;

public class BookMain {
	BookService bookService = new BookService();
	static boolean ordering = true;
	public void choiceMenu() {
		System.out.println("======Welcome to Book Store Management System======="
				+ "\n1.Add Book"
				+ "\n2.Show Book List"
				+ "\n3.Search Book"
				+ "\n4.Delete book"
				+ "\n5.exit");
	}
	public static void main(String[] args) {
		BookMain bookMain = new BookMain();
		BookService bookService = new BookService();
		BookRepository bRepository = new BookRepository();
		//bRepository.searchMenu();
		bookMain.choiceMenu();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter Your Choice");
			int choice = sc.nextInt();
			switch(choice) {
			case 1: bookService.addBook();
			break;
			case 2: bookService.bookDetail();
			break;
			case 3: bRepository.searchMenu();
			break;
			case 4: bookService.removeList();
			default :
			System.out.println("=========Thank you for Using the Application===========");
			System.out.println("Enter correct option");
			}
		}while(ordering);
	}
}
