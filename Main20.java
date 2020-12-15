//10. Найти положительные (неотрицательные??) элементы главной диагонали квадратной матрицы.

package by.training.tutor2;

import java.util.Random;
import java.util.Scanner;

public class Main20 {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		System.out.print("enter massive range N=");
		Scanner ent = new Scanner(System.in);
		int N = ent.nextInt();
		double[][] mas = new double[0][0];
		mas = entermas(N);
		calcmas(mas);
	}

	public static double[][] entermas(int N1) {
		double[][] mas = new double[N1][N1];
		for (int i = 0; i < mas.length; i++) {
		for (int j = 0; j < mas.length; j++) {
		Random rand = new Random();
		double k=i;	
		mas[i][j] = Math.pow(-1, k)*rand.nextInt(99);
		
		// for (int i = 0; i < mas.length; i++) {
		//	for (int j = 0; j < mas[i].length; j++) {
		//double k=i;		
		//		mas[i][j] = Math.pow(-1, k)*(i * mas.length + j + 1);

				if (mas[i][j] < 0 & mas[i][j] > -10) {
					System.out.print("  " + mas[i][j] + " ");
				}
					if (mas[i][j] < 10 & mas[i][j] >= 0) {
				System.out.print("   " + mas[i][j] + " ");
				}
					if (mas[i][j] >= 10 & mas[i][j] <= 100) {
						System.out.print("  " + mas[i][j] + " ");
					}
					if (mas[i][j] <= -10 & mas[i][j] >= -100) {
					System.out.print(" " + mas[i][j] + " ");
				}
			}
			System.out.println();
		}
		System.out.println();
		return mas;
	}

	public static void calcmas(double[][] mas1) {
		for (int i=0; i<mas1.length; i++) {
			if (mas1[i][i]>=0) {
				System.out.println("Элемент диоганали mas["+i+"]["+i+"]= "+mas1[i][i]+">0");
			}
		}
	}
}

