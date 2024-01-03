package keremberksenol1;

import java.util.Scanner;

public class switchcasepractice1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("enter a number between one and seven: ");
		int sayi = scanner.nextInt();

		switch (sayi) {

		case 1:
			System.out.println("monday");
			break;

		case 2:
			System.out.println("tuesday");
			break;

		case 3:
			System.out.println("wednesday");
			break;

		case 4:
			System.out.println("thursday");
			break;

		case 5:
			System.out.println("friday");
			break;

		case 6:
			System.out.println("saturday");
			break;

		case 7:
			System.out.println("sunday");
			break;

		default:
			System.out.println("You must enter a number between one and seven");

		}

	}
}
