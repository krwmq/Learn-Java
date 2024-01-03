package keremberksenol1;

import java.util.Scanner;

public class ifelsepractice4 {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
	
		if (a>0 && a<1) {
			System.out.println("positive small number");
		}
		
		else if (a>1 && a<1000000) {
			System.out.println("positive number");
		}
		
		else if(a>1000000) {
			System.out.println("positive big number");
		}
		
		else if (a==0) {
			System.out.println("zero");
		}
		else if (a<0) {
			System.out.println("negative");
			
		}
		else {
			System.out.println("number is not in range");
		}
		
		
		
		


	}

}
