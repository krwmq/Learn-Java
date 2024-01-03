package keremberksenol1;

import java.util.Scanner;

public class switchcasepractice3tradvanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		String kullanici1 = "kerem123";
		int kullanici1sifre = 1234;
		String kullanici1iban = "TR12345678912";
		Double kullanici1bakiye = 100.5;

		String kullanici2 = "enes123";
		int kullanıcı2sifre = 1235;
		String kullanici2iban = "TR12345678913";
		Double kullanici2bakiye = 200.0;

		System.out.println("kullanici adınızı giriniz");
		String kullanıcıadi = scanner.nextLine();

		System.out.println("şifrenizi giriniz");
		String sifre = scanner.nextLine();

		if (kullanıcıadi.equals("kerem123") && sifre.equals("1234")) {

			System.out.println("Bakiye görüntülemek için 1");
			System.out.println("Para çekmek için 2");
			System.out.println("Farklı hesaba para yatırmak için 3");
			System.out.println("Uygulamadan çıkmak için 4, tuşuna basınız");
			int numara1 = scanner.nextInt();

			switch (numara1) {

			case 1:
				System.out.println(kullanici1bakiye);
			case 2:
				System.out.println("Bakiyeniz :" + kullanici1bakiye);
				System.out.print("Çekmek istediğiniz tutarı giriniz: ");
				Double cekilentutar = scanner.nextDouble();
				Double kalanpara = kullanici1bakiye - cekilentutar;
				System.out.println("Kalan Bakiyeniz: " + kalanpara);
			case 3:
				System.out.println("Bakiye göndermek istediğiniz kişinin kullanıcı ismini giriniz");
			case 4:
				System.out.println("Hesaptan çıkılmıştır");

			}

		}

		else if (kullanıcıadi.equals("enes123") && sifre.equals("1235")) {

			System.out.println("Bakiye görüntülemek için 1");
			System.out.println("Para çekmek için 2");
			System.out.println("Farklı hesaba para yatırmak için 3");
			System.out.println("Uygulamadan çıkmak için 4, tuşuna basınız");
			int numara1 = scanner.nextInt();

			switch (numara1) {

			case 1:
				System.out.println(kullanici2bakiye);
			case 2:
				System.out.println("Bakiyeniz :" + kullanici2bakiye);
				System.out.print("Çekmek istediğiniz tutarı giriniz: ");
				Double cekilentutar = scanner.nextDouble();
				Double kalanpara = kullanici2bakiye - cekilentutar;
				System.out.println("Kalan Bakiyeniz: " + kalanpara);
			case 3:
				System.out.println("Bakiye göndermek istediğiniz kişinin kullanıcı ismini giriniz");
			case 4:
				System.out.println("Hesaptan çıkılmıştır");
			}
		}

		else {
			System.out.println("Kullanıcı adını yada Şifreyi yanlış girdiniz");
		}

	}

}
