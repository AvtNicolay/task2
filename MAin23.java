//13. Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов.

package by.training.tutor2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MAin23 {
	public static void main(String args[]) {
		int[][] mas = new int[0][0];
		mas = entermas(args);
		SortmasUp(mas);
		SortmasDown(mas);
	}

	public static int[][] entermas(String args[]) {
		@SuppressWarnings("resource")
		Scanner enter = new Scanner(System.in);
		int n;

		System.out.print("enter the matrix range n = ");
		while (!enter.hasNextInt())// пока в потоке не int - запрос на ввод!
		{
			System.out.print("enter the matrix range n = ");
			enter.next();// смотрим значение в потоке
		}
		n = enter.nextInt();

		int[][] mas = new int[n][n];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				Random rand = new Random();
				mas[i][j] = rand.nextInt(20);

				if (mas[i][j] < 10 & mas[i][j] >= 0) {
					System.out.print("  " + mas[i][j] + " ");
				}
				if (mas[i][j] >= 10 & mas[i][j] <= 99) {
					System.out.print(" " + mas[i][j] + " ");
				}
			}
			System.out.println();
		}
		System.out.println();
		return mas;
	}

	public static void SortmasUp(int[][] mas1) {

		int temp;
		for (int i = 0; i < mas1.length; i++) {
			for (int j = mas1[i].length - 1; j > 0; j--) {
				for (int k = 0; k < j; k++) {

					if (mas1[k][i] > mas1[k + 1][i]) {
						temp = mas1[k][i];
						mas1[k][i] = mas1[k + 1][i];
						mas1[k + 1][i] = temp;
					}
				}
				// System.out.print(" " + mas[i][j] + " ");
			}
			System.out.println(Arrays.toString(mas1[i]));
		}
		System.out.println();
	}

	public static void SortmasDown(int[][] mas1) {

		int temp;
		for (int i = 0; i < mas1.length; i++) {
			for (int j = mas1[i].length - 1; j > 0; j--) {
				for (int k = 0; k < j; k++) {

					if (mas1[k][i] < mas1[k + 1][i]) {
						temp = mas1[k][i];
						mas1[k][i] = mas1[k + 1][i];
						mas1[k + 1][i] = temp;
					}
				}
			}
			System.out.println(Arrays.toString(mas1[i]));
		}
		System.out.println();
	}
}
