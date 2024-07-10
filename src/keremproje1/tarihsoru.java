package keremproje1;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class tarihsoru {

	public static void main(String[] args) {
		LocalDate Tarih = LocalDate.now(); 
		LocalTime Zaman = LocalTime.now();
		
		System.out.println(Zaman);
		System.out.println(Tarih);
		
		DateTimeFormatter tarih = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter zaman = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		String formatlıtarih = Tarih.format(tarih);
		String formatlızaman = Zaman.format(zaman);
		
		
		
		System.out.println(formatlızaman);
		System.out.println(formatlıtarih);
		
	}

}
