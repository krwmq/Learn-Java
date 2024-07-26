package keremproje1;

import java.util.Iterator;

public class javaders {

	public static void main(String[] args) {
		 
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
