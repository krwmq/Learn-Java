package keremberksenol1;

import java.util.Scanner;

public class ifelsepractice6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("How Many Kilos of Oranges Did You Buy?: ");
		Double leblebikilo = scanner.nextDouble();
		Double leblebifiyat = (leblebikilo * 3.5);

		System.out.print("How Many Kilos of Lemon Did You Buy?: ");
		Double fındıkkilo = scanner.nextDouble();
		Double fındıkfiyat = (fındıkkilo * 15.7);

		System.out.print("How Many Kilos of Strawberry Did You Buy?: ");
		Double bademkilo = scanner.nextDouble();
		Double bademfiyat = (bademkilo * 22);

		Double leblebikar = ((leblebifiyat / 10) * 15);

		Double fındıkkar = ((fındıkfiyat / 10) * 14);

		Double bademkar = ((bademfiyat / 10) * 16);

		if ((leblebikar + fındıkkar + bademkar) < 500) {

			Double kazanc = (leblebikar + fındıkkar + bademkar);

			Double gerekenkazanc = (500 - kazanc);

			System.out.println("We couldn't pay the rent, " + "We need to earn: " + gerekenkazanc);

		}

		else {

			Double karmiktarı = (leblebikar + fındıkkar + bademkar);

			System.out.println("We could pay the rent, " + "Earning: " + karmiktarı);

		}

	}

}
