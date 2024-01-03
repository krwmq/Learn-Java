package keremberksenol1;

import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Double matnot = 0.0;
		Double turkcenot = 0.0;

		System.out.println("Math Lesson;");

		System.out.println("enter the correct amount");
		Double a = scanner.nextDouble();
		System.out.println("enter the incorrect amount");
		Double b = scanner.nextDouble();

		System.out.println("Physics Lesson;");

		System.out.println("enter the correct amount");
		Double c = scanner.nextDouble();
		System.out.println("enter the incorrect amount");
		Double d = scanner.nextDouble();

		matnot = (a * 6.0);
		matnot = (matnot - (b * 1.5));

		turkcenot = (c * 4.0);
		turkcenot = (turkcenot - (d * 2.0));

		System.out.println("Your average results : " + (turkcenot + matnot));

	}

}
