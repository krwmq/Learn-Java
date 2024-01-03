package keremberksenol1;

import java.util.Scanner;

public class ifelsepractice5tradvanced {

	public static void main(String[] args) {
		

        Scanner scanner = new Scanner(System.in);
		
	    System.out.print("Adını Gir:");
	    String isim = scanner.nextLine();
	    
	    System.out.print("Soyadını Gir:");
	    String soyisim = scanner.nextLine();
	    
	    System.out.print("Dersin Adi:");
	    String dersadi = scanner.nextLine();
	    
	    System.out.print("Vize1 Notunu Gir:");
	    double vize1 = scanner.nextDouble();
	    
	    System.out.print("Vize2 Notunu Gir:");
	    double vize2 = scanner.nextDouble();
	    
	    System.out.print("Final Sınav Notunu Gir:");
	    double Finalnot = scanner.nextDouble();
	    
	    double sonuc = (vize1*0.3) + (vize2*0.3) + (Finalnot*0.4);
	    
	    System.out.println("İsm Soyisim: "+ isim + " " +soyisim );
	    
	    System.out.println("Ders Adı: "+ dersadi);
	    
	    System.out.println("Ortalaması: "+ sonuc);
	    
	    if (sonuc<50) {
	    	
	    	System.out.println("Kaldın!!");
			
		}
		
	    else {
			System.out.println("Geçti");
		}
		
		
		
		
	}

}
