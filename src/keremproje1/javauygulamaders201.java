package keremproje1;

import java.util.Scanner;

public class javauygulamaders201 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. matris satır sütun uzunluğu");
		int a = scanner.nextInt();
		
		int b = scanner.nextInt();
		System.out.println("2. matris satır sütun uzunluğu");
		int c = scanner.nextInt();
		
		int d = scanner.nextInt();
		
		int toplam = 0;
		
		int[] [] matrix1 = new int[a] [b];
		
		int[] [] matrix2 = new int[c] [d];
		if (a==d) {
			
			int[] [] matrix3 = new int[a] [d];
		
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				matrix1[i][j] = scanner.nextInt();
			}
			
		}
		
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < d; j++) {
				matrix2[i][j] = scanner.nextInt();
			}
		}
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(matrix1[i][j]+" ");
			}
			System.out.println();
		}
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < d; j++) {
				System.out.print(matrix2[i][j]+" ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < a ; i++) {
			for (int j = 0; j < d; j++) {
				
			
		
		for (int i1= 0; i1 < b; i1++) {
			
				
			
		
		for (int i2 = 0; i2 < c; i2++) {
			
				
				toplam =toplam+(matrix2[i2][i]*matrix1[i][i1]);
				
			
		}
		
		matrix3[i][j] = toplam;
		toplam=0;
			
		}
		
		
			}
			}
		
		for (int i = 0; i < a ; i++) {
			for (int j = 0; j < d; j++) {
		
				System.out.print(matrix3[i][j]+" ");
				
			}
			System.out.println();
			}
		}
	
	else {
		System.out.println("Matris çarpımı mümkün değil");
	}
	

	}
}
