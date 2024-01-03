package keremberksenol1;

import java.util.Scanner;

public class practice3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int b = 0;
		int c = 0;
		int d = 0;
		int f = 0;
		int e = 0;
		int g = 0;
		int h = 0;
		int j = 0;
		
		System.out.println("Enter a 4 digit number");
		int a =scanner.nextInt();
		
		b = (a%1000);
		c = (a%100);
		d = (a%10);
		
		f = (a-b);
        e = (f/1000);
		System.out.println(e);
		g =(a-c);
		g =((a-f)/100);
		System.out.println(g);
		h =(a-(e*1000));
		h =(h-(g*100));
		h =(h/10);
		System.out.println(h);
		j = (a%10);
		System.out.println(j);
		
		
		
	}

}
