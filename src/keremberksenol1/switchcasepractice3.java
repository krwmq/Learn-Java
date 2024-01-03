package keremberksenol1;

import java.util.Scanner;

import javax.print.attribute.SetOfIntegerSyntax;

public class switchcasepractice3 {

	public static void main(String[] args) {
		int b = 1000;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Withdrawal (1), Deposit (2), Balance View (3)");
		int a = scanner.nextInt();
		switch (a) {

		case 1:
			System.out.println("Your balance :"+b);
			System.out.println("how much do you want to withdraw");
			int d = scanner.nextInt();
			b = b - d;
			System.out.println("New balance: " + b);
			break;
		case 2:
			System.out.println("Your balance :"+b);
			System.out.println("how much do you want to deposit");
			int c = scanner.nextInt();
			b = b + c;
			System.out.println("New balance: " + b);
			break;
		case 3:
			System.out.println("Balance: " + b);
			break;

		}
	}
}
