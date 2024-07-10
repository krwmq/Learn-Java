package keremproje1;

import java.time.LocalDate;
import java.time.LocalTime;

public class zztarih {

	public static void main(String[] args) {
		LocalDate tarih = LocalDate.now();
		System.out.println(tarih);
		LocalTime zaman = LocalTime.now();
		System.out.println(zaman.getSecond());
		int a = zaman.getSecond();
		int bitir = a;
		int b = 0;
		
		while (a!=bitir+3) {
			b = zaman.getSecond();
			if (b==a+1) {
				a=a+1;
				System.out.println(a);
			}
			
		}
		System.out.println("Kerem");
		
	}

}
