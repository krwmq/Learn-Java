package keremberksenol1;

import java.util.Scanner;

public class ifelsepractice3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your exam result(between 0 and 100)");
		int a = scanner.nextInt();
		if (a >= 90) {
			System.out.println("AA");

		} else if (90 > a && a >= 80) {
			System.out.println("BB");
		} else if (80 > a && a >= 70) {
			System.out.println("CC");
		} else if (a < 70) {
			System.out.println("FF");
		}

	}

}
