package sportsmanegement;

import java.util.Scanner;

import practiceproject.Service;

public class PlayersMain {
	PlayerService pservice = new PlayerService();

	public void choiceMenu() {
		Scanner sc = new Scanner(System.in);
		boolean check = false;
		do {
			System.out.println("Enter your Choice" + "\n1.Add Player" + "\n2.Show Players List" + "\n3.Players Activity"
					+ "\n4.Search Player"+ "\n5.Player Sport"+"\n6.Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Add The Plyers");
				pservice.addPlayer();
				break;
			case 2:
				System.out.println("Players List are Follws");
				pservice.ShowList();

				break;
			case 3:
				System.out.println("Display Players Activity");
				pservice.statusPlayer();
				break;
			case 4:
				System.out.println("search  Playrs");
				pservice.searchPlayer();
				break;
			case 5 :pservice.playerSport();
			default:
				System.out.println("Enter Correct choice");
				System.out.println(0);
			}
		} while (!check);

	}

	public static void main(String[] args) {
		PlayersMain plyermain = new PlayersMain();
		plyermain.choiceMenu();
	}

}
