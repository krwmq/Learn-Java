package keremproje4oyun;

import java.util.Scanner;

import keremproje4oyun.uygulama;

public class aBoksUygulaması {

	public static void main(String[] args) {
		uygulama uygulama = new uygulama(200, 5, false, "King", 105, 7, false, "Lord", 130, 6, false, "Captain");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kullanıcı Adınızı Giriniz");
		String ad = scanner.next();
		uygulama.setId(ad);
		System.out.print("                       "+uygulama.getId());
		uygulama.kurallar();
		System.out.println("Heronuzu Seçiniz");
		System.out.println("King - Lord - Captain");
		String hero = scanner.next();
		uygulama.Hero(hero);

		System.out.println("Rakip Heroyu Seçiniz");
		System.out.println("King - Lord - Captain");
		String rakip = scanner.next();
		uygulama.Rakip(rakip);
		uygulama.basla();

	}

}
