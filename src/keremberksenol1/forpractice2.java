package keremberksenol1;
import java.util.Scanner;

public class forpractice2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int sayi = scanner.nextInt();

		boolean asal1 = false;
		for (int i = 2; i < sayi; i++) {

			if (sayi % i == 0) {

				asal1 = false;
				break;

			} else {

				asal1 = true;

			}

		}
		if (asal1) {
			System.out.println("Entered " + sayi + " number is prime.");

		} else {
			System.out.println("Entered " + sayi + " number is not prime.");
		}
	}

}
