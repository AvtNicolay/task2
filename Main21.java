//11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
//которых число 5 встречается три и более раз.

package by.training.tutor2;

import java.util.Random;

public class Main21 {
	public static void main(String args[]) {
		//int[][] mas = new int[5][5];
		int[][] mas = new int [10][20];
		mas = entermas(args);
		calcmas(mas);
	}

	public static int[][] entermas(String args[]) {
		//int[][] mas = new int[][] { { 5, 1, 5, 5, 4 }, { 5, 5, 5, 5, 5 }, { 5, 1, 2, 5, 0 }, { 1, 2, 3, 4, 5 },{ 5, 1, 5, 1, 5 } };
		int[][] mas = new int[10][20];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				 Random rand = new Random();
				  mas[i][j] = rand.nextInt(15);

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

	public static void calcmas(int[][] mas1) {

		int sum = 0;
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1.length; j++) {

				if (mas1[i][j] == 5) {
					sum = sum + 1;
				}
			}
			if (sum >= 3) {
				System.out.println("Строка №[" + i + "]");
			}
			 sum = 0;
		}
	}
}
