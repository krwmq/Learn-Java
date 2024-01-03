package keremberksenol1;

import java.util.Scanner;

public class recursivefunctionpractice2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Bir sayı girin: ");
		int sayi = scanner.nextInt();
		abc(sayi);
	}

	public static void abc(int n) {
		for (int i = 2; i <= n - 2; i++) {
			int b = 0;
			int c = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					b += 1;
				}
				if ((i + 2) % j == 0) {

					c += 1;
				}
			}

			if (i == 2) {

			} else if (b == 0 && c == 0) {
				System.out.println("(" + i + "," + (i + 2) + ")");
			}

		}
	}

}
