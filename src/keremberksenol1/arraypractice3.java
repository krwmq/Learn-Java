package keremberksenol1;

import java.util.Scanner;

public class arraypractice3 {

	public static void main(String[] args) {
		System.out.print("How many numbers you will enter?");
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		int sayac = 0;
		int x;
		System.out.print("Enter numbers");
		int[] dizi = new int[b];

		for (int i = 0; i < b; i++) {

			dizi[i] = a.nextInt();

		}
		for (int j = 0; j < b - 2; j++) {

			for (int i = 0; i < b - 1; i++) {

				if (dizi[i] < dizi[i + 1]) {
					x = dizi[i + 1];
					dizi[i + 1] = dizi[i];
					dizi[i] = x;
				}

			}
		}
		for (int i = 0; i < b; i++) {
			sayac += 1;
			if (sayac != b) {
				if (dizi[i] == dizi[i + 1]) {
					System.out.print(dizi[i] + "=");
				} else {

					System.out.print(dizi[i] + ">");
				}
			} else {
				System.out.print(dizi[i]);
			}

		}
	}

}
