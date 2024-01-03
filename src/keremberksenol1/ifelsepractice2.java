package keremberksenol1;

import java.beans.IntrospectionException;
import java.util.Scanner;

public class ifelsepractice2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
        System.out.println("Choose one: triangle 1, square 2, circle 3");
        int a = scanner.nextInt();
        
        if (a==1) {
			System.out.println("enter side length");
	    Double b = scanner.nextDouble();
	        System.out.println("enter the height");
	    Double c = scanner.nextDouble();
	        c=(c*b)/2;
	    System.out.println(c);
		}
        else if (a==2) {
			System.out.println("enter side length");
			Double d = scanner.nextDouble();
			d=d*d;
			System.out.println(d);
		}
        else {
			System.out.println("enter the radius of the circle");
	    Double  e = scanner.nextDouble();
	        e=((e*e)*3.14);
	        System.out.println(e);
		}
		
		
		
		
		

	}

}
