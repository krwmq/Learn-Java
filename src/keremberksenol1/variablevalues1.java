package keremberksenol1;

public class variablevalues1 {

	public static void main(String[] args) {

		/*
		 * byte -128 - 127 short -32768 - 32767 int - 9 masamağa çıkan sayılar ctrl+d
		 * satırı siler
		 * 
		 * option + 0 = } /option + 7 = { { option + * = \ / option + ğ = ¨ / option + ç
		 * = ≥ / option + ö = ≤ / option + . = ÷ / option + - = |
		 */

		byte degisken = 100;

		System.out.println(degisken);

		short degisken2 = Short.MAX_VALUE;

		System.out.println(degisken2);

		int degisken3 = Integer.MAX_VALUE;

		System.out.println(degisken3);

		long degisken4 = 9123456789123456789L;

		System.out.println(degisken4);

		float degisken5 = 16.71213F;

		System.out.println(degisken5);

		double degisken6 = 75.534534534534;

		System.out.println(degisken6);

		boolean degisken7 = 10 < 5;

		System.out.println(degisken7);

		char degisken8 = ')';

		System.out.println(degisken8);

		String degisken9 = "krhjwekfıl86586sjkd2453böfh56712865&/(&%kjsldknfm";

		System.out.println(degisken9);

		int varlik1 = 150;

		int varlik2 = 100;

		int varlik3 = 200;

		int toplam = ((varlik1 + varlik2 - varlik3) * 2) / 4;

		System.out.println(toplam);

		int not1 = 50;

		int not2 = 40;

		int not3 = 60;

		int ortalama = (not1 + not2 + not3) / 3;

		System.out.println("Not Ortalaması:" + ortalama);

		int operatormod = 100 % 40;
		operatormod++;
		operatormod++;
		operatormod--;

		System.out.println(operatormod);

		int ornek = 1;

		ornek += 39;
		ornek *= 2;
		ornek /= 10;
		ornek -= 2;
		ornek %= 4;

		System.out.println(ornek);

		int ornek2 = 1;
		int ornek3 = 2;

		boolean ornektoplam = ornek2 == ornek3;

		System.out.println(ornektoplam);

		int ornek4 = 1;
		int ornek5 = 2;

		boolean ornektoplam2 = ornek4 != ornek5;

		System.out.println(ornektoplam2);

		boolean a = !true;
		System.out.println(a);

		int b = 5;
		int c = 10;

		boolean esitlik = !(b > c);

		System.out.println(esitlik);

		boolean esitlik2 = b > 4 && c < 9;

		System.out.println(esitlik2);

		boolean esitlik3 = b > 4 || c < 9;

		System.out.println(esitlik3);

		int ab = 10;

		String esitlik4 = ab > 4 ? "yes it is big" : "no it is not";

		System.out.println(esitlik4);

		int ac = 15;

		boolean esitlik5 = ac < 10 ? true : false;

		System.out.println(esitlik5);

		final String sabit = "Kerem Berk Şenol";
		System.out.println(sabit);
	}

}
