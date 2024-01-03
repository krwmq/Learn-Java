package keremberksenol1;

import java.util.Scanner;

public class recursivefunctionpractice3 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = scanner.nextInt();

        int b = Ucgen(a);
    }
    public static int Ucgen(int n) {
           if (n%2==1) {
			
		
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }

           }
           if (n%2==0) {
			
		
            for (int i = 0; i < n; i++) {
                System.out.print("-");
            }
           }
            System.out.println();
            if (n==0) {
				return 0;
			}
            
            return Ucgen(n - 1);
        
    }
	
}
