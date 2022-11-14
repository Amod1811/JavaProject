package sportsmanegement;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PlayerService {
	HashSet<Player> service = new HashSet<>();
	// HashSet<Player> pservice = new HashSet<>();
	Player pname1 = new Player("Ms.Dhoni", "Cricket", "Not Active");
	Player pname2 = new Player("Pv Shindhu", "BadMinton", "Active");
	Player pname3 = new Player("Milkha Singh", "Athletics", "Not Active");
	Player pname4 = new Player("Neeraj Chopra", "Athletics", "Active");
	Player pname5 = new Player("Vishwanathan Anand", "Chess", "Not Active");
	Player pname6 = new Player("Anuj Booby", "Long Jump", "Active");
	Player pname7 = new Player("Sakshi Malik", "Wrestling", "Not Active");
	Player pname8 = new Player("Lakshya Sen", "BadMinton", "Not Active");
	Player pname9 = new Player("Pankaj Advani", "Billiards", "Not Active ");
	Player pname10 = new Player("Virat Kohli", "Cricket", "Active");
	Player pname11 = new Player("Deepa karmakr", "Gymnastics", "Not Active");
	Player pname12 = new Player("Manpreet Singh", "Hockey", "Active");
	Player pname13 = new Player("Sunil Chhetri", "FootBall", "Active");
	Player pname14 = new Player("Anup Kumar", "Kabaddi", "Active");
	Player pname15 = new Player("Yuraj Singh", "Cricket", "Not Active");
	Player pname16 = new Player("Bajrang Punia", "Wrestling", "Active");
	Player pname17 = new Player("Amit Panghal", "Boxer", "Active");
	Player pname18 = new Player("Kapil Dev", "Cricket", "Not Active");
	Player pname19 = new Player("Raspreet Sidhu", "BasketBall", "Active");
	Player pname20 = new Player("Narain Kartikeyan", "Racer", "Active");

	Scanner sc = new Scanner(System.in);
	String playername;
	String sport;
	String status;
	boolean found = false;

	public PlayerService() {
		service.add(pname1);
		service.add(pname2);
		service.add(pname3);
		service.add(pname4);
		service.add(pname5);
		service.add(pname6);
		service.add(pname7);
		service.add(pname8);
		service.add(pname9);
		service.add(pname10);
		service.add(pname11);
		service.add(pname12);
		service.add(pname3);
		service.add(pname14);
		service.add(pname15);
		service.add(pname16);
		service.add(pname17);
		service.add(pname18);
		service.add(pname19);
		service.add(pname20);
	}

	public void addPlayer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Player Name");
		playername = sc.next();

		System.out.println("Enter Player Sport");
		String sport = sc.next();

		System.out.println("Enter Player Staus Active OR Not Active");
		String status = sc.next();

		Player player = new Player(playername, sport, status);
		service.add(player);
		System.out.println("Player Added successfully");
	}

	public void ShowList() {
		System.out.println("-------------------------------");
		Iterator<Player> item = service.iterator();
		while (item.hasNext()) {
			System.out.println(item.next());
		}
	}

	public void searchPlayer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Player Name");
		String playername = sc.next();
		List<Player>searchplayer=service.stream().filter(p -> p.playername.contains(playername)).collect(Collectors.toList());
		System.out.println(searchplayer);
	}

	public void statusPlayer() {
		System.out.println("List of Player who not Not Active");
		System.out.println("-------------------------------------------------------");
		service.stream().filter(pl -> pl.getStatus() == "Not Active").forEach(System.out::println);
		System.out.println("List of Player who not Not Active");
		System.out.println("-------------------------------------------------------");
		service.stream().filter(p1 -> p1.getStatus() == "Active").forEach(p -> System.out.println(p));
	}

	public void playerSport() {
		System.out.println("List of the who are play cricket");
		System.out.println("-------------------------------------------------------");
		service.stream().filter(player -> player.getSport() == "Cricket").forEach(System.out::println);
		System.out.println("-------------------------------------------------------");
		System.out.println("List of the who are play Badminton");
		service.stream().filter(pe -> pe.getSport() == "BadMinton").forEach(pr -> System.out.println(pr));
		System.out.println("-------------------------------------------------------");
		System.out.println("List of the who are play in Athletics");
		service.stream().filter(p1 -> p1.getSport()=="Athletics").forEach(System.out::println);
		System.out.println("-------------------------------------------------------");
		System.out.println("List of the who are play  Wrestling");
		service.stream().filter(player -> player.getSport()=="Wrestling").forEach(System.out::println);
		System.out.println("-------------------------------------------------------");
		System.out.println("List of the who are play  Hockey");
		service.stream().filter(player -> player.getSport()=="Hockey").forEach(System.out::println);
		
		
	}
}