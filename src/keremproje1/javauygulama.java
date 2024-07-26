package keremproje1;

import java.util.Scanner;

public class javauygulama {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("oluşturulmasını istediğiniz dizinin boyutunu giriniz");
		int uzunluk = scanner.nextInt();
		int[] a = new int[uzunluk];

		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100);
			System.out.print(a[i] + " ");
		}
		System.out.println();
		boolean bitir = true;
		boolean sıralımı = false;
		while (bitir) {
			System.out.println("Scelection sort(1) Doğrusal Arama(2) İkili Arama(3), Bitirmek için(0)");
			int b = scanner.nextInt();
			switch (b) {
			case 1:
				selection(a);
				for (int i : a) {
					System.out.print(i + " ");
				}
				System.out.println();
				sıralımı = true;
				break;
			case 2:
				System.out.println("Aramak istediğiniz sayıyı giriniz");
				int aranacak1 = scanner.nextInt();
				int sonuc1 = dogrusal(a, aranacak1);
				if (sonuc1 != (-1)) {
					System.out.println("Aranan deger " + sonuc1 + ". indexde bulundu");
				} else {
					System.out.println("Aranan deger bulunamadı");
				}
				break;
			case 3:
				if (sıralımı) {
					System.out.println();
					System.out.println("Aramak istediğiniz sayıyı giriniz");
					int aranacak2 = scanner.nextInt();
					int sonuc2 = ikili(a, aranacak2);
					if (sonuc2 != (-1)) {
						System.out.println("Aranan deger " + sonuc2 + ". indexde bulundu");
					} else {
						System.out.println("Aranan deger bulunamadı");
					}
					break;
				} else {
					System.out.println("Dizi sıralanmamış");
				}
				break;
			case 0:
				bitir = false;

				break;
			}
		}

	}

	public static void selection(int[] a) {
		int tut = 0;
		for (int i = 0; i < a.length - 1; i++) {
			int minindex = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[minindex]) {
					minindex = j;
				}
			}
			tut = a[minindex];
			a[minindex] = a[i];
			a[i] = tut;
		}
	}

	public static int dogrusal(int[] a, int deger) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == deger) {
				return i;
			}

		}
		return -1;
	}

	public static int ikili(int[] a, int deger) {
		int ilk = 0;
		int son = a.length - 1;
		while (ilk <= son) {
			int ortancadeger = (ilk + son) / 2;
			if (deger == a[ortancadeger]) {
				return ortancadeger;
			} else if (deger < a[ortancadeger]) {
				son = ortancadeger - 1;
			} else {
				ilk = ortancadeger + 1;
			}
		}

		return -1;
	}

}
