package keremberksenol1;

import java.util.Scanner;

public class recursivefunctionpractice1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Herhangi bir sayı giriniz: ");
		int b = scanner.nextInt();

		System.out.println(basamak(b));
	}
	public static int basamak(int sayi) {
		if (sayi == 0) {
			return 0;
		} 
		else {
			int c = sayi % 10;
			int d = sayi / 10;
			return c + basamak(d);
		}
	}
}