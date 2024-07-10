package keremproje1;

import java.util.Iterator;

public class javaders {

	public static void main(String[] args) {
		// kabarcık algoritması ikili kıyaslayarak bütün değerleri kıyaslayarak sıralar
		// eğer herhangi bir işlem yapılmamışsa kabarcık algoritma durur.
		// her seferde bir iterasyon garanti ettiği için iki for içinde birer birer
		// azaltarak kontrol edilir
		// Seçerek sıralama en küçük olanı bulur birinci değere atar sonra 2. sonra 3.
		// dizi bitene kadar
		// eklemeli sıralama birinci elemanı tutar ikinci elemanı hepsiyle kıyaslar
		// yerlerini değiştirir sonra 2 tanesini tutar 3.yü kıyatslar...
		// hızlı sıralama
		// arama algoritmaları doğrusal ve ikili arama
		// doğrusal aramada bir değer aranıp o değerin indis değerini döndürülür
		//ikili arama sıralı listede yapılır 
		int[] a = { 6, 2, 3, 10, 5, 1, 7, 8, 9, 4 };
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
		kabarcık(a);
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
		int[] b = { 6, 2, 3, 10, 5, 1, 7, 8, 9, 4 };
		eklemeli(b);
		for (int i : b) {
			System.out.print(i + " ");
		}
		System.out.println();
		int[] c = { 6, 2, 3, 10, 5, 1, 7, 8, 9, 4 };
		secerek(c);
		for (int i : c) {
			System.out.print(i + " ");
		}

	}

	public static void kabarcık(int[] a) {
		int tut = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					tut = a[j + 1];
					a[j + 1] = a[j];
					a[j] = tut;
				}
			}
		}
	}

	public static void secerek(int[] a) {
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

	public static void eklemeli(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int anahtar = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > anahtar) {
				a[j + 1] = a[j];
				j = j - 1;
			}
			a[j + 1] = anahtar;
		}
	}

}
