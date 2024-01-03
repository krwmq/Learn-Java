package keremberksenol1;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthCheckBoxMenuItemUI;

public class arraypractice2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Boolean syc = true;
		System.out.println("Enter the number of numbers you want to find out whether they are prime or not.");
		int a = scn.nextInt();
		int[] dizi = new int[a];
		for (int i = 0; i < a; i++) {
			int b = scn.nextInt();
			dizi[i] = b;

		}

		for (int i = 0; i < a; i++) {
			if (dizi[i] > 3) {

				for (int j = 2; j < (dizi[i] - 1); j++) {
					if (dizi[i] % j == 0) {
						syc = true;
						break;
					} else {
						syc = false;
					}

				}
				if (syc == false) {
					System.out.println("The number "+dizi[i]+" is a prime number");
				} else if (syc == true) {
					System.out.println("The number "+dizi[i]+" is not a prime number");
				}
			} else if (dizi[i] == 2) {
				System.out.println("The number "+dizi[i]+" is a prime number");
			} else if (dizi[i] == 3) {
				System.out.println("The number "+dizi[i]+" is a prime number");
			}

		}

	}

}
