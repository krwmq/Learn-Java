package keremberksenol1;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicSeparatorUI;

public class switchcasepractice4 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the year");
		int a = scanner.nextInt();
		System.out.println("enter the month");
		int b = scanner.nextInt();
		
		switch (b){
			
			case 1:				
			case 3:				
			case 8:				
			case 5:			
			case 10:			
			case 12:
				System.out.println(b+ ". month 31 days");
				break;
			case 4:				
			case 6:
			case 9:				
			case 11:
				System.out.println(b + ". month 30 days");
				break;
			case 2:
				if (a%4==0) {
					System.out.println(b + ". month 29 days");
				}
				else {
					System.out.println(b + ". month 28 days");
				}
				
				
				
				
				
		}
		
		
		
		
		

	}

}
