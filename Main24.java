//14. —формировать случайную матрицу m x n, состо€щую из нулей и единиц, причем в каждом столбце число
//единиц равно номеру столбца.

package by.training.tutor2;

import java.util.Arrays;
import java.util.Random;

public class Main24 {
	public static void main(String args[]) {
		entermas(args);
		}

	public static void entermas(String args[]) {
		Random rand = new Random();
		int n = rand.nextInt(10);
		int a = rand.nextInt(5);
		int m;
		m=n+a;//чтобы кол-во элементов столбца было больше его номера
		System.out.println("n="+n);
		System.out.println("m="+m);

		int[][] mas = new int[m][n];
		int sum=0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = 0;
				 if (sum!=j) {
					for (int k=0; k<j; k++) {
						mas[k][j] = 1;
						sum=sum+mas[i][j];
					}sum=0;
				}
			}
			System.out.println(Arrays.toString(mas[i]));
		}
	}
}
