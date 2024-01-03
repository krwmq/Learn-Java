package keremberksenol1;

import java.util.Scanner;

public class scannerpractice1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("enter the base value of the triangle: ");
	    int a = scanner.nextInt();

	    System.out.print("enter the height value of the triangle: ");
		int b = scanner.nextInt();
		
		
		System.out.println("triangle area:" + a*b);
		
	}

}
