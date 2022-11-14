package librarymanegementsystem;

import java.util.Scanner;

public class BookRepository {
	Scanner sc = new Scanner(System.in);
BookService sbook = new BookService();
public void searchMenu() {
System.out.println("Search The Book"
		+ "\n1.By Name"
		+ "\n2.By Price"
		+ "\n3.By Category");
	int search = sc.nextInt();
	switch(search) {
	case 1:sbook.searchByName();
	break;
	case 2:sbook.searchByPrice();
	break;
	case 3: sbook.searchByCategory();
	break;
	default :
		System.out.println("Thank You for Using the Application");
	}
}
}