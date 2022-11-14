package librarymanegementsystem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

import javax.swing.text.html.HTMLDocument.Iterator;

public class BookService {
	Set<Book> bservice = new HashSet<Book>();
	Book book1 = new Book("The Guide", "R.K.Narayan", 300, "Classics");
	Book book2 = new Book("The God of Small Things", "ArunDhati Roy", 400, "Literary fiction Novel");
	Book book3 = new Book("History Of Medieval India", "Satish Chandra", 600, "History");
	Book book4 = new Book("The Complete Works of Swami Vivekananda", "S Vivekananda", 350, "Religion And Mythology");
	Book book5 = new Book("The Devils Wind ", "Manohar Malgonkar", 600, "Historical Fiction");
	Book book6 = new Book("Shiva TriLogy", "Amish Tripathi", 800, "Mythological fiction");
	Book book7 = new Book("This Not Your Story", "Savi Sharma", 250, "Romance Novel");
	Book book8 = new Book("Spy In The Amber", "Manohar Malgonkar", 500, "Thriller and Mystery Novels");
	Book book9 = new Book("Professor Shonku", "Satyajit", 900, "Sci-Fi And Fantasy");
	Book book10 = new Book("Serious Men", "Manu Joseph", 450, "Humour");
	Book book11 = new Book("Trust Me ", "RajaShree", 650, "Chick-lit Novels");
	Book book12 = new Book("Wings Of Fire", "A.P.J. Abdul Kalam Sir", 1000, "Biography and Memoirs");
	Book book13 = new Book("You Can Win", "Shiv Khera", 200, "Self-Help Book");
	Book book14 = new Book("Hot Tea Across India", "Rishad Saam mehta", 350, "Travel And Places");
	Book book15 = new Book("Indias Struggle For Independence", "Bipin Chandra", 800, "History");
	Book book16 = new Book("2 States", "Chetan Bhagat", 350, "Romance");
	Book book17 = new Book("Ramayana", "Ashok K. Banekar", 900, "Religion And Mythology");
	Book book18 = new Book("Untouchable", "Mulk Raj Anand", 200, "Classics");
	Book book19 = new Book("Empire", "Devi Yesodharan", 450, "Historical Fiction");
	Book book20 = new Book("The Accidental Prime Minister", "Sanjaya Baru", 850, "Biographies and Memoirs");

	Scanner sc = new Scanner(System.in);
	Book service;
	String bookName;
	String bookAuthor;
	int bookPrice;
	String category;
	boolean found = false;

	public BookService() {
		bservice.add(book1);
		bservice.add(book2);
		bservice.add(book3);
		bservice.add(book4);
		bservice.add(book5);
		bservice.add(book6);
		bservice.add(book7);
		bservice.add(book8);
		bservice.add(book9);
		bservice.add(book10);
		bservice.add(book11);
		bservice.add(book12);
		bservice.add(book13);
		bservice.add(book14);
		bservice.add(book15);
		bservice.add(book16);
		bservice.add(book17);
		bservice.add(book18);
		bservice.add(book19);
		bservice.add(book20);
	}

	public void addBook() {
		System.out.println("Enter Book Name");
		bookName = sc.next();
		System.out.println("Enter Name of Book Author");
		bookAuthor = sc.next();
		System.out.println("Enter the Book Price");
		bookPrice = sc.nextInt();
		System.out.println("Enter the Category");
		category = sc.next();
		Book book = new Book(bookName, bookAuthor, bookPrice, category);
		bservice.add(book);
		// System.out.println(book);
	}

	public void bookDetail() {
		java.util.Iterator<Book> item = bservice.iterator();
		while (item.hasNext()) {
			System.out.println(item.next());
		}
	}

	public void searchByName() {
		System.out.println("Enter the Book Name");
		{
			bookName = sc.next();
			List<Book> searchbook = bservice.stream().filter(b -> b.bookName.contains(bookName))
					.collect(Collectors.toList());
			System.out.println(searchbook);
		}
		
	}
	public void searchByPrice() {
//		System.out.println("Enter the Price");
//		
//		bookPrice = sc.nextInt();
//		
		System.out.println("Books price are Greater than 500");
		 bservice.stream().filter(p -> p.bookPrice>500).map(pl -> pl.getBookPrice()).forEach(pr ->System.out.println(pr));
		 System.out.println("======================================================================");
		 System.out.println("Books Value are less Than 500");
		bservice.stream().filter(p -> p.bookPrice < 500).forEach(pr -> System.out.println(pr));
		
		
		
	}
	public void searchByCategory() {
//		System.out.println("Enter the Book category");
//		category = sc.next();
		bservice.stream().filter(c -> c.getCategory() == "Classics").forEach(System.out::println);
		bservice.stream().filter(c -> c.getCategory() == "Literary fiction Novel").forEach(System.out::println);
		bservice.stream().filter(c -> c.getCategory() == "History").forEach(System.out::println);
		bservice.stream().filter(c -> c.getCategory() == "Religion And Mythology").forEach(System.out::println);
		bservice.stream().filter(c -> c.getCategory() == "Historical Fiction").forEach(System.out::println);
		bservice.stream().filter(c -> c.getCategory() == "Mythological fiction").forEach(System.out::println);
		bservice.stream().filter(c -> c.getCategory() == "Thriller and Mystery Novels").forEach(System.out::println);
		bservice.stream().filter(c -> c.getCategory() == "Romance Novel").forEach(System.out::println);
		bservice.stream().filter(c -> c.getCategory() == "Sci-Fi And Fantasy").forEach(System.out::println);
		bservice.stream().filter(c -> c.getCategory() == "Humour").forEach(System.out::println);
		bservice.stream().filter(c -> c.getCategory() == "Chick-lit Novels").forEach(System.out::println);
		bservice.stream().filter(c -> c.getCategory() == "Biography and Memoirs").forEach(System.out::println);
		bservice.stream().filter(c -> c.getCategory() == "Self-Help Book").forEach(System.out::println);
		bservice.stream().filter(c -> c.getCategory() == "Travel And Places").forEach(System.out::println);
		//List<Book>category1 = bservice.stream().filter(c -> c.category.contains(category)).collect(Collectors.toList());
		//System.out.println(category);
		
	}
	public void removeList() {
		System.out.println("---Remove the name in the list---");
		List<Book>list=bservice.stream().filter(p -> p.getBookName().equals(bookName)).collect(Collectors.toList());
		//bservice.remove(book1);
		System.out.println(list);
	}
}
