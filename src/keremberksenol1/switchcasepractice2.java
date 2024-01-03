package keremberksenol1;

import java.util.Scanner;

public class switchcasepractice2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a three digit number");
		int a = scanner.nextInt();
		int b, c, d, e;

		b = a % 100;
		c = a % 10; // 3.

		d = (a - b) / 100; // 1.
		e = (b - c) / 10; // 2.

		switch (c % 2) {

		case 0:

			System.out.println("This number is divided by 2");
			switch ((c + d + e) % 3) {

			case 0:

				System.out.println("This number is divided by 3");
				System.out.println("This number is divided by 6");
				break;
			case 1:

			case 2:

				System.out.println("This number is not divisible by 3");
				System.out.println("This number is not divisible by 6");
				break;

			}
			break;
		case 1:
			System.out.println("This number is not divisible by 2");
			switch ((c + d + e) % 3) {

			case 0:

				System.out.println("This number is divided by 3");
				System.out.println("This number is not divisible by 6");
				break;
			case 1:

			case 2:

				System.out.println("This number is not divisible by 3");
				System.out.println("This number is not divisible by 6");
				break;

			}
			break;

		}

	}
}
