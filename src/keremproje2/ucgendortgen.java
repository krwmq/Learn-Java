package keremproje2;
import java.util.Scanner;
import keremproje2.ucgen;
import keremproje2.dikdörtgen;
public class ucgendortgen {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ucgen yükseliğini gir");
		Double a = scanner.nextDouble();
		System.out.println("ucgenin tabanını gır");
		Double b = scanner.nextDouble();
		System.out.println("dikdortgenin kısa kenarını gir");
		int c = scanner.nextInt();
		System.out.println("dikdörtgenin uzun kenarını gir");
		int d = scanner.nextInt();
		dikdörtgen dikdörtgendeger = new dikdörtgen();
		ucgen ucgendeger = new ucgen();
		dikdörtgendeger.alanHesaplama(c, d);
		dikdörtgendeger.cevreHesaplama(c, d);
		ucgendeger.alanHesaplama(a, b);
		ucgendeger.cevreHesaplama(a, b);
	}

}

