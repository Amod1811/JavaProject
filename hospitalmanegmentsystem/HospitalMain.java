package hospitalmanegmentsystem;

import java.util.Scanner;

public class HospitalMain {
	
	 static boolean check = false; 
	public void choiceMenu() {
		System.out.println("================Welcome to Hospital Manegment System=============="
				+ "\n1.Register Patisent"
				+ "\n2.Display Patisent List"
				+ "\n3.Serach Patisent Name"
				+ "\n4.Update Patient Name"
				+ "\n5.Delete Register Patient List"
				+ "\n6.Exit");
	}

	public static void main(String[] args) {
		HospitalMain housHospitalMain = new HospitalMain();
		housHospitalMain.choiceMenu();
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Choice");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:System.out.println("Register patisent");
		break;
		case 2:System.out.println("Display patisent list");
		break;
		default : 
			System.out.println("Thank you For Using Hospital Manegment System");
		}
		}while(!check);

	}

}
