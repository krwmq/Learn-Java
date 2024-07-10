package keremproje3;

import java.util.Scanner;
import keremproje3.bankaHesabı;

public class HesapMakinesi {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		bankaHesabı bankahesabı = new bankaHesabı("A", 001, 5000, "B", 002, 4000, "C", 003, 3000);
		System.out.println("Which account want you enter");
		String a = scanner.next();
		System.out.println("For deposit enter 1, For witraw enter 2");
		int b = scanner.nextInt();
		if (b != 1 && b != 2) {
			System.out.println("Please enter 1 or 2");
		}
		if (b == 1) {
			System.out.println("How much you want to deposit money");
			int deposit = scanner.nextInt();
			bankahesabı.paraCekme(a, deposit);
		} else if (b == 2) {
			System.out.println("How much you want to witraw money");
			int witraw = scanner.nextInt();
			bankahesabı.paraYatırma(a, witraw);
		}
	}

}
