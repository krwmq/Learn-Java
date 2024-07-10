package keremproje1;

import java.util.ArrayList;
import java.util.Scanner;

public class zdizisoru {

	public static void main(String[] args) {
		ArrayList<Integer> sayılar = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		int i = 1;
		while (i!=0) {
			int a = scanner.nextInt();
			i=a;
			if (a!=0) {
				sayılar.add(a);
			}
		}
		sayılar.remove(0);
		sayılar.remove(sayılar.size()-1);
		
		
		
		System.out.println(sayılar);
	}

}
