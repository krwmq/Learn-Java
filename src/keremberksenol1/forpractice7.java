package keremberksenol1;

public class forpractice7 {

	public static void main(String[] args) {
		int c = 0;
		for (int a = 0; a < 100; a++) {

			for (int b = 1; b < a; b++) {

				if (a % b == 0) {
					c = ++c;

				}

			}
			if (c == 1) {
				System.out.println(a);
			}
			c = 0;
		}
	}
}