package keremberksenol1;
import java.util.Iterator;
import java.util.Scanner;

public class forpractice3 {

	public static void main(String[] args) {

		System.out.println("the multiplication table:");

		for (int i = 1; i < 11; i++) {
			for (int j = 1; j < 11; j++) {

				System.out.println(i + "x" + j + "=" + (i * j));

			}
			System.out.println("----------");

		}

	}

}
