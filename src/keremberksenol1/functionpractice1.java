package keremberksenol1;

import java.util.Scanner;

public class functionpractice1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		abc();
		
		System.out.println("Enter the numbers you want to multiply"
				+ "");
		int a1 = scn.nextInt();		
		int a2 = scn.nextInt();
		int metotsonuc = abf(a1, a2);
		System.out.println(metotsonuc);
		
		System.out.println("Enter the numbers you want to sum");
		int a = scn.nextInt();
		int b = scn.nextInt();
		abd(a, b);
	}

	public static void abd(int sayı1, int sayı2) {

		int sonuc = sayı1 + sayı2;
		System.out.println(sonuc);
	}

	public static int abf(int sayı3, int sayı4) {
		int sonuc1 = sayı3 * sayı4;
		return sonuc1;
	}

	public static void abc() {

		System.out.println("Kerem");
	}
}
