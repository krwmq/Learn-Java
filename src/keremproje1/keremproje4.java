package keremproje1;

import java.util.Scanner;

public class keremproje4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Elipsin bir kenar uzunluğunu gir");

		int uzunluk = scanner.nextInt();

		int a = uzunluk;

		int sayac = 0;

		for (int i = uzunluk; i > 0; i--) {
			for (int i1 = a; i1 > 0; i1--) {

				System.out.print(" ");

			}
			sayac += 2;
			for (int j = sayac; 0 < j; j -= sayac) {

				for (int i1 = 0; i1 < j; i1++) {
					if (i1 == 0 || i1 == j - 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}

				}

			}
			a -= 1;
			System.out.println();
		}

		int sayac2 = uzunluk * 2;

		for (int i = 0; i < uzunluk; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < sayac2; j += sayac2) {
				for (int j2 = 0; j2 < sayac2; j2++) {

					if (j2 == 0 || j2 == sayac2 - 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}

				}
			}

			sayac2 -= 2;
			System.out.println();

		}

	}

}
