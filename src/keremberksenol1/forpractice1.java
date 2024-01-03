package keremberksenol1;

import java.util.Scanner;

public class forpractice1 {
	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);
		System.out.print("Enter Fibonacci length");

		int a = e.nextInt();

		int d = 0;
		int b = 1;

		for (int i = 0; i < a; i++) {

			System.out.println(b);

			int toplam = d + b;

			d = b;
			b = toplam;

		}

	}

}