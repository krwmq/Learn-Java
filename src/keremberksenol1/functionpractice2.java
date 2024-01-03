package keremberksenol1;

import java.util.Scanner;

public class functionpractice2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Type the amount of numbers you want to enter");
		int b = scn.nextInt();
		int[] a = new int[b];

		for (int i = 0; i < a.length; i++) {
			System.out.print("enter value " + i + ": ");
			a[i] = scn.nextInt();
		}
		for (int blabla : a) {
			krm(blabla);
		}
	}

	public static void krm(int number) {
		if (number % 2 == 0) {
			System.out.println(number + " double");
		} else {
			System.out.println(number + " single");

		}
	}

}
