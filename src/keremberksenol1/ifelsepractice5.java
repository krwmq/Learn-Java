package keremberksenol1;

import java.util.Scanner;

public class ifelsepractice5 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("Enter vize results:");
	    double vize1 = scanner.nextDouble();
	    
	    System.out.print("Enter final resaults:");
	    double Finalnot = scanner.nextDouble();
	    
	    double sonuc = (vize1*0.4) + (Finalnot*0.6);
	    
	    System.out.println("Average: "+ sonuc);
        if (sonuc>=90) {
			System.out.println("AA");
			
		}
        else if (90>sonuc && sonuc>=80) {
        	System.out.println("BB");
		}
        else if (80>sonuc && sonuc>=70) {
        	System.out.println("CC");
		}
        else if (sonuc<70) {
        	System.out.println("FF");
		}
	}

}
