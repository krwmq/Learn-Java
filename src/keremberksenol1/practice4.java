package keremberksenol1;
import java.util.Scanner;

public class practice4 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter 3 numbers in order");

		int a = scanner.nextInt();
		
		int b = scanner.nextInt();
		
		int c = scanner.nextInt();
		
		
		int enbuyuk = a;
		
		if (enbuyuk<b) 
			enbuyuk=b;
		
		else if (enbuyuk<c) {
			enbuyuk=c;
		}
		
		
		System.out.println("largest number: " + enbuyuk);
		
		
		
	}
	

}
