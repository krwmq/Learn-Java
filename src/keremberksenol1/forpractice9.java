package keremberksenol1;

import java.util.Scanner;

public class forpractice9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a word");
		int c = 0;
		String a = scanner.next();

		char p = 'a';
		for (int i = 0; i < a.length(); i++) {
			char d = a.charAt(i);

			if (d == p) {

				c += 1;
			}

		}

		System.out.println("There are" + "'"+c+"'" + "letters" + "'"+"a"+"'" + "in the entered word");

	}

}
