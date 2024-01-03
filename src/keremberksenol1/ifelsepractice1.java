package keremberksenol1;

import java.util.Scanner;

public class ifelsepractice1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = scanner.nextInt();

		if (a < 0) 

			System.out.println("number negative"
					+ "");

		 else if (a == 0) 

			System.out.println("number equals zero");

		 else 
			System.out.println("number bigger then zero");
		

	}

}
