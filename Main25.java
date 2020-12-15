//15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
package by.training.tutor2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main25 {
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
				if (mas[i][j] < 10) {
					System.out.print("  " + mas[i][j] + " ");
				}
				if (mas[i][j] >= 10 & mas[i][j] <= 100) {
					System.out.print(" " + mas[i][j] + " ");
				}
			}
			System.out.println();
		}

		 //for (int i = 0; i < mas.length; i++) {
		 //for (int j = 0; j < mas[i].length; j++) {
		 //mas[i][j] = (i * mas.length + j + 1);

		 //if (mas[i][j] < 10) {
		 //System.out.print("  " + mas[i][j] + " ");
		 //}
		 //if (mas[i][j] >= 10 & mas[i][j] <= 100) {
		 //System.out.print(" " + mas[i][j] + " ");
		 //}
		 //}
		 //System.out.println();
		 //}
		System.out.println();
		return mas;
	 }

	public static void calcmas(int[][] mas1) {
		int max = 0;
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1[i].length; j++) {
				if (max < mas1[i][j])
					max = mas1[i][j];
			}
		}
		System.out.println("Max= " + max);
		
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1[i].length; j++) {
				if (mas1[i][j]%2!=0)
					mas1[i][j]=max;
			}
			System.out.println(Arrays.toString(mas1[i]));
		}
	}
}
