//9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
//столбец содержит максимальную сумму.
package by.training.tutor2;

import java.util.Random;
import java.util.Scanner;

public class Main19 {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		System.out.print("enter massive range N=");
		Scanner ent = new Scanner(System.in);
		int N = ent.nextInt();
		int[][] mas = new int[0][0];
		mas = entermas(N);
		calcmas(mas);
	}

	public static int[][] entermas(int N1) {
		int[][] mas = new int[N1][N1];
		 for (int i = 0; i < mas.length; i++) {
		 for (int j = 0; j < mas.length; j++) {
		 Random rand = new Random();
		 mas[i][j] = rand.nextInt(100);
		 if (mas[i][j]<10) {
		 System.out.print(" "+mas[i][j] + " ");}
		 if (mas[i][j]>=10 & mas[i][j]<=100) {
		 System.out.print(" "+mas[i][j] + " ");}
		 }
		 System.out.println();
		 }

		// for (int i = 0; i < mas.length; i++) {
		//	for (int j = 0; j < mas[i].length; j++) {
		//	 mas[i][j] = (i * mas.length + j + 1);

		//	  if (mas[i][j] < 10) {
		//		System.out.print("  " + mas[i][j] + " ");
		//		}
		//		if (mas[i][j] >= 10 & mas[i][j] <= 100) {
		//			System.out.print(" " + mas[i][j] + " ");
		//		}
		//	}
		//	System.out.println();
		//}
		System.out.println();
		return mas;
	}

	public static void calcmas(int[][] mas1) {
		int i;
		int j=0;
			
		int sum = 0;
		int maxsum = 0;
		int maxIndex = 0;
		
		j=0;	
		for (j = 0; j < mas1.length; j++) {
			if (j<mas1.length) {
				for (i = 0; i < mas1.length; i++) {
					sum=sum+mas1[i][j];	
					} 
					System.out.println("Столбец ["+j+"]: SUMmas["+j+"]= "+sum);
					if (maxsum < sum) {
				maxsum = sum;
				maxIndex = j;
					}
					sum=0;
				}
		}
	System.out.print("Макс.сумма в ["+maxIndex+"] столбце: Sum["+maxIndex+"]= "+maxsum);
	}
}

