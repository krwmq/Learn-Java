package keremberksenol1;

import java.util.Scanner;

public class arraypractice1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bir sayı gir(dizi uzunluğu): ");
		int alinansayi = scanner.nextInt();
		scanner.nextLine();
		String[] isimler = new String[alinansayi];
		
		
		for (int i = 0; i < alinansayi; i++) {
			System.out.println("dizinin " + (i) + ". index değerini giriniz");
	        isimler[i] = scanner.nextLine();
		}
        for (int i = 0; i < isimler.length; i++) {
			System.out.println(isimler[i]);
		}
	}

}
