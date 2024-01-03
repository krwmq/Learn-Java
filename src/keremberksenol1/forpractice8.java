package keremberksenol1;

import java.util.Scanner;

public class forpractice8 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = scanner.nextInt();
		System.out.println("Numbers that divide the entered number:");
		for (int i = 1; i <= a; i++) {

			if (a % i == 0) {
				
				System.out.println (i);

			}

		}

	}

}
