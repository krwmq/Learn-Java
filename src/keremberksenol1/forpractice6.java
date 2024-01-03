package keremberksenol1;

public class forpractice6 {

	public static void main(String[] args) {

		System.out.println("double numbers between 1 and 100:");

		for (int i = 1; i <= 100; i++)

			if (i % 2 == 0) {

				System.out.println(i);
			}

		System.out.println("single numbers between 1 and 100:");

		for (int b = 100; b >= 1; b--)

			if (b % 2 != 0) {
				System.out.println(b);

			}

	}

}
